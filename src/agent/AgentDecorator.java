package agent;

import phys.Position;

public abstract class AgentDecorator implements Agent{

    private Agent agent;

    public AgentDecorator(Agent agent){
        
        this.agent = agent;
    }

    public void move(){
        this.agent.move();
    }

    public String getName(){

        return agent.getName();
    }

    public Position getPos(){
        
        return agent.getPos();
    }

    public int getEnergie(){
        
        return agent.getEnergie();
    }

    public int getAge(){

        return agent.getAge();
    }

    public int getSexe(){

        return agent.getSexe();
    }

    public int getReproduceCD(){

        return agent.getReproduceCD();
    }

    public void reproduceCD(){

        agent.reproduceCD();
    }

    @Override 
    public String toString(){

        return agent.toString();
    }
}