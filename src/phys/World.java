package phys;

import agent.*;

import java.util.List;

public class World {

    private char[][] grid;

    public static int TAILLE = 10;

    public World(){

        this.grid = new char[TAILLE][TAILLE];

        for (int row = 0; row < TAILLE; row++){
            for (int column = 0; column < TAILLE; column++){
                this.grid[row][column] = '.';
            }
        }

    }
    
    /**
     * Méthode généré par IA puis modifier
     * Affiche l'état actuel du monde
     * Les agents sont représentés par des symboles spécifiques :
     * - 'P' pour les proies
     * - 'L' pour les prédateurs
     * - 'A' pour les autres agents
     * Si plusieurs agents occupent la même position, un '+' est affiché.
     *
     * @param agents   Liste des agents
     * @param gridSize Taille de la grille
     */
    /*public static void printWorldIA(List<Agent> agents, int gridSize){
        
        grid = new char[gridSize][gridSize];
        
        for (int row = 0; row < gridSize; row++){
            for (int column = 0; column < gridSize; column++){
                grid[row][column] = '.';
            }
        }

        for (Agent agent : agents){
            Position position = agent.getPos();
            int x = position.getX();
            int y = position.getY();

            if (x < 0 || x >= gridSize || y < 0 || y >= gridSize){
                continue;
            }

            char symbol = agent instanceof Proie ? 'P'
                : agent instanceof Predateur ? 'L'
                : 'A';

            grid[y][x] = grid[y][x] == '.' ? symbol : '+';
        }

        for (int row = 0; row < gridSize; row++){
            for (int column = 0; column < gridSize; column++){
                System.out.print(grid[row][column]);
            }
            System.out.println();
        }
    }*/

    public void printWorld(List<Agent> agents, int gridSize) {

        System.out.print(" ");
        for (int i = 0; i < gridSize; i++){
            System.out.print("=");
        }
        System.out.println();
        for (int row = 0; row < gridSize; row++){
            System.out.print("|");
            for (int column = 0; column < gridSize; column++){
                System.out.print(this.grid[row][column]);
            }
            System.out.println("|");
        }

        System.out.print(" ");
        for (int i = 0; i < gridSize; i++){
            System.out.print("=");
        }
    }

    /**
     * Code récupérer par IA
     * Met à jour la grille 
     * @param agents Liste des agents
     */
    public void updateWorld(List<Agent> agents){
        
        this.clearGrid();
        
        for (Agent agent : agents){
            Position position = agent.getPos();
            int x = position.getX();
            int y = position.getY();

            if (x < 0 || x > TAILLE || y < 0 || y > TAILLE){
                throw new IllegalArgumentException(String.format("Illegal Position (%d, %d)", x, y));
            }

            char symbol = agent instanceof Proie ? 'P'
                : agent instanceof Predateur ? 'L'
                : 'A';

            this.grid[y][x] = this.grid[y][x] == '.' ? symbol : '+';
        }
    }

    public void clearGrid(){
    
        for (int row = 0; row < TAILLE; row++){
            for (int column = 0; column < TAILLE; column++){
                this.grid[row][column] = '.';
            }
        }
    }
}
