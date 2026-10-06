package agent;

import phys.*;

public class Predateur extends AgentAbstrait{
    
    // Variable global
    
    public static int REPRODUCE_COOLDOWN = 10;
    public static double REPRODUCE_RATE = 0.5;

    // Variable d'attribut

    // Constructeur

    public Predateur(String name, Position pos, int age, int energie){
        
        super(name, pos, age, energie);
    }

    // Méthodes 

    @Override 
    public Agent reproduce(Agent partner){

        if (this.getSexe() != partner.getSexe() && this.getEnergie() >= 50 && partner.getEnergie() >= 50){
            if (this.getReproduceCD() == 0 && partner.getReproduceCD() == 0 && Math.random() < REPRODUCE_RATE){
                Agent child = new Predateur("ChildProie", new Position(this.getPos().getX(), this.getPos().getY(), this.getPos().getZ()), 0, 100);
                
                this.energyExpend(this.getEnergie()/2);
                partner.energyExpend(partner.getEnergie()/2);
                this.setReproduce(REPRODUCE_COOLDOWN);
                partner.setReproduce(REPRODUCE_COOLDOWN);

                return child;
            }
        }
        return null;
    }

    public void move() {
        
        return;
    }

    @Override
    public String toString(){

        return "Predateur " + super.toString();
    }
}