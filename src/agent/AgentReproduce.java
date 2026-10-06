package agent;

public class AgentReproduce extends AgentDecorator{


    public AgentReproduce(Agent agent){
    
        super(agent);
    }

    public Agent reproduce(Agent partner){

        if (this.getSexe() != partner.getSexe() && this.getEnergie() > 50 && partner.getEnergie() > 50){
            if (this.getReproduceCD() == 0 && partner.getReproduceCD() == 0){
                Agent child = this.
            }
        }
    }
    
    
}
