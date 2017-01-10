#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <string.h>
#include <list>

void manual() {
	printf("\n");
	printf("========== NAME\n");
	printf("\n");
	printf("The WHILE executer\n");
	printf("\n");
	printf("========== SYNOPSIS\n");
	printf("\n");
	printf("whex fichier [-o file] \n");
	printf("\n\n ou \n\n");
	printf("whex --help \n");
	printf("\n");
	printf("\n");
	printf("========== DESCRIPTION\n");
	printf("\n");
	printf("Execute un fichier executable C#.\n");
	printf("\n");
	printf("========== OPTIONS\n");
	printf("\n");
	printf("========== SEE ALSO\n");
	printf("\n");
	printf("whpp\n");
	printf("\n");
	printf("whc\n");
	printf("\n");
	printf("========== AUTHORS\n");
	printf("\n");
	printf("Programme realise par Dylan BEHETRE, Yoann BOYERE, Alexis BRAULT, Mehidine CHUPEAU, Florent CATIAU-TRISTANT, Quentin OLIVIER");
	printf("\n");
	printf("\n");
	printf("==================== \n");
}

int main(int argc, char *argv[]) {

	std::string	arg_fileSrc;
	std::list<std::string> mainArgs;
				
	if (argc<2 && argc % 2 != 0) {
		manual();
		return 1;
	}


	if (strcmp("--help", argv[1]) == 0) {
		manual();
		return 1;
	}

	arg_fileSrc = argv[1];

	for (int i = 2; i<argc; i++) {
		mainArgs.push_back(argv[i]);
	}

	std::string executeLine = "\""+arg_fileSrc;
	executeLine = "\"C:/Users/Florent/Dropbox/Cours/ESIR/2A/Comp/outWHC.exe\"";
	
	for(std::list<std::string>::iterator itr = mainArgs.begin(); itr != mainArgs.end(); itr++){
		executeLine += " \"" + *itr+"\"";
	}
	executeLine += "";

	std::cout << "Executing the C# program " << executeLine.c_str() << std::endl;
	system(executeLine.c_str()); //Executing .exe args
	return 0;
}