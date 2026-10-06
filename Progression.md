# Avancement du projet

## 19-20/04/2026

 * **Début du projet**, il ne possède pas de nom officiel (projet_1 par défaut). Le code est fait en **Python**, mais je pense **passer** en **Java** pour simplifier certaine chose, comme l'**implémentation de design pattern**. 
 * La **POO** en **Python** est différente de celle en **Java**, je suis perdu un peu **abstraction et interface ce confonde** c'est bizzare.
 * Le passage en Java est fort possible, mais cela il ca **risque de causer d'autres problèmes** car je souhaite **implémenter des comportements** au différents spécifique pour les **Predateur** et les **Proie**.

 ## 23/04/2026

 * Finalement on passe en **Java**. Ce sera plus simple, je touve la pobj en **Java** plus compléhensible et simple à utiliser. On a retranscrit les class **Agent**, **AgentDeplacement** et ajouter la class **Position**. Cette dernière possède une coordonnée **z** qui sera **utilisé plus tard**, en utilisant la **hauteur sur la grille**. La **classe abstraite AgentRepoduce** est envisageable, ce qui nous simplifierai la structure de notre code, ainsi que de nos Agent. Le design patern Decorator est utilisé pour implémenter les déplacement et la reproduction des **Proie** et **Prédateur**, pour ce qui est des **Arbre** ont verras plus tard, mais ce seront des **AgentStatic** possiblement.

 ## 08-09/06/2026 (22h-01h44)

 * Après une longue pause on **reprend le projet**. On a commencer à commenter/documenter le code, on a **corriger certaines méthodes** mais on a surtout commencer l'implémentation de la classe **Proie** en **Java**. Avant on a **ajouter** la classe **AgentReproduce**, **Agent** est maintenant une *interface*, et **AgentDeplacement étend AgentReproduce** qui *implémente* **Agent**. La **structure** du code a été **repensé**, mais n'est **pas encore stable**, on avance doucement, on **prend notre temps** pour avoir le **code** le plus **claire** possible. Pour la **prochaine fois** il faudrait finir le déplacement des **Proie**, et faire **tests**. Actuellement **aucun tests n'a été fait**, on commencera par des **tests unitaires**, puis des **tests plus complexes** pour testé la robustesse de notre code. Des zones de *concurrence* ont **déjà trouvé**. Aussi pour **gérer les déplacements** des **Agent**, on a créer une *classe interne* **Comportement** qui stocke les différents *comportements* pour les **Agent**. La **classe peut encore évolué** vers une classe *public* qui sera aussi utilisé par **AgentStatic** pour la *reproduction/prolifération*.

 ## 12/06/2026

 * On a corrigé le Decorator, il était très mal implémenté. Je ne sait pas encore, si il vas le garder, en tout cas je sait que si on le garde, il va falloir l'améliorer car il n'est pas encore parfait. Pour la prochaine il faut continuer, la transition au Java pour faire les premiers tests, surtout les tests unitaire.

 ## 15-16/06/2026

 * Le design pattern Decorator est cet fois vraiment corrigé. Pour la prochaine session faire la méthode positionAccessible dans AgentDeplacement, ainsi que la class World pour les tests.

 ## 26/06/2026

 * On fais une pause

 ## 25/09/2026

 * Après deux mois sans travailler on reprend le projet, j'avais pas de motivation pour travailler je devais prendre mes distance. On reprend on revoie l'arborescance du projet, on fait quelques tests. Les tests sont fait à la main tout les cas ne sont pas vérifié, mais tous fonctionnent. Il faudrait faire des tests unitaire mais j'ai un peu la flemme. En tout cas on vas essayer de essayer de bosser plus régulièrment, le Decorateur Deplacement fonctionne, on vas essayer de faire une première simulation puis tester la Reproduction.

 ## 5-6/10/2026 (nuit)

 * La on a bien avancer, la class World a été créer pour contenir tous les éléments qui composent le monde. Des modifications on été réaliser dans AgentDeplacement, et le concepte de reproduction commence à être mis en place. Pour la reproduction, on fait simple, deux agents de même type sont côte à côte et peuvent se reproduire (reproduceCD == 0), alors ils crée un nouvel agent. Plus tard des algorithme génétique seront implémenté.

 ## 6/10/2026

 * Aujourd'hui on enchaine, on a essayer de faire des tests sur la reproduction en simulation mais on je suis trop fatigué pour finir ce soir. On a factorisé le code de Predateur/Proie dans une classe AgentAbstrait, c'est mieux comme ca et ca nous évite de devoir copier coller chaque méthodes dans l'autre class. Pour la prochaine faut finir les tests de reproduction avec tests unitaire (je promet rien mais on vas essayer), aussi commenter et continuer la doc du projet. Je vais faire une petite pause j'ai beaucoup taffer en peu de temps la (promis je fais pas une pause de 2 mois et c'est la dernière parenthèse).