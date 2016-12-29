package sprint2;

public enum OP {
	NOP, 
	//Structure de controle
	IF, ELSE, 
	//Boucle
	WHILE, FOR, 
	//Declaration
	DECL,
	//Affectation
	AFF,
	//Definition fonction
	FUN, READ, WRITE,PUSH, POP,
	//Expression
	CONS, HD, TL, LIST,
	//Expression booleennes
	AND, OR, EQ, NOT,
	//Appel de func
	CALL
}