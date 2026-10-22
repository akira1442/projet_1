package agent;

import java.util.List;
import java.util.stream.Stream;

import phys.*;
import func.*;

public abstract class AgentAbstrait implements Agent{
    
    // Variable gloabl

    public static int nbAgent = 0;

    // Variable d'attribut

    private final String name;
    private Position pos;
    private int age;
    private int energie;
    private final int sexe;
    private int reproduceCD;
    private final Agent[] neighbors;
    private int nbNeighbors;

    // Constructeur

    public AgentAbstrait(String name, Position pos, int age, int energie){
        
        this.name = name + nbAgent;
        this.pos = pos;
        this.age = age;
        this.energie = energie;
        this.reproduceCD = 5;
        this.sexe = (int)(Math.random() * 2);
        this.neighbors = Stream.generate(() -> null).limit(8).toArray(AgentAbstrait[]::new);
        this.nbNeighbors = 0;
        nbAgent++;
    }

    public AgentAbstrait(AgentAbstrait other){
        
        this.name = other.getName();
        this.pos = other.getPos();
        this.age = other.getAge();
        this.energie = other.getEnergie();
        this.reproduceCD = other.getReproduceCD();
        this.sexe = other.getSexe();
        this.neighbors = other.getNeigbors().clone();
        this.nbNeighbors = other.nbNeighbors();
    }

    // Méthodes 
 
    public void energyExpend(int x){

        this.energie -= x;
    }

    public void reproduceCD(){

        this.reproduceCD--;
    }

    public Agent reproduce(Agent partner){

        return null;
    }

    public void addNeighbor(Agent agent, int pos){

        this.neighbors[pos] = agent;
    }

    /**    (non-Javadoc)
     * Parcours du voisinage:
     * 3 4 5
     * 6 x 7
     * 0 1 2
     * @see agent.Agent#updateNeighbors(java.util.List)
     */
    public void updateNeighbors(List<Agent> agents){
        
        int idx = 0;
        int[] direction = {-1, 0, 1};
        
        Position pos = new Position(this.getPos());
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){ 
                if (i == 0 && j == 0){
                    continue;
                }
                pos.newPos(direction[i], direction[j], 0);
                Agent tmp = Algo.agentPosFind(agents, pos);
                if (tmp != null){
                    this.addNeighbor(tmp, idx);
                }
                idx++;
            }
        }

        int cpt = 0;
        for (int i = 0; i < this.neighbors.length; i++){
            if (this.neighbors[i] != null){
                cpt++;
            }
        }
        this.nbNeighbors = cpt;
    }

    // Getteurs/Setteurs
    
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

    public int nbNeighbors(){
        
        return this.nbNeighbors;
    }

    public Agent[] getNeigbors(){

        return this.neighbors.clone();
    }

    public void setReproduce(int reproduce){

        this.reproduceCD = reproduce;
    }

    @Override
    public String toString(){

        return String.format("%s, Position: %s, Energie: %d, Age: %d, Sexe: %d", this.name, this.getPos().toString(), this.energie, this.age, this.sexe);
    }
}
