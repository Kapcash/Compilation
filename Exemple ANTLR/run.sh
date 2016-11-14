#!/bin/sh
################################################################
#
#  run.sh permet d'exécuter un programme java utilisant ANTLR.
#
#  Exemple d'utilisation : ./run.sh programme [param1] [param2]
#
#  Pensez à modifier les droits du script :
#  chmod +x make.sh
#
################################################################

if test "$1" = ""
    then
    echo "usage: run.sh prog_name without .class [param1] [param2] "
    exit 1;
    fi


DIR_ANTLR=/share/m1info/comp/antlr/
export CLASSPATH=$DIR_ANTLR/antlr-3.1.3.jar:$CLASSPATH

java $1 $2 $3
