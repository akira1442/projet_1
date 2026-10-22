package agent;

import phys.Position;

public abstract class AgentDecorator extends AgentAbstrait{

    private Agent agent;

    public AgentDecorator(Agent agent){
        
        super(agent.getName(), agent.getPos(), agent.getAge(), agent.getEnergie());
        this.agent = agent;
    }

    @Override 
    public void energyExpend(int x){

        agent.energyExpend(x);
    }

    public void move(){
        agent.move();
    }

    public Agent reproduce(Agent partner){

        return agent.reproduce(partner);
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

    public void setReproduce(int reproduce){

        agent.setReproduce(reproduce);
    }

    public void reproduceCD(){

        agent.reproduceCD();
    }

    @Override 
    public String toString(){

        return agent.toString();
    }
}