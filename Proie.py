import Agent
from typing import Tuple

def moore_neighborhood(pos: Tuple[int, int], grid_size: int):
    
    """_summary_
    Generate with IA
    Returns:
        _type_: _description_
    """
    x, y = pos
    neighbors = []
    for dx in [-1, 0, 1]:
        for dy in [-1, 0, 1]:
            if dx == 0 and dy == 0:  # Ignorer la position actuelle
                continue
            nx, ny = x + dx, y + dy
            if 0 <= nx < grid_size and 0 <= ny < grid_size:
                neighbors.append((nx, ny))
    return neighbors

__reproduce_cooldown__ = 10
__reproduce_rate__ = 0.5

class Proie(Agent):
    
    def __init__(self, pos):
        
        super().__init__(pos)
        self.reproduce_CD = __reproduce_cooldown__

    def reproduce(self, other):
        
        if self.sexe != other.sexe and self.can_reproduce and other.canreproduce:
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
    
    def move(self, depl):
    
        """_summary_
        Les proies se déplacent en utilisant le voisinage de Moore
        Déplacement dans 8 directions adjacentes
        """
    
        neighbors = moore_neighborhood(self.pos, 36)
        for neighbor in neighbors:
            if self.can_reproduce:
                self.can_reproduce = False
                self.reproduce_CD = __reproduce_cooldown__
                return Proie(neighbor)
        return None