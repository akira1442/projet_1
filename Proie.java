public class Proie extends Agent{
    
    // Variable global
    
    public static int REPRODUCE_COOLDOWN = 10;
    public static double REPRODUCE_RATE = 0.5;

    // Variable d'attribut

    private int reproduceCD;
    private Position pos;
    private int age;
    private int energie;

    // Constructeur

    public Proie(Position pos, int age, int energie){
        
        this.pos = pos;
        this.age = age;
        this.energie = energie;
        this.reproduceCD = REPRODUCE_COOLDOWN;
    }

    // Méthodes 

    // Méthodes héritées

    @Override
    public void reproduceCooldown() {
        
        if (!this.CanReproduce() && this.reproduceCD < 0){
            this.reproduceCD--;
        }else{
            this.setReproduce(true);
        }
    }

    // Getteurs/Accesseurs
    
    @Override
    public int getAge() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public Proie reproduce() {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public Position getPos() {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public int getEnergie() {
        // TODO Auto-generated method stub
        return 0;
    }

}