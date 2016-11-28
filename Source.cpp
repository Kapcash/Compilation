#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <string>

void manual() {
	printf("\n");
	printf("========== NAME\n");
	printf("\n");
	printf("The WHILE pretty-printer\n");
	printf("\n");
	printf("========== SYNOPSIS\n");
	printf("\n");
	printf("whpp fichier [-o file, -all x, -if x] \n");
	printf("\n\n ou \n\n");
	printf("whpp --help \n");
	printf("\n");
	printf("\n");
	printf("========== DESCRIPTION\n");
	printf("\n");
	printf("Lit un fichier while syntaxiquement correct et rend le même fichier mais joliment composé.\n");
	printf("\n");
	printf("========== OPTIONS\n");
	printf("\n");
	printf("-o file\n");
	printf("file : nom du fichier de sortie, par defaut (sth.whpp)\n\n");
	printf("-all x\n");
	printf("x : valeur par defaut de l'indentation, par defaut (x=2)\n\n");
	printf("\n");
	printf("\n");
	printf("========== SEE ALSO\n");
	printf("\n");
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

	int 		arg_all = 2,
				arg_if = 0,
				debug = 0;
	std::string	arg_fileSrc,
				arg_fileDest = "sth.whpp";

	if (strcmp("--help", argv[1]) == 0) {
		manual();
		return 0;
	}

	arg_fileSrc = argv[1];

	int i = 0;
	for (i = 2; i<argc; i = i + 2) {

		if (strcmp("-all", argv[i]) == 0) {
			arg_all = atoi(argv[i + 1]);
			continue;
		}

		if (strcmp("-o", argv[i]) == 0) {
			arg_fileDest = argv[i + 1];
			continue;
		}

		if (strcmp("-debug", argv[i]) == 0) {
			debug = atoi(argv[i + 1]);
			continue;
		}

	}

	std::string cmdLine = "java -jar whilepp2.jar " + arg_fileSrc + " " + arg_fileDest + " "+ std::to_string(arg_all);
	if (debug) {
		std::cout << "CMD : " << cmdLine << std::endl;
		std::cout << "ALL : " << arg_all << std::endl;
		std::cout << std::endl;
	}
	
	int status = system(cmdLine.c_str());

	int result;
	char oldname[] = "Result_output.whpp";
	result = rename(oldname, arg_fileDest.c_str());
	if (result != 0) {
		std::cout << "Erreur" << std::endl;
	}
		
	return 0;
}