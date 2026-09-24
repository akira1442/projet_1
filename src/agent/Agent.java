package agent;
import phys.Position;

public interface Agent{

    public String getName();
    public Position getPos();
    public int getEnergie();
    public int getAge();
    public int getSexe();
    public int getReproduceCD();
    public void reproduceCD();
    public void move();
}