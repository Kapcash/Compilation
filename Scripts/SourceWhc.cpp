#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <string.h>
#include <list>

//Compiling command : g++ -std=c++11 [source.cpp] -o [dest.exe]

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
	printf("file : nom du fichier C# de sortie\n\n");
	printf("\n");
	printf("\n");
	printf("-e file\n");
	printf("file : nom du fichier exe C# de sortie\n\n");
	printf("\n");
	printf("\n");
	printf("-test\n");
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
				arg_fileDest = "out.cs",
				arg_fileExeDest = "out.exe";
	bool test = false;
	std::string testLine = "\"java -cp .;\\whc_lib\\junit.jar;whc.jar org.junit.runner.JUnitCore traductionTest.Code3AdressesTests\"";

				
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
		if (strcmp("-e", argv[i]) == 0) {
			arg_fileExeDest = argv[i + 1];
			i++;
			continue;
		}
		if (strcmp("-test", argv[i]) == 0) {
			test=true;
			continue;
		}
	}

	if(test){
		std::cout << "Running pretty print tests."<< std::endl;
		int statusTest = system(testLine.c_str());
		return statusTest;
	}

	std::string cmdLine = "java -jar whc.jar " + arg_fileSrc;
	cmdLine += " " + arg_fileDest;
	std::string compileLine = "csc /t:exe /out:"+arg_fileExeDest+" \".\\BinTreeProject\\BinTreeProject\\BinTree.cs\" "+arg_fileDest;

	std::cout << "Compiling the WH program into C# : " << cmdLine.c_str() << std::endl;
	int status = system(cmdLine.c_str()); //Compiling .wh -> .cs
	std::cout << "Compiling the C# program : " << compileLine.c_str() << std::endl;
	system(compileLine.c_str()); //Compiling .cs -> .exe

	return status;
}