#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <string.h>

void manual() {
	printf("\n");
	printf("========== NAME\n");
	printf("\n");
	printf("The WHILE pretty-printer\n");
	printf("\n");
	printf("========== SYNOPSIS\n");
	printf("\n");
	printf("whpp fichier [-o file, -all x, -for x, -while x, -if x, -foreach x, -aff -x] \n");
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
	printf("x : valeur par defaut de l'indentation, par defaut (x=1)\n\n");
	printf("-for x\n");
	printf("x : valeur par defaut de l'indentation du for, par defaut (x=0)\n\n");
	printf("-while x\n");
	printf("x : valeur par defaut de l'indentation du while, par defaut (x=0)\n\n");
	printf("-if x\n");
	printf("x : valeur par defaut de l'indentation du if, par defaut (x=0)\n\n");
	printf("-foreach x\n");
	printf("x : valeur par defaut de l'indentation du foreach, par defaut (x=0)\n\n");
	printf("-aff x\n");
	printf("x : valeur par defaut de l'indentation de l'affectation, par defaut (x=0)\n\n");
	printf("\n");
	printf("\n");
	printf("========== SEE ALSO\n");
	printf("\n");
	printf("\n");
	printf("========== AUTHORS\n");
	printf("\n");
	printf("Programme realise par Dylan BEHETRE, Yoann BOYERE, Alexis BRAULT, Mehidine CHUPEAU, Florent CATIAU-TRISTANT, Quentin OLIVIER");
	printf("\n");
	printf("\n");
	printf("==================== \n");
}

int main(int argc, char *argv[]) {

	if (argc<2 && argc % 2 != 0) {
		manual();
		return 0;
	}

	int 		arg_all = 1,
				arg_for = 0,
				arg_while = 0,
				arg_if = 0,
				arg_foreach = 0,
				arg_aff = 0,
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

		if (strcmp("-for", argv[i]) == 0) {
			arg_for = atoi(argv[i + 1]);
			continue;
		}

		if (strcmp("-while", argv[i]) == 0) {
			arg_while = atoi(argv[i + 1]);
			continue;
		}

		if (strcmp("-if", argv[i]) == 0) {
			arg_if = atoi(argv[i + 1]);
			continue;
		}

		if (strcmp("-foreach", argv[i]) == 0) {
			arg_foreach = atoi(argv[i + 1]);
			continue;
		}

		if (strcmp("-aff", argv[i]) == 0) {
			arg_aff = atoi(argv[i + 1]);
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

	std::string cmdLine = "java -jar whpp.jar " + arg_fileSrc;
	cmdLine += " " + arg_fileDest;
	cmdLine += " " + std::to_string(arg_all);
	cmdLine += " " + std::to_string(arg_for);
	cmdLine += " " + std::to_string(arg_while);
	cmdLine += " " + std::to_string(arg_if);
	cmdLine += " " + std::to_string(arg_foreach);
	cmdLine += " " + std::to_string(arg_aff);

	if (debug) {
		std::cout << "CMD : " << cmdLine << std::endl;
		std::cout << "ALL : " << arg_all << std::endl;
		std::cout << "FOR : " << arg_all << std::endl;
		std::cout << "WHILE : " << arg_all << std::endl;
		std::cout << "IF : " << arg_all << std::endl;
		std::cout << "FOREACH : " << arg_all << std::endl;
		std::cout << "AFF : " << arg_all << std::endl;
		std::cout << std::endl;
	}
	
	int status = system(cmdLine.c_str());
		
	return status;
}