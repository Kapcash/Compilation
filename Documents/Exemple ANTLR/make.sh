#!/bin/sh
#####################################################
#
#  make.sh permet de compiler les fichiers .java 
#  en utilisant ANTLR.
#
#  Exemple d'utilisation : ./make.sh
#
#  Pensez à modifier les droits du script :
#  chmod +x generate.sh
#
#####################################################


DIR_ANTLR=/share/m1info/comp/antlr/
export CLASSPATH=$DIR_ANTLR/antlr-3.1.3.jar:$CLASSPATH

javac *.java
