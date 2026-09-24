package agent;

import phys.*;

public class Predateur implements Agent{
    
    // Variable global
    
    public static int REPRODUCE_COOLDOWN = 10;
    public static double REPRODUCE_RATE = 0.5;

    // Variable d'attribut

    private String name;
    private Position pos;
    private int age;
    private int energie;
    private int sexe;
    private int reproduceCD;

    // Constructeur

    public Predateur(String name, Position pos, int age, int energie){
        
        this.name = name;
        this.pos = pos;
        this.age = age;
        this.energie = energie;
        this.reproduceCD = REPRODUCE_COOLDOWN;
        this.sexe = (int)(Math.random() * 2);
    }

    // Méthodes 

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

    @Override
    public void move() {
        
        
    }
}