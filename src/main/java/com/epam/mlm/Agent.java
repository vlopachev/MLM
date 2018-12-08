package com.epam.mlm;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Agent {
    private static long counterId;
    private long id;
    private long parentId;
    private String name;
    private Set<Agent> children = new HashSet<>();

    public Agent() {
        id = ++counterId;
    }

    public Agent(String name) {
        this();
        this.name = name;
    }

    public static Agent createAgent(String name) {
        return new Agent(name);
    }

    public void addChild(Agent... agents) {
        for (Agent agent : agents) {
            agent.setParentId(id);
            children.add(agent);
        }
    }

    public long getId() {
        return id;
    }

    public long getParentId() {
        return parentId;
    }

    public String getName() {
        return name;
    }

    public Set<Agent> getChildren() {
        return children;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChildren(Set<Agent> children) {
        this.children = children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agent agent = (Agent) o;
        return id == agent.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public String toString() {
        return "Agent{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", name='" + name + '\'' +
                '}';
    }

    public Agent findChild(int id) {
        Agent agent = null;
        for (Agent child : children) {
            if (child.getId() == id) {
                agent = child;
                break;
            }
        }
        for (Agent child : children) {
            if (agent != null) {
                break;
            }
            child.findChild(id);
        }
        return agent;
    }


}
