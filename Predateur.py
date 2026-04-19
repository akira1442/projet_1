import random
from AgentDeplacement import AgentDeplacement as AD

__reproduce_cooldown__ = 12
__reproduce_rate__ = 0.35

class Predateur(AD):
    
    def __init__(self, pos):
        
        super().__init__(pos)
        self.reproduce_CD = __reproduce_cooldown__
    
    def reproduce(self, other):
        
        if self.sexe != other.sexe and self.can_reproduce and other.canreproduce and random.random() < __reproduce_rate__:
            self.can_reproduce = False
            other.can_reproduce = False
            self.reproduce_CD = __reproduce_cooldown__
            return Predateur(self.pos)
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
        Les proies se déplacent en utilisant le voisinage de Moore
        Déplacement dans 8 directions adjacentes
        """
    
        neighbors = AD.moore_neighborhood(self.pos, 36)
        self.pos = random.choice(neighbors)
        
    def eat(self):
        return super().eat()