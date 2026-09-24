package agent;

import phys.Position;
import java.util.ArrayList;
import java.util.Arrays;

public class AgentDeplacement extends AgentDecorator{

    private class Comportement{

        public void mooreNeighborhood(Position pos, int gridSize){

            int indice = 0;

            for (int dx : DIRECTION){
                for (int dy : DIRECTION){
                    if (dx == 0 && dy == 0){
                        continue;
                    }
                    // TODO #1 méthode accessPosition dans Position
                    int nx = pos.getX() + dx;
                    int ny = pos.getY() + dy;
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
    }
    
    /**
     * @param neighbors Tableau des cases voisines accessible
     */
    private Position[] neighbors;
    /**
     * @param DIRECTION Contient les direction normée pour se déplacer dans la grille.
     * Valeurs: -1 0 1
     */
    public static final ArrayList<Integer> DIRECTION = new ArrayList<>(Arrays.asList(-1, 0, 1)); 
    public static int GRIDSIZE = 50;

    /**
     * @param pos 
     * Constructeur de base
     */
    public AgentDeplacement(Agent agent) {
        
        super(agent);
        this.neighbors = new Position[8];
    }

    /**
     * Méthode utilisé pour se déplacer dans la grille
     * Les agents n'auront pas les même algorithmes de déplacement en fonction de type et/ou comportement
     * @param pos
     * @param gridSize
     */
    public void move(){
        
        Comportement c = new Comportement();
        c.mooreNeighborhood(getPos(), GRIDSIZE);
        super.getPos().newPos(neighbors[(int)(Math.random() * 8)]);
    }

    /**
     * Renvoie true si la position est accessible
     * Une position est accessible quand il n'a pas d'obstacle sur la position donné, et que la position est à une hauteur accessible
     * @param p
     * @return 
     */
    public boolean positionAccessible(Position p){
        
        return true;
    }

    public Position[] getNeighbors() {
        return neighbors;
    }
}