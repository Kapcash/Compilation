tree grammar vslTree;

options {
    tokenVocab=vsl;
    ASTLabelType=CommonTree;
    backtrack=true;
}

//@header {}

@members {TableSymboles tab = new TableSymboles();}


//TODO
program returns [Code c]	: ^(PROG {tab.Enter_Scope();} u1=unite {c=u1;} 
								( {tab.Enter_Scope();} u2=unite {c.append(u2);} )*) 
				{for(int i=tab.getScope(); i>0 ;i--){tab.Leave_Scope();}
				}				
		;

unite returns [Code c]	:	f=function {c=f;}
		|	proto {c=new Code();}
		;

function returns [Code c]	:^(FUNC_KW t=type id=IDENT p=param_list ^(CORPS stat=statement))
				{String nom = id.getText(); 
				 Type fun = new TypeFunction(t);
				 while(!p.type.isEmpty()){
				 fun.addSubType(p.type.remove(0));
				 }
				 Tokatt verif=tab.Lookup(nom);
				 if(verif==null){
				 Tokatt to=new Tokatt(fun,nom,tab.getScope());
				 tab.Insert(nom,to);}
				 else{	TypeFunction tf = (TypeFunction) verif.type;
					if(tf.IsProto()){System.out.println("La fonction "+nom+" est déjà définie");System.exit(0);}
					else{
						if(!verif.type.isCompatible(fun)){System.out.println("La définition de la fonction "+nom+" ne correspond pas à son prototype"); System.exit(0);}
					}
				tf._defined=false;
				}
				c=Code.genFunc(p.code,stat,nom,t);
				}
				
		;


proto		: 	^(PROTO_KW t=type i=IDENT p=param_list){
								Tokatt verif=tab.Lookup(i.getText());
								TypeFunction fun = new TypeFunction(t);
									 while(!p.type.isEmpty()){
									 fun.addSubType(p.type.remove(0));
									 }
								fun.Proto2Fonc();
								if (verif==null){
							        Tokatt to=new Tokatt(fun,i.getText(),tab.getScope());
								tab.Insert(i.getText(),to);	
								}
								else{System.out.println("la fonction "+i.getText()+" a déjà été prototypée ou définie");System.exit(0);}
								}
		;

type returns [Type t]	:	INT_KW {t=TypeSystem.T_integer;}
		|	VOID_KW {t=TypeSystem.T_void;}
		;

param_list returns [Param p]	:^(PARAM p1=param 
				{Code c=p1.code; Type t=p1.type; ArrayList<Type> a = new ArrayList<Type>();
				a.add(t);
				 p=new Param(a,c);} 

				(p2=param {p.code.append(p2.code); p.type.add(p2.type);})*) 
		| PARAM {p=new Param(new ArrayList<Type>(),new Code());}
		;

param returns [Expratt exp]		:	i=IDENT {String s= i.getText();
						Tokatt t=tab.Lookup(s); 
						if(t!=null && t.scope==tab.getScope())
							{System.out.println("impossible de déclarer deux fois la même variable");System.exit(0);}
							Tokatt var = new Tokatt(TypeSystem.T_integer,s,tab.getScope());
							Code c=Code.genParamId(s,tab,var);
							exp=new Expratt(var.type,c,var);						

						}
	        |	^(ARRAY i=IDENT) {String s= i.getText(); 
					Tokatt t=tab.Lookup(s); 
					if(t!=null && t.scope==tab.getScope())
							{System.out.println("impossible de déclarer deux fois la même variable");System.exit(0);}
					Tokatt to = new Tokatt(TypeSystem.T_pointer,s,tab.getScope());
					Code c=Code.genParamTab(s,tab,to);
				        Type ar=new TypeArray(TypeSystem.T_integer,0);
					exp=new Expratt(ar,c,to);
					}
		;

statement returns [Code c]@init{c=new Code();} :^(ASSIGN_KW i=IDENT exp=expression)
			{String var=i.getText(); 
			Tokatt t=tab.Lookup(var);
			if(t==null){System.out.println("variable "+var+" non déclarée");System.exit(0);}
			if(exp.type!=TypeSystem.T_integer){System.out.println("impossible d'assigner une expression qui n'est pas de type entier");System.exit(0);}
			if(t.type!=TypeSystem.T_integer){System.out.println("erreur de type : impossible de faire une assignation sur l'identificateur "+var+",cet ident est déclaré mais ce n'est pas une variable");System.exit(0);}
			c=Code.genAssignId(t,exp);
			}
		|	^(ASSIGN_KW etab=tab_elem exp1=expression)
			 {Tokatt tok=tab.Lookup(etab.nom);
			 if(tok==null){System.out.println("tableau non déclaré");System.exit(0);}
			 if(exp1.type!=TypeSystem.T_integer){System.out.println("impossible d'assigner une expression qui n'est pas de type entier");System.exit(0);}
			 c=Code.genAssignTab(tok,etab.exp,exp1);
			}
		|	^(RETURN_KW exp1=expression)
			{Code cod = Code.genReturn(exp1); c.append(cod);
			}
		|	^(PRINT_KW p=print_list)
			{c.append(p);}
			
		|	^(READ_KW r=read_list)
			{c.append(r);
			}
		|	^(IF_KW exp1=expression exp2=statement exp3=statement?)
			{Code cod = Code.genIf(exp1, exp2, exp3); c.append(cod);
			}

		|	^(WHILE_KW exp1=expression exp2=statement)
			{
				Code cod = Code.genWhile(exp1,exp2);c.append(cod);
			}
		|	^(FCALL_S i=IDENT a=argument_list?)
			{String s=i.getText();
			 Tokatt fun=tab.Lookup(s);
			 if (fun==null){System.out.println("la fonction "+s+" n'a pas été défini avant son utilisation"); System.exit(0);}
			 Type f = new TypeFunction(fun.type);
			while(!a.type.isEmpty()){f.addSubType(a.type.remove(0));}
			 if (!fun.type.isCompatible(f)){System.out.println("les arguments de la fonction "+s+" sont incohérents par rapport à sa définition"); System.exit(0);}
			 c=Code.genFcalls(s,a.code);
			}
		|	b=block{c=b;}
			
		;

block returns [Code c]	: ^(BLOCK d=declaration s=suit_inst) {c=d;c.append(s);}
		|	 ^(BLOCK s=suit_inst) {c=s;}
		;


tab_elem returns [Tabelem t]	: ^(ARELEM id=IDENT exp1=expression)
		{  
		String s=id.getText();
		t=new Tabelem(s,exp1);
		if(exp1.type!=TypeSystem.T_integer){System.out.println("un élément de tableau ne peut être désigné que par une expression de type entier");System.exit(0);}
		}	
		;

suit_inst returns [Code c]	:	^(INST s1=statement {c=s1;} (s2=statement {c.append(s2);})*) 
		;


expression returns [Expratt exp] :	
			^(PLUS exp1=expression  exp2=expression)
			{Type ty = TypeSystem.CheckBinOp(exp1.type, exp2.type);
				  Tokatt temp = SymbDistrib.newTemp();
				  Code cod = Code.genBinOp(Inst3a.TAC_ADD, exp1, exp2, temp);
				  exp = new Expratt(ty, cod, temp);}
		|	^(MOINS exp1=expression exp2=expression)
			{Type ty = TypeSystem.CheckBinOp(exp1.type, exp2.type);
				  Tokatt temp = SymbDistrib.newTemp();
				  Code cod = Code.genBinOp(Inst3a.TAC_SUB, exp1, exp2, temp);
				  exp = new Expratt(ty, cod, temp);}
		|	^(MUL exp1=expression  exp2=expression)
			{Type ty = TypeSystem.CheckBinOp(exp1.type, exp2.type);
				  Tokatt temp = SymbDistrib.newTemp();
				  Code cod = Code.genBinOp(Inst3a.TAC_MUL, exp1, exp2, temp);
				  exp = new Expratt(ty, cod, temp);}
		|	^(DIV exp1=expression  exp2=expression)
			{Type ty = TypeSystem.CheckBinOp(exp1.type, exp2.type);
				  Tokatt temp = SymbDistrib.newTemp();
				  Code cod = Code.genBinOp(Inst3a.TAC_DIV, exp1, exp2, temp);
				  exp = new Expratt(ty, cod, temp);}
		|	i=INTEGER
			{int ival =Integer.parseInt(i.getText());
				 exp = new Expratt(TypeSystem.T_integer, new Code(), new Tokatt(ival));}
		|	i=IDENT
			{String ival = i.getText(); 
			Tokatt t = tab.Lookup(ival); 
			if(t!=null){exp=new Expratt(t.type,new Code(),t);}
			else {System.out.println("ident inexistant");System.exit(0);}
			}
      		|	ta=tab_elem 
				{Tokatt tok=tab.Lookup(ta.nom);
				if (tok==null)
         	  		 {  System.out.println("tableau mal declaré");}
      				else
         	   		{Tokatt temp=SymbDistrib.newTemp(); 
		    		Code cod=Code.genTabElem(temp,ta.exp,tok); 
		    		exp = new Expratt(TypeSystem.T_integer,cod,temp); 
				}
			}
			
		|	^(FCALL i=IDENT a=argument_list?){
			 String s=i.getText();
			 Tokatt temp = SymbDistrib.newTemp();
			 Type type = TypeSystem.T_integer;
			 Tokatt fun=tab.Lookup(s);
			 if (fun==null){System.out.println("la fonction "+s+" n'a pas été défini avant son utilisation"); System.exit(0);}
			 Type f = new TypeFunction(type);
			while(!a.type.isEmpty()){f.addSubType(a.type.remove(0));}
			 if (!fun.type.isCompatible(f)){System.out.println("la fonction "+s+" n'est pas de type INT ou a des arguments incohérents par rapport à sa définition"); System.exit(0);}
			 Code code = Code.genFcall(s,a.code,temp);
			 exp = new Expratt(type,code,temp);
			}

		;

argument_list returns [Param p]	:	exp1=expression
				{Code c=Code.genArg(exp1);ArrayList<Type> a=new ArrayList<Type>();a.add(exp1.type); p=new Param(a,c); } 
					(exp2=expression{p.code.append(Code.genArg(exp2));p.type.add(exp2.type);} )*
//		|	
		;

print_list returns [Code c] :c1=print_item {c=c1;} (c2=print_item {c.append(c2);})*
			
			
			
		;

print_item returns [Code c] : t=TEXT{String s=t.getText(); Tokatt l= new Tokatt(s);c=Code.genPrintS(l);}
		|	exp=expression{ 
					if(exp.type!=TypeSystem.T_integer)
					   {System.out.println("Impossible d'afficher "+exp.place.getChain()+" ce n'est pas un type entier ou texte");System.exit(0);}
					c=Code.genPrintI(exp);}
				
		;

read_list returns [Code c]	:	c1=read_item {c=c1;}( c2=read_item {c.append(c2);} )*
		;

read_item returns [Code c]	:	i=IDENT{String var=i.getText();  Tokatt toc=tab.Lookup(var); 
						if(toc==null){System.out.println("ident "+var+" non déclaré, impossible de le lire");System.exit(0);}
						if(toc.type!=TypeSystem.T_integer){System.out.println("l'ident "+var+" n'est pas de type entier, impossible de le lire"); System.exit(0);}
						c=Code.genReadIdent(toc); }
		|	t=tab_elem {Tokatt toc=tab.Lookup(t.nom); 
				    if(toc==null){System.out.println("tableau "+t.nom+" non déclaré, impossible de le lire");System.exit(0);}
				    c=Code.genReadTab(toc,t.exp);}
		;

declaration returns [Code c]	:	^(DEC l1=list_dec {c=l1;} (l2=list_dec{c.append(l2);})*) 
		;

list_dec returns [Code c]	:	d1=dec_item {c=d1;} (d2=dec_item {c.append(d2);})*
		;

dec_item returns [Code c]: 	i=IDENT {String v = i.getText();
					Tokatt t=tab.Lookup(v);
					if(t!=null && t.scope==tab.getScope())
						{System.out.println("impossible de déclarer deux fois la même variable");System.exit(0);}
					 Code code=Code.genDecIdent(v,tab); c=code;}
          	|	^(ARDEC i=IDENT e=INTEGER) {String v=i.getText(); 
						   Tokatt t=tab.Lookup(v);
						   if(t!=null && t.scope==tab.getScope())
							{System.out.println("impossible de déclarer deux fois la même variable");System.exit(0);}
						   int dim=Integer.parseInt(e.getText()); Code code=Code.genDecArray(v,dim,tab);c=code;}
		;
