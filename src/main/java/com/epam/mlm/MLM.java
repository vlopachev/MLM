package com.epam.mlm;

public class MLM {
    private Agent agent;

    public MLM(Agent agent) {
        this.agent = agent;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Agent findAgent(int id){
        if (agent != null && agent.getId() == id){
            return agent;
        }
        if (agent.findChild(id) != null){
            return agent.findChild(id);
        }


        return null;
    }

}
