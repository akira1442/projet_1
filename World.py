import random as r
import Proie

_liste_Proie_ = [Proie( (r.randint(0,9), r.randint(0,9)) )]
_liste_Predateur = list()

grille = [ [" " for j in range(10)] for i in range(10)]

for proie,predateur in _liste_Proie_,_liste_Predateur:
    proieX,proieY = proie.getPos()
    predateurX,predateurY = predateur.getPos()
    grille[predateurX][predateurY] = "x"
    grille[proieX][proieY] = "o"
    
for iteration in range(100):
    pass
