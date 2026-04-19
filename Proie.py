import random

import Agent
from typing import Tuple

__reproduce_cooldown__ = 10
__reproduce_rate__ = 0.5

class Proie(Agent):
    
    def __init__(self, pos):
        
        super().__init__(pos)
        self.reproduce_CD = __reproduce_cooldown__

    def reproduce(self, other):
        
        if self.sexe != other.sexe and self.can_reproduce and other.canreproduce and random.random() < __reproduce_rate__:
            self.can_reproduce = False
            other.can_reproduce = False
            self.reproduce_CD = __reproduce_cooldown__
            return Proie(self.pos)
        return None
    
    def reproduce_cooldown(self):
        
        if not self.can_reproduce:
            if self.reproduce_CD < 0:
                self.reproduce_CD -= 1
                return
            else:
                self.can_reproduce = True
    
    def move(self):
    
        """_summary_
        Les predateurs se déplacent en utilisant le voisinage de Moore
        Déplacement dans 8 directions adjacentes
        """
    
        neighbors = Agent.moore_neighborhood(self.pos, 36)
        self.pos = random.choice(neighbors)
     