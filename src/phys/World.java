package phys;
import java.util.ArrayList;
import java.util.List;

import agent.Agent;
import agent.AgentDeplacement;
import agent.Predateur;
import agent.Proie;

public class World {
    
    private final List<Agent> listAgent = new ArrayList<>();
    private int nbProie, nbPredateur;

    /**Taille de la grille */
    public static int TAILLE = 50;

    public World(int nbProie, int nbPredateur){

        this.nbProie = nbProie;
        this.nbPredateur = nbPredateur;

        for (int i = 0; i < nbProie; i++){
            listAgent.add(new Proie("Poule"+i, new Position(), 0, 100));
        }

        for (int i = 0; i < nbPredateur; i++){
            listAgent.add(new Predateur("Poule"+i, new Position(), 0, 100));
        }
    }

    public void log(){

        for (Agent a : listAgent){
            System.out.println(a.toString());
        }
    }

    public void run(){

        while (true){

            for (Agent a : listAgent){
                AgentDeplacement ad = new AgentDeplacement(a);
                ad.move();
            }
        }
    }
}
