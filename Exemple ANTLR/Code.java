
class Code extends Code3a{
	private static boolean error = false;
	 public Code (){
		 super ();
	 }
	 
		 public Code(Inst3a i){
		 super(i);
	 }


	 public static Code genBinOp(int op, Expratt exp1, Expratt exp2, Operand3a temp){
		  Code cod = exp1.code;
		  cod.append(exp2.code);
		  cod.append(new Inst3a(Inst3a.TAC_VAR, temp, null, null)); 
		  Inst3a i = new Inst3a(op, temp, exp1.place, exp2.place);
		  cod.append(new Code(i));
		  return cod;
	 }


	 public static Code genAssignId(Tokatt t,Expratt exp){
		Code code = exp.code;
		code.append(new Code(new Inst3a(Inst3a.TAC_COPY,t,exp.place,null)));
		return code;
	}

	 public static Code genAssignTab(Tokatt t,Expratt exp1,Expratt exp2){
		Code code = exp2.code;
		code.append(new Code(new Inst3a(Inst3a.TAC_VARTAB,t,exp1.place,exp2.place)));
		return code;
	}


	 public static Code genPrintI(Expratt exp){
		 Code code = exp.code;	
		 code.append(new Code(new Inst3a(Inst3a.TAC_ARG, exp.place, null, null)));
		 code.append( new Code(new Inst3a(Inst3a.TAC_CALL,null,new Tokatt("L2",null),null)));
		 return code;
	}

	  public static Code genPrintS(Tokatt l){
		 Code code= (new Code(new Inst3a(Inst3a.TAC_ARG,l, null, null)));
		 code.append( new Code(new Inst3a(Inst3a.TAC_CALL,null,new Tokatt("L4",null),null)));
		 code.appendData(l);
		 return code;
	}



	public static Code genIf(Expratt exp1, Code c1, Code c2){
		Tokatt l2 = SymbDistrib.newLabel();
		Tokatt l3 = SymbDistrib.newLabel();
		
		Code code = exp1.code;
		code.append(new Code(new Inst3a (Inst3a.TAC_IFZ,exp1.place,l2,null)));
		code.append(c1);
		if(c2!=null){
		code.append( new Code(new Inst3a(Inst3a.TAC_GOTO,l3,null,null)));
		code.append( new Code(new Inst3a(Inst3a.TAC_LABEL,l2,null,null)));
		code.append(c2);
		code.append( new Code(new Inst3a(Inst3a.TAC_LABEL,l3,null,null)));
		}
		else
		{code.append( new Code(new Inst3a(Inst3a.TAC_LABEL,l2,null,null)));}
		return code;
	} 

	public static Code genWhile(Expratt exp1, Code c1){
		Tokatt lfin = SymbDistrib.newLabel();
		Tokatt ldeb = SymbDistrib.newLabel();
		Code code=( new Code(new Inst3a(Inst3a.TAC_LABEL,ldeb,null,null)));
		code.append(exp1.code);
		code.append(new Code(new Inst3a (Inst3a.TAC_IFZ,exp1.place,lfin,null)));
		code.append(c1);
		code.append( new Code(new Inst3a(Inst3a.TAC_GOTO,ldeb,null,null)));
		code.append( new Code(new Inst3a(Inst3a.TAC_LABEL,lfin,null,null)));
		return code;
	}	

	public static Code genReturn(Expratt exp){
		Code code = exp.code;
		code.append(new Code(new Inst3a (Inst3a.TAC_RETURN,exp.place,null,null)));
		return code;
	}	

	public static Code genDecIdent(String s,TableSymboles t){
		Tokatt var = new Tokatt(TypeSystem.T_integer,s,t.getScope());
		t.Insert(s,var);
		Code code = (new Code(new Inst3a(Inst3a.TAC_VAR, var, null, null))); 
		return code;
	}	

	public static Code genDecArray(String s, int i, TableSymboles t){
		Type type = new TypeArray (TypeSystem.T_integer, i);
		Tokatt var = new Tokatt(type,s,t.getScope());
		t.Insert(s,var);
		Code code = (new Code(new Inst3a(Inst3a.TAC_VAR, var, null, null))); 
		return code;
	}	

	 public static Code genReadIdent(Tokatt t){
		 Code code=( new Code(new Inst3a(Inst3a.TAC_CALL,t,new Tokatt("L8",null),null)));
		 return code;
	}

	public static Code genTabElem(Tokatt temp,Expratt exp, Tokatt tok){
		    Code cod=new Code();
		    cod.append(exp.code);
		    cod.append(new Inst3a(Inst3a.TAC_VAR,temp,null,null));		
		    cod.append(new Inst3a(Inst3a.TAC_TABVAR,temp,tok,exp.place));
		    return cod;
	}
	public static Code genReadTab(Tokatt tok, Expratt exp){
		Tokatt temp=SymbDistrib.newTemp();
		Code cod = new Code();
		cod.append(exp.code);
		Inst3a i = new Inst3a(Inst3a.TAC_VAR, temp, null, null);
		cod.append(new Code(i));
		Inst3a j = new Inst3a(Inst3a.TAC_CALL, temp, new Tokatt("L8", null), null);
		cod.append(new Code(j));
		cod.append(new Inst3a(Inst3a.TAC_VARTAB,tok,exp.place,temp));
		return cod;
	}
	
	 public static Code genArg(Expratt exp){
		 Code code = exp.code;	
		 code.append(new Code(new Inst3a(Inst3a.TAC_ARG, exp.place, null, null)));
		 return code;
	}

	public static Code genFcalls(String s, Code c){
		Code code=( new Code(new Inst3a(Inst3a.TAC_CALL,null,new Tokatt(s,null),null)));
		code.append(c);
		return code;
	}

	public static Code genFcall(String s, Code c, Tokatt temp){
		Code code=(new Code(new Inst3a(Inst3a.TAC_VAR, temp, null, null)));
		code.append(c);
		code.append( new Code(new Inst3a(Inst3a.TAC_CALL,temp,new Tokatt(s,null),null)));
		return code;
	}

	
	public static Code genFunc(Code param, Code c, String s,Type t){
			
			Code code = (new Code(new Inst3a(Inst3a.TAC_LABEL, new Tokatt(s,t), null, null)));
			code.append(new Code(new Inst3a(Inst3a.TAC_BEGINFUNC, null, null, null)));
			code.append(param);
			code.append(c);
			code.append(new Code(new Inst3a(Inst3a.TAC_ENDFUNC, null, null, null)));
			c.the_code=code.getCode();
			return code;
	 }

	public static Code genParamId(String s, TableSymboles t , Tokatt var){
		var.setParam();
		t.Insert(s,var);
		Code code = (new Code(new Inst3a(Inst3a.TAC_VAR, var, null, null))); 
		return code;     
	}
	
	public static Code genParamTab(String s, TableSymboles tab, Tokatt t){
		t.setParam();
		tab.Insert(s,t);
		Code code=(new Code(new Inst3a(Inst3a.TAC_VAR,t, null, null))); 
		return code;       
	}
	

} // Code ***
