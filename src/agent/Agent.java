package agent;

import java.util.List;

import phys.Position;

public interface Agent{

    public String getName();
    public Position getPos();
    public int getEnergie();
    public int getAge();
    public int getSexe();
    public Agent reproduce(Agent partner);
    public int getReproduceCD();
    public Agent[] getNeighbors();
    public void reproduceCD();
    public void setReproduce(int reproduce);
    public void move();
    public void updateNeighbors(List<Agent> agents);
    public void energyExpend(int x);
}