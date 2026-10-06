package agent;

import phys.*;

public class Proie implements Agent{
    
    // Variable global
    
    public static int REPRODUCE_COOLDOWN = 10;
    public static double REPRODUCE_RATE = 0.5;
    public static int nbProie = 0; 

    // Variable d'attribut

    private String name;
    private Position pos;
    private int age;
    private int energie;
    private int sexe;
    private int reproduceCD;

    // Constructeur

    public Proie(String name, Position pos, int age, int energie){
        
        this.name = name+nbProie;
        this.pos = pos;
        this.age = age;
        this.energie = energie;
        this.reproduceCD = REPRODUCE_COOLDOWN;
        this.sexe = (int)(Math.random() * 2);
        nbProie++;
    }

    // Méthodes 

    @Override 
    public void energyExpend(int x){

        this.energie -= x;
    }

    @Override
    public void move() {
        
        return;
    }

    @Override 
    public Agent reproduce(Agent partner){

        if (this.getSexe() != partner.getSexe() && this.getEnergie() > 50 && partner.getEnergie() > 50){
            if (this.getReproduceCD() == 0 && partner.getReproduceCD() == 0 && Math.random() < REPRODUCE_RATE){
                Agent child = new Proie("ChildProie", new Position(this.getPos().getX(), this.getPos().getY(), this.getPos().getZ()), 0, 100);
                
                this.energyExpend(this.getEnergie()/2);
                partner.energyExpend(partner.getEnergie()/2);
                this.reproduceCD();
                partner.reproduceCD();

                return child;
            }
        }
        return null;
    }

    public void reproduceCD(){

        this.reproduceCD--;
    }
    
    // Getteurs/Accesseurs
    
    public String getName(){

        return this.name;
    }
    public int getAge() {
        
        return this.age;
    }
    
    public Position getPos() {
        
        return this.pos;
    }
    
    public int getEnergie() {
        
        return this.energie;
    }

    public int getSexe(){

        return this.sexe;
    }

    public int getReproduceCD(){

        return this.reproduceCD;
    }

    @Override
    public String toString(){

        return String.format("%s, Position: %s, Energie: %d, Age: %d, Sexe: %d", this.name, this.getPos().toString(), this.energie, this.age, this.sexe);
    }
}