import random
from abc import ABC, abstractmethod
from typing import Tuple

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