import random as r
from Proie import Proie
from Predateur import Predateur

_liste_Proie_ = [Proie( (r.randint(0,9), r.randint(0,9)) ) for i in range(2)]
_liste_Predateur = [Predateur((r.randint(0,9), r.randint(0,9))) for i in range(2)]

grille = [ [" " for j in range(10)] for i in range(10)]

def affiche_grille():
    
    for i in range(len(grille)):
        for j in range(len(grille)):
            print(grille[i][j])
    print("======================================\n\n")
    
for proie,predateur in _liste_Proie_,_liste_Predateur:
    proieX,proieY = proie.getPos()
    predateurX,predateurY = predateur.getPos()
    grille[predateurX][predateurY] = "x"
    grille[proieX][proieY] = "o"
    
for iteration in range(100):
    print("iteration: %d".format(iteration))
    for proie,predateur in _liste_Proie_,_liste_Proie_:
        proie.move()
        proieX,proieY = proie.getPos()
        predateurX,predateurY = predateur.getPos()
        grille[predateurX][predateurY] = "x"
        grille[proieX][proieY] = "o"
        predateur.move()
        affiche_grille()
        
print("FIN")
exit(1)
