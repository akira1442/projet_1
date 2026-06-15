public abstract class AgentReproduce extends AgentDecorator{
    
    protected Position pos;
    /**
     * @param sexe 1 Male 0 Femelle
     */
    private int sexe;
    private boolean canReproduce;

    public AgentReproduce(Position pos){
        super(pos);
        this.sexe = (int)(Math.random() * 2);
        this.canReproduce = true;
    }

    public abstract Agent reproduce();
    public abstract void reproduceCooldown();
    
    public boolean CanReproduce(){

        return canReproduce;
    }

    public void setReproduce(boolean repro){

        this.canReproduce = repro;
    }

    public int getSexe(){

        return this.sexe;
    }
}
