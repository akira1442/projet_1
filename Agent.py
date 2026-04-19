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
        self.age = 0
        self.energie = 100
        
    def getPos(self):
        return self.pos
    
    @abstractmethod
    def reproduce(self, other):
        pass
    
    @abstractmethod
    def reproduce_cooldown(self):
        pass