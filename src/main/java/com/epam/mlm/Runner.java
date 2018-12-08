package com.epam.mlm;

public class Runner {
    public static void main(String[] args) {
        Agent agent = Agent.createAgent("Smit");
        Agent agent1 = Agent.createAgent("Smit1");
        Agent agent2 = Agent.createAgent("Smit2");
        Agent agent3 = Agent.createAgent("Smit3");
        Agent agent4 = Agent.createAgent("Smit4");
        Agent agent5 = Agent.createAgent("Smit5");
        Agent agent6 = Agent.createAgent("Smit6");
        Agent agent7 = Agent.createAgent("Smit7");
        Agent agent8 = Agent.createAgent("Smit8");
        Agent agent9 = Agent.createAgent("Smit9");


        agent3.addChild(agent6, agent7, agent8);
        agent4.addChild(agent9);
        agent1.addChild(agent3, agent4);
        agent2.addChild(agent5);
        agent.addChild(agent1, agent2);
        System.out.println(agent.findChild(5));
    }
}
