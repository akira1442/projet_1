public abstract class AgentReproduce extends AgentDecorator{
    
    private boolean canReproduce;

    public AgentReproduce(Agent agent){
    
        super(agent);
        this.canReproduce = true;
    }

    public abstract Agent reproduce();
    
    public void reproduceCooldown() {
        
        if (!this.CanReproduce() && super.getReproduceCD() < 0){
            super.reproduceCD();
        }else{
            this.setReproduce(true);
        }
    }
    
    public boolean CanReproduce(){

        return canReproduce;
    }

    public void setReproduce(boolean repro){

        this.canReproduce = repro;
    }
}
