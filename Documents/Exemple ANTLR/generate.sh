#!/bin/sh
#####################################################
#
#  generate.sh permet de générer à partir d'un fichier.g
#  les fichiers de l'analyseur en utilisant ANTLR.
#
#  Exemple d'utilisation : ./generate.sh fichier.g
#
#  Pensez à modifier les droits du script :
#  chmod +x generate.sh
#
#####################################################

if test "$1" = ""
    then
    echo "usage: generate.sh file.g"
    exit 1;
    fi

DIR_ANTLR=/share/m1info/comp/antlr/
export CLASSPATH=$DIR_ANTLR/antlr-3.1.3.jar:$CLASSPATH

java org.antlr.Tool $1
