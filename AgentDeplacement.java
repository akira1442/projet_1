import java.util.ArrayList;
import java.util.Arrays;

public abstract class AgentDeplacement extends Agent{

    private int sexe;
    private Position[] neighbors;
    public static final ArrayList<Integer> DIRECTION = new ArrayList<>(Arrays.asList(-1, 0, 1)); 

    public AgentDeplacement(Position pos) {
        
        super(pos);
        this.sexe = (int)(Math.random() * 2);
        this.neighbors = new Position[8];
    }

    private void mooreNeighborhood(Position pos, int gridSize){

        int indice = 0;

        for (int dx : DIRECTION){
            for (int dy : DIRECTION){
                if (dx == 0 && dy == 0){
                    continue;
                }
                // TODO #1 méthode accessPosition dans Position
                int nx = this.getPos().getX() + dx;
                int ny = this.getPos().getY() + dy;
                if ((nx < gridSize) && (ny < gridSize)){
                    try{
                        neighbors[indice] = new Position(nx, ny, 0);
                        indice++;
                    }catch(IndexOutOfBoundsException e){
                        System.out.println(String.format("%s, indice = %d", e, indice));
                    }
                }
            }
        }
    }
    
    @Override
    public void reproduce() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reproduce'");
    }

    @Override
    public void reproduceCooldaown() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reproduceCooldaown'");
    }

    public int getSexe() {
        return sexe;
    }

    public Position[] getNeighbors() {
        return neighbors;
    }

    public abstract void move();
}