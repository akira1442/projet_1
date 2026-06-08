# Avancement du projet

## 19-20/04/2026

 * **Début du projet**, il ne possède pas de nom officiel (projet_1 par défaut). Le code est fait en **Python**, mais je pense **passer** en **Java** pour simplifier certaine chose, comme l'**implémentation de design pattern**. 
 * La **POO** en **Python** est différente de celle en **Java**, je suis perdu un peu **abstraction et interface ce confonde** c'est bizzare.
 * Le passage en Java est fort possible, mais cela il ca **risque de causer d'autres problèmes** car je souhaite **implémenter des comportements** au différents spécifique pour les **Predateur** et les **Proie**.

 ## 23/04/2026

 * Finalement on passe en **Java**. Ce sera plus simple, je touve la pobj en **Java** plus compléhensible et simple à utiliser. On a retranscrit les class **Agent**, **AgentDeplacement** et ajouter la class **Position**. Cette dernière possède une coordonnée **z** qui sera **utilisé plus tard**, en utilisant la **hauteur sur la grille**. La **classe abstraite AgentRepoduce** est envisageable, ce qui nous simplifierai la structure de notre code, ainsi que de nos Agent. Le design patern Decorator est utilisé pour implémenter les déplacement et la reproduction des **Proie** et **Prédateur**, pour ce qui est des **Arbre** ont verras plus tard, mais ce seront des **AgentStatic** possiblement.

 ## 08-09/06/2026 (22h-01h44)

 * Après une longue pause on **reprend le projet**. On a commencer à commenter/documenter le code, on a **corriger certaines méthodes** mais on a surtout commencer l'implémentation de la classe **Proie** en **Java**. Avant on a **ajouter** la classe **AgentReproduce**, **Agent** est maintenant une *interface*, et **AgentDeplacement étend AgentReproduce** qui *implémente* **Agent**. La **structure** du code a été **repensé**, mais n'est **pas encore stable**, on avance doucement, on **prend notre temps** pour avoir le **code** le plus **claire** possible. Pour la **prochaine fois** il faudrait finir le déplacement des **Proie**, et faire **tests**. Actuellement **aucun tests n'a été fait**, on commencera par des **tests unitaires**, puis des **tests plus complexes** pour testé la robustesse de notre code. Des zones de *concurrence* ont **déjà trouvé**. Aussi pour **gérer les déplacements** des **Agent**, on a créer une *classe interne* **Comportement** qui stocke les différents *comportements* pour les **Agent**. La **classe peut encore évolué** vers une classe *public* qui sera aussi utilisé par **AgentStatic** pour la *reproduction/prolifération*.