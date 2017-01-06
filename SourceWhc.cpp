#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <string>

void manual() {
	printf("\n");
	printf("========== NAME\n");
	printf("\n");
	printf("The WHILE compiler\n");
	printf("\n");
	printf("========== SYNOPSIS\n");
	printf("\n");
	printf("whc fichier [-o file] \n");
	printf("\n\n ou \n\n");
	printf("whc --help \n");
	printf("\n");
	printf("\n");
	printf("========== DESCRIPTION\n");
	printf("\n");
	printf("Compile un fichier d'entrée WHILE en fichier de sortie C#.\n");
	printf("\n");
	printf("========== OPTIONS\n");
	printf("\n");
	printf("-o file\n");
	printf("file : nom du fichier de sortie\n\n");
	printf("\n");
	printf("\n");
	printf("========== SEE ALSO\n");
	printf("\n");
	printf("whpp\n");
	printf("\n");
	printf("========== AUTHORS\n");
	printf("\n");
	printf("Programme realise par Dylan BEHETRE, Yoann BOYERE, Alexis BRAULT, Mehidine CHUPEAU, Florent CATIAU, Quentin OLIVIER");
	printf("\n");
	printf("\n");
	printf("==================== \n");
}

int main(int argc, char *argv[]) {

	if (argc<2 && argc % 2 != 0) {
		manual();
		return 0;
	}

	std::string	arg_fileSrc,
				arg_fileDest = "sth.whpp";

	if (strcmp("--help", argv[1]) == 0) {
		manual();
		return 0;
	}

	arg_fileSrc = argv[1];

	int i = 0;
	for (i = 2; i<argc; i = i + 2) {
		if (strcmp("-o", argv[i]) == 0) {
			arg_fileDest = argv[i + 1];
			continue;
		}

	}

	std::string cmdLine = "java -jar whilec.jar " + arg_fileSrc;
	cmdLine += " " + arg_fileDest;
	
	int status = system(cmdLine.c_str());
		
	return status;
}