import random
from abc import ABC, abstractmethod
from typing import Tuple

def moore_neighborhood(pos: Tuple[int, int], grid_size: int):
    
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

class Agent(ABC):
    
    """_summary_
        @Agent class abtraite
        @param pos : Tuple[int,int]
    """
    def __init__(self, pos:Tuple[int, int]):
        
        self.pos = pos
        self.sexe = random.randint(0, 1)
        self.age = 0
        self.energie = 100
        self.can_reproduce = False
        
    def getPos(self):
        return self.pos
    
    @abstractmethod
    def move(self):
        pass
    
    @abstractmethod
    def eat(self):
        pass
    
    @abstractmethod
    def reproduce(self, other):
        pass
    
    @abstractmethod
    def reproduce_cooldown(self):
        pass