
public abstract class Agent{

    private Position pos;
    private boolean canReproduce;
    private int energie;
    private int age;

    public Agent(Position pos) {

        this.pos = pos;
        this.canReproduce = false;
        this.age = 0;
        this.energie = 100;
    }

    public Position getPos(){
        return this.pos;
    }

    public boolean isCanReproduce() {
        return canReproduce;
    }

    public int getEnergie() {
        return energie;
    }

    public int getAge() {
        return age;
    }

    public abstract void reproduce();
    public abstract void reproduceCooldaown();
}