#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <string.h>
#include <list>

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
	printf("Programme realise par Dylan BEHETRE, Yoann BOYERE, Alexis BRAULT, Mehidine CHUPEAU, Florent CATIAU-TRISTANT, Quentin OLIVIER");
	printf("\n");
	printf("\n");
	printf("==================== \n");
}

int main(int argc, char *argv[]) {

	std::string	arg_fileSrc,
				arg_fileDest = ".\\BinTreeProject\\BinTreeProject\\BinTree.cs";
	std::list<std::string> mainArgs;
	bool execute = false;
				
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
		if (strcmp("-o", argv[i]) == 0) {
			arg_fileDest = argv[i + 1];
			i++;
			continue;
		}
		if(strcmp("-e",argv[i]) == 0){
			execute = true;
			continue;
		}
		mainArgs.push_back(argv[i]);
	}

	std::string cmdLine = "java -jar whc.jar " + arg_fileSrc;
	cmdLine += " " + arg_fileDest;
	std::string compileLine = "csc.exe /t:exe /out:./ProgramWHC.exe "+arg_fileDest;
	std::string executeLine = ".\\ProgramWHC.exe";
	
	for(std::list<std::string>::iterator itr = mainArgs.begin(); itr != mainArgs.end(); itr++){
		executeLine += " " + *itr;
	}

	int status = system(cmdLine.c_str()); //Compiling .wh -> .cs
	if(execute){
		std::cout << "Compiling the C# program : " << compileLine.c_str();
		system(compileLine.c_str()); //Compiling .cs -> .exe
		std::cout << "Executing the C# program";
		system(executeLine.c_str()); //Executing .exe args
	}		
	return status;
}