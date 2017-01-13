# Compilation
Projet de compilation du langage WHILE vers C#

Réalisé par Florent Catiau-Tristant, Yoann Boyère, Mehidine Chupeau, Alexis Brault, Dylan Behêtre et Quentin Olivier.

# Principe

L'objectif de ce projet scolaire d'ESIR 2 est de créer un compilateur pour le langage formel WHILE (spécifications du langage dans le répertoire Documents > Cours > Specification_WHILE.pdf) afin de rendre ses programmes exécutables.
Pour cela, nous devons traduire les programmes dans un autre langage cible (ici C#) exécutable.

# Fonctionnement

## Pretty Printer

La première partie du projet fut de concevoir un "pretty printer" (comprenez un afficheur de code proprement formaté).
Celui-ci se lance via le script "whpp.exe" de la façon suivante :
`whpp.exe exemples/demopp.wh -o exemples/demopp.whpp`
Cette commande va créer un fichier demopp.whpp, qui sera la copie exacte du fichier demopp.wh à la différence qu'il sera affiché de façon lisible et non désordonnée.

## Compilateur

Le compilateur permet de traduire un programme .wh en exécutable C#.
Il fonctionne comme suit :  
`whc.exe exemples/calc.wh -o calc.cs -e calc.exe`  
Cela va créer un fichier calc.cs, qui sera la traduction directe du code While en C#. Puis le script compile cette source C# en l'exécutable calc.exe. Il suffit ensuite de lancer cet exécutable, avec éventuellement des paramètres :  
`calc.exe multiplication 3 3`  

# Organisation du dépôt git

|-- BinTreeProject  : Project Visual Studio C# pour la librairie BinTree  
|-- Documents       : Documents divers (rapports, supports de présentations, cours)  
|-- esir.compilation : Project Xtext + Java Eclipse pour la création du compilateur  
|-- exemples        : répertoire des exemples de programmes While .wh  
|-- Scripts         : Sources des scripts C++ de lancement des commandes (Pretty Printer et Compilateur)  
|-- whc_lib         : librairie java externe pour le lancement du compilateur  
|-- whpp_lip        : librairie java externe pour le lancement du pretty printer  
\`-- whc.exe         : Script de lancement du compilateur  
\`-- whc.jar         : Jar permettant l'exécution du compilateur  
\`-- whpp.exe        : Script de lancement du pretty printer  
\`-- whpp.jar        : Jar permettant l'exécution du pretty printer  

# Crédits

Cours : Olivier Ridoux

2016-2017
ESIR spécialité "Système d'Information"
