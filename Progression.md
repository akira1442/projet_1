# Avancement du projet

## 19-20/04/2026

 * **Début du projet**, il ne possède pas de nom officiel (projet_1 par défaut). Le code est fait en **Python**, mais je pense **passer** en **Java** pour simplifier certaine chose, comme l'**implémentation de design pattern**. 
 * La **POO** en **Python** est différente de celle **Java**, je suis perdu un peu **abstraction et interface ce confonde** c'est bizzare.
 * Le passage en Java est fort possible, mais cela il ca **risque de causer d'autres problèmes** car je souhaite **implémenter des comportements** au différents spécifique pour les **Predateur** et les **Proie**.

 ## 23/04/2026

 * Finalement on passe en **Java**. Ce sera plus simple, je touve la pobj en **Java** plus compléhensible et simple à utiliser. On a retranscrit les class **Agent**, **AgentDeplacement** et ajouter la class **Position**. Cette dernière possède une coordonnée **z** qui sera **utilisé plus tard**, en utilisant la **hauteur sur la grille**. La **classe abstraite AgentRepoduce** est envisageable, ce qui nous simplifierai la structure de notre code, ainsi que de nos Agent. Le design patern Decorator est utilisé pour implémenter les déplacement et la reproduction des **Proie** et **Prédateur**, pour ce qui est des **Arbre** ont verras plus tard, mais ce seront des **AgentStatic** possiblement.