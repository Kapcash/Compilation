package sprint3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import sprint2.QuadImp;
import sprint2.ThreeAddressCode;

public abstract class Translator {

	protected ThreeAddressCode code;
	private StringBuilder stb = new StringBuilder();
	private int k = 0;
	private LinkedList<String> reads = new LinkedList<String>();
	protected boolean inMainFunction = true;
	private String nameMainFonction;

	// Utils
	private final static String lAccolade = "{";
	private final static String rAccolade = "}";
	private final static String newLine = "\n";
	private final static String tab = "\t";

	public Translator(ThreeAddressCode code) {
		super();
		this.code = code;
	}

	public abstract void translate() throws CS_TranslatorException;

	public void iterateCode() throws CS_TranslatorException {
		HashMap<String, LinkedList<QuadImp>> map = code.getCode3Addr();
		iterateCode("L" + (map.size() - 1));
	}

	public abstract void iterateCode(String E) throws CS_TranslatorException;

	public String findLabelOfThisFunction(String E) throws CS_TranslatorException {
		HashMap<String, LinkedList<QuadImp>> map = code.getCode3Addr();
		Iterator<Map.Entry<String, LinkedList<QuadImp>>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, LinkedList<QuadImp>> pair = it.next();
			if (pair.getValue().getFirst().getReponse().equals(E))
				return (String) pair.getKey();
		}
		throw new CS_TranslatorException("Erreur dans les étiquettes");
	}

	protected abstract void writeSymbs();
	
	protected abstract void codeMain();
	
	protected abstract void translate_function(QuadImp quad);
	
	protected abstract void translate_nop(Function f);
	
	protected abstract void translate_foreach_1(QuadImp quad, Function f);
	
	protected abstract void translate_foreach_2(QuadImp quad, Function f);
	
	protected abstract void translate_affectation(QuadImp quad, Function f);
	
	protected abstract void translate_and(QuadImp quad, Function f);
	
	protected abstract void translate_or(QuadImp quad, Function f);
	
	protected abstract void translate_eq(QuadImp quad, Function f);
	
	protected abstract void translate_pop(QuadImp quad, Function f);
	
	protected abstract void translate_call(QuadImp quad, Function f);
	
	protected abstract void translate_push(QuadImp quad, Function f);
	
	protected abstract void translate_cons(QuadImp quad, Function f);
	
	protected abstract void translate_list(QuadImp quad, Function f);
	
	protected abstract void translate_hd(QuadImp quad, Function f);
	
	protected abstract void translate_tl(QuadImp quad, Function f);

	protected void iterateList(Iterator<QuadImp> it, CS_Function f) throws CS_TranslatorException {
		while (it.hasNext()) {
			QuadImp quad = it.next();
			switch (quad.getOperateur().getOpe()) {
			case FUN:
				translate_function(quad);
				break;
			case READ:
				f.write("" + quad.getReponse() + " = input.Dequeue();");
				if(inMainFunction)
					reads.add(quad.getReponse());
				break;
			case WRITE:
				f.write("output.Enqueue(" + quad.getReponse() + ");");
				if(inMainFunction || f.name.equals(nameMainFonction)){
					inMainFunction=true;
				}
					
				break;
			case NOP:
				translate_nop(f);
				break;

			// LOOPS
			case IF:
				iterateList(code.getCode3Addr().get(quad.getEtiquette()).iterator(), f);
				translate_if_1(quad, f);
				iterateList(code.getCode3Addr().get(quad.getArg1()).iterator(), f);
				f.leftShift();
				LinkedList<QuadImp> arg2 = code.getCode3Addr().get(quad.getArg2());
				if (arg2 != null && !arg2.equals("")) {
					f.write(rAccolade + "else" + lAccolade);
					f.rightShift();
					iterateList(code.getCode3Addr().get(quad.getArg2()).iterator(), f);
					f.leftShift();
				}
				f.write(rAccolade);
				break;
			case WHILE:
				iterateList(code.getCode3Addr().get(quad.getEtiquette()).iterator(), f);
				f.write("while(BinTree.isTrue(" + code.getCode3Addr().get(quad.getEtiquette()).getLast().getReponse()
						+ "))");
				f.write(lAccolade);
				f.rightShift();
				iterateList(code.getCode3Addr().get(quad.getArg1()).iterator(), f);
				iterateList(code.getCode3Addr().get(quad.getEtiquette()).iterator(), f);
				f.leftShift();
				f.write(rAccolade);
				break;
			case FOR:
				iterateList(code.getCode3Addr().get(quad.getEtiquette()).iterator(), f);
				f.write("while(BinTree.isTrue(" + code.getCode3Addr().get(quad.getEtiquette()).getFirst().getReponse()+ "))");
				f.write(lAccolade);
				f.rightShift();
				iterateList(code.getCode3Addr().get(quad.getArg1()).iterator(), f);
				f.write(code.getCode3Addr().get(quad.getArg1()).getLast().getArg1() + " = " + code.getCode3Addr().get(quad.getArg1()).getLast().getReponse() + ";");
				f.leftShift();
				f.write(rAccolade);
				break;
			
			case FOREACH:
				iterateList(code.getCode3Addr().get(quad.getEtiquette()).iterator(), f);
				translate_foreach_1(quad, f);
				iterateList(code.getCode3Addr().get(quad.getArg1()).iterator(), f);
				translate_foreach_2(quad, f);
				break;
				
			case DECL:

				break;
			case AFF:
				translate_affectation(quad, f);
				break;
			case AND:
				translate_and(quad, f);
				break;
			case OR:
				translate_or(quad, f);
				break;
			case EQ:
				translate_eq(quad, f);
				break;
			// FUNCTION USE
			case PUSH:
				translate_push(quad, f);
				break;
			case CALL:
				translate_call(quad, f);
				inMainFunction = false;
				iterateCode(findLabelOfThisFunction(quad.getEtiquette()));
				break;
			case POP:
				translate_pop(quad, f);
				break;
			// WHILE FUNCTION
			case CONS:
				translate_cons(quad, f);
				break;
			case LIST:
				translate_list(quad, f);
				break;
			case HD:
				translate_hd(quad, f);
				break;
			case TL:
				translate_tl(quad, f);
				break;
			default:
				f.write("// "+quad.getOperateur().getOpe().name()+" not implemented yet.");
				break;
			}
		}
	}

	protected abstract void translate_if_1(QuadImp quad, Function f);

	protected abstract void writeFunction() throws CS_TranslatorException;

	protected void write(String s) {
		tab(k);
		stb.append(s);
		newLine();
	}

	protected void write2(String s) {
		stb.append(s);
	}

	protected void newLine() {
		stb.append(newLine);
	}

	private void tab(int j) {
		for (int i = 0; i < j; i++) {
			tab();
		}
	}

	private void tab() {
		stb.append(tab);
	}

	protected void leftShift() {
		k--;
	}

	protected void rightShift() {
		k++;
	}

	@Override
	public String toString() {
		return stb.toString();
	}
}