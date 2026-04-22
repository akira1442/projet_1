
public class Position {

    private int x;
    private int y;
    private int z;

    
    /**
     * @param x Coordonnée abscice int
     * @param y Coordonnée ordonnée int
     * @param z Coordonnée hauteur int
     */
    public Position(int x, int y, int z){

        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Constucteur de l'Origine
     * @return Position(0,0,0)
     */
    public static Position Origine(){

        return new Position(0, 0, 0);
    }

    public boolean accessPosition(int x, int y, int z){
        return true;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getZ() {
        return z;
    }
}
