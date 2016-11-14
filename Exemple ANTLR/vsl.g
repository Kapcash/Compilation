grammar vsl;

options {
    output=AST;
    ASTLabelType=CommonTree; // type of $stat.tree ref etc...
}


tokens {
   IMAGINERY_TOKEN;
   PROG='PROG';
   CORPS='CORPS';
   FCALL_S='FCALL_S';
   BLOCK='BLOCK';
   FCALL='FCALL';
   ARDEC='ARDEC';
   PARAM='PARAM';
   ARRAY='ARRAY';
   ARELEM='ARELEM';
   INST='INST';
   DEC='DEC';
}



@header {
//import java.util.*; //conflict with BitSet
} 

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

program		:	unite+ 
                -> ^(PROG unite+)
		;

unite	:	function
		|	proto
		;

function	:	FUNC_KW type IDENT PG param_list PD statement
                -> ^(FUNC_KW type IDENT param_list ^(CORPS statement))
		;


proto		: 	PROTO_KW^ type IDENT PG! param_list PD!
		;

type		:	INT_KW^ 
		|	VOID_KW^
		;

param_list	:	param ( VIRG param )*
                -> ^(PARAM param+)
		|	-> ^(PARAM)
		;

param		:	IDENT
	        |	IDENT CG CD 
                -> ^(ARRAY IDENT) 
		;

statement	:	IDENT ASSIGN_KW^ expression
		|	tab_elem ASSIGN_KW expression
				-> ^(ASSIGN_KW tab_elem expression)
		|	RETURN_KW^ expression
		|	PRINT_KW^ print_list
		|	READ_KW^ read_list
		|	IF_KW^ expression THEN_KW! statement (ELSE_KW! statement)? FI_KW!
		|	WHILE_KW^ expression DO_KW! statement OD_KW!
		|	IDENT PG argument_list? PD
				->^(FCALL_S IDENT argument_list?)
		|	block 
		;

block	:	AG declaration  suit_inst AD 
				-> ^(BLOCK declaration suit_inst)
		|	AG suit_inst AD 
					-> ^(BLOCK suit_inst) 
		;


tab_elem	: 	IDENT CG expression CD
                    -> ^(ARELEM IDENT expression)
		;

suit_inst	:	statement+ 
                -> ^(INST statement+) 
		;


expression	:	fact ((PLUS^|MOINS^) fact)*
		;

fact		:	primaire ((MUL^|DIV^) primaire)*
		;

primaire	:	INTEGER
		|	IDENT
      		|	tab_elem
		|	IDENT PG argument_list? PD
			-> ^(FCALL IDENT argument_list?)
		|	PG! expression PD!
		;

argument_list	:	expression ( VIRG! expression )*
//		|	
		;

print_list	:	print_item ( VIRG! print_item  )*
		;

print_item	:	TEXT
		|	expression
		;

read_list	:	read_item( VIRG! read_item  )*
		;

read_item	:	IDENT
		|	tab_elem
		;

declaration	:	(INT_KW list_dec)+ 
                -> ^(DEC list_dec+) 
		;

list_dec	:	dec_item ( VIRG! dec_item)*
		;

dec_item	:	IDENT
          	|	IDENT CG INTEGER CD 
              		-> ^(ARDEC IDENT INTEGER)
		;

/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/


WS              :  (' '|'\n'|'\t'|'\r')
                   {skip();}
                ;

COMMENT		:	'//'(~'\n')* {skip();}
		;

fragment
LETTER		: 'a'..'z' ;

fragment
DIGIT		: '0'..'9' ;

fragment
ASCII		: ~( '\n' | '\"' );

IDENT		:	LETTER( LETTER|DIGIT )* 
			;
TEXT		:	'\"' ASCII* '\"';

INTEGER		:	DIGIT+ ;
PG		:	'(' ;
PD		:	')' ;
CG		:	'[' ;
CD		:	']' ;
AG		:	'{' ;
AD		:	'}' ;
VIRG		:	',' ;
FUNC_KW		:	'FUNC' ;
PROTO_KW	:	'PROTO' ;
INT_KW		:	'INT' ;
VOID_KW		:	'VOID' ;
ASSIGN_KW	:	':=' ;
RETURN_KW	:	'RETURN' ;
PRINT_KW	:	'PRINT' ;
READ_KW		:	'READ' ;
IF_KW		:	'IF' ;
THEN_KW		:	'THEN' ;
ELSE_KW		:	'ELSE' ;
FI_KW		:	'FI' ;
WHILE_KW	:	'WHILE' ;
DO_KW		:	'DO' ;
OD_KW		:	'DONE' ;
PLUS		:	'+' ;
MOINS		:	'-' ;
MUL		:	'*' ;
DIV		:	'/' ;
