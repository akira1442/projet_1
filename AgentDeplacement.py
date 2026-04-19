import random as r

from abc import ABC, abstractmethod
from Agent import Agent

class AgentDeplacement(ABC, Agent):
    
    def __init__(self, pos):
        super().__init__(pos)
        self.sexe = r.randint(0, 1)
        self.can_reproduce = False
        
    @abstractmethod
    def move(self):
        pass
    
    def moore_neighborhood(pos: tuple[int, int], grid_size: int):

        """_summary_
        Generate with IA
        Returns: Liste des cases accessibles
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