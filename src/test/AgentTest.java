package test;

import agent.*;
import phys.Position;

public class AgentTest {
    public static void main(String[] args){

        Agent proie1 = new Proie("poule", new Position(), 0, 100);
        Agent pred1 = new Predateur("loup", new Position(), 0, 100);

        System.out.println(proie1.toString());
        System.out.println(pred1.toString());

        proie1 = new AgentDeplacement(proie1);
        pred1 = new AgentDeplacement(pred1);
        
        proie1.move();
        pred1.move();

        System.out.println(proie1.toString());
        System.out.println(pred1.toString());
    }
}
