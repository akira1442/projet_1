package test;

import java.util.ArrayList;
import java.util.List;

import agent.*;
import phys.Position;
import phys.World;

public class SimuTests {
    public static void main(String[] args) {
        
        List<Agent> listAgent = new ArrayList<>();
        int nbProie = 1, nbPredateur = 1;

        /*Taille de la grille */
        int TAILLE = World.TAILLE;

        /*Init Proie */
        for (int i = 0; i < nbProie; i++){
            listAgent.add(new Proie("Poule", new Position(), 0, 100));
        }

        /*Init Prédateur */
        for (int i = 0; i < nbPredateur; i++){
            listAgent.add(new Predateur("Loup", new Position(), 0, 100));
        }
        
        int[] direction = {-1,0,1};
        
        /*Init Neighbors */
        for (Agent agent : listAgent){
            agent.updateNeighbors(listAgent);
        }

        int indice = 0;

        World world = new World();

        while (true && (indice != 10)){
            
            // Boucle de traitement des actions des agents
            // TODO executer la boucle en parrallel
            for (Agent tmp : listAgent){
                // #1 Deplacement
                Agent a = new AgentDeplacement(tmp);
                a.move();
                System.out.println(a.toString());

                // #2 Reproduction
                //Agent[] partners = Stream.generate(() -> ); 
            }
            world.updateWorld(listAgent);
            world.printWorld(listAgent, TAILLE);
            System.out.println();
            
            indice++;
        }
    }
}
