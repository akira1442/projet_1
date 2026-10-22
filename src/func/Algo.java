package func;

import agent.*;
import phys.*;

import java.util.List;

public class Algo{

    public static Agent agentPosFind(List<Agent> agents, Position pos){

        for (Agent agent : agents){
            if (agent.getPos().equals(pos)){
                return agent;
            }
        }
        return null;
    }
}
