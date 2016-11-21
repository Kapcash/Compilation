#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void manual(){
	printf("\n");
	printf("==================== MANUEL WHPP\n");
	printf("\n");
	printf("========== RESUME\n");
	printf("\n");
	printf("\n");
	printf("========== USAGE\n");
	printf("\n");
	printf("whpp fichier [-all n, -if n, -o fichierSortie]\n");
	printf("\n");
	printf("\n");
	printf("========== CREDITS\n");
	printf("\n");
	printf("Programme réalisé par Dylan BEHETRE, Yoann BOYERE, Alexis BRAULT, Mehidine CHUPEAU, Florent CATIAU, Quentin OLIVIER");
	printf("\n");
	printf("\n");
	printf("==================== \n");
}

int main(int argc, char *argv[]){
	
	if(argc<2 && argc%2!=0){
		manual();
		return 0;
	}

	int 	arg_all = 0, 
			arg_if = 0; 
	char *	arg_fileSrc,
		 *	arg_fileDest;

	arg_fileSrc = argv[1];

	int i = 0;
	for(i=2;i<argc;i=i+2){
		if(strcmp("--help",argv[i])==0){
			manual();
			return 0;
		}

		if(strcmp("-all",argv[i])==0){
			arg_all = atoi(argv[i+1]);
			continue;
		}
		
		if(strcmp("-o",argv[i])==0){
			arg_fileDest = argv[i+1];
			continue;
		}
		
	}

	//printf("%d",arg_all);

	int status = system("java -jar a.jar");
	printf("%d\n",status);

	return 0;
}