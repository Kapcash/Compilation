/**
 * generated by Xtext 2.10.0
 */
package esir.compilation.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import esir.compilation.whileComp.Affectation;
import esir.compilation.whileComp.Command;
import esir.compilation.whileComp.Commands;
import esir.compilation.whileComp.Cons;
import esir.compilation.whileComp.Definition;
import esir.compilation.whileComp.Expr;
import esir.compilation.whileComp.ExprAnd;
import esir.compilation.whileComp.ExprEq;
import esir.compilation.whileComp.ExprNot;
import esir.compilation.whileComp.ExprOr;
import esir.compilation.whileComp.ExprSimple;
import esir.compilation.whileComp.For;
import esir.compilation.whileComp.Foreach;
import esir.compilation.whileComp.Function;
import esir.compilation.whileComp.Hd;
import esir.compilation.whileComp.If;
import esir.compilation.whileComp.Lexpr;
import esir.compilation.whileComp.List;
import esir.compilation.whileComp.Nil2;
import esir.compilation.whileComp.Nop;
import esir.compilation.whileComp.Not;
import esir.compilation.whileComp.Program;
import esir.compilation.whileComp.Read;
import esir.compilation.whileComp.Tl;
import esir.compilation.whileComp.While;
import esir.compilation.whileComp.Write;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class WhileCompGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Program> _filter = Iterables.<Program>filter(_iterable, Program.class);
    for (final Program e : _filter) {
      CharSequence _compile = this.compile(e);
      fsa.generateFile("result_output.whpp", _compile);
    }
  }
  
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context, final String sortie) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Program> _filter = Iterables.<Program>filter(_iterable, Program.class);
    for (final Program e : _filter) {
      CharSequence _compile = this.compile(e);
      fsa.generateFile(sortie, _compile);
    }
  }
  
  public CharSequence compile(final Program p) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Function> _functions = p.getFunctions();
      for(final Function f : _functions) {
        CharSequence _compile = this.compile(f);
        _builder.append(_compile, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Function c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("function ");
    String _function = c.getFunction();
    _builder.append(_function, "");
    _builder.append(": ");
    _builder.newLineIfNotEmpty();
    _builder.append("read ");
    {
      Definition _definition = c.getDefinition();
      Read _read = _definition.getRead();
      EList<String> _variable = _read.getVariable();
      boolean _hasElements = false;
      for(final String param : _variable) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" ,", "");
        }
        _builder.append(param, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("%");
    _builder.newLine();
    Definition _definition_1 = c.getDefinition();
    Commands _commands = _definition_1.getCommands();
    CharSequence _compile = this.compile(_commands);
    _builder.append(_compile, "");
    _builder.newLineIfNotEmpty();
    _builder.append("%");
    _builder.newLine();
    _builder.append("write ");
    {
      Definition _definition_2 = c.getDefinition();
      Write _write = _definition_2.getWrite();
      EList<String> _variable_1 = _write.getVariable();
      boolean _hasElements_1 = false;
      for(final String param_1 : _variable_1) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(" ,", "");
        }
        _builder.append(param_1, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Commands coms) {
    CharSequence _xblockexpression = null;
    {
      EList<Command> _commands = coms.getCommands();
      boolean _notEquals = (!Objects.equal(_commands, null));
      if (_notEquals) {
        EList<Command> _commands_1 = coms.getCommands();
        Command _command = coms.getCommand();
        _commands_1.add(0, _command);
      } else {
        Command _command_1 = coms.getCommand();
        this.compile(_command_1);
      }
      StringConcatenation _builder = new StringConcatenation();
      {
        EList<Command> _commands_2 = coms.getCommands();
        boolean _hasElements = false;
        for(final Command c : _commands_2) {
          if (!_hasElements) {
            _hasElements = true;
          } else {
            _builder.appendImmediate(" ;", "");
          }
          _builder.append("\t", "");
          CharSequence _compile = this.compile(c);
          _builder.append(_compile, "");
        }
      }
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence compile(final Command c) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EObject _command = c.getCommand();
      if ((_command instanceof Affectation)) {
        EObject _command_1 = c.getCommand();
        CharSequence _compile = this.compile(((Affectation) _command_1));
        _builder.append(_compile, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EObject _command_2 = c.getCommand();
      if ((_command_2 instanceof Nop)) {
        _builder.append("nop");
        _builder.newLine();
      }
    }
    {
      EObject _command_3 = c.getCommand();
      if ((_command_3 instanceof While)) {
        _builder.append("while ");
        EObject _command_4 = c.getCommand();
        Expr _expr = ((While) _command_4).getExpr();
        Object _compile_1 = this.compile(_expr);
        _builder.append(_compile_1, "");
        _builder.append(" do");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        EObject _command_5 = c.getCommand();
        Commands _commands = ((While) _command_5).getCommands();
        Object _compile_2 = this.compile(_commands);
        _builder.append(_compile_2, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t", "");
        _builder.append("od");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EObject _command_6 = c.getCommand();
      if ((_command_6 instanceof For)) {
        _builder.append("for ");
        EObject _command_7 = c.getCommand();
        Expr _expr_1 = ((For) _command_7).getExpr();
        Object _compile_3 = this.compile(_expr_1);
        _builder.append(_compile_3, "");
        _builder.append(" do");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        EObject _command_8 = c.getCommand();
        Commands _commands_1 = ((For) _command_8).getCommands();
        Object _compile_4 = this.compile(_commands_1);
        _builder.append(_compile_4, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t", "");
        _builder.append("od");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EObject _command_9 = c.getCommand();
      if ((_command_9 instanceof Foreach)) {
        _builder.append("foreach ");
        EObject _command_10 = c.getCommand();
        Expr _expr1 = ((Foreach) _command_10).getExpr1();
        Object _compile_5 = this.compile(_expr1);
        _builder.append(_compile_5, "");
        _builder.append(" in ");
        EObject _command_11 = c.getCommand();
        Expr _expr2 = ((Foreach) _command_11).getExpr2();
        Object _compile_6 = this.compile(_expr2);
        _builder.append(_compile_6, "");
        _builder.append(" do");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        EObject _command_12 = c.getCommand();
        Commands _commands_2 = ((Foreach) _command_12).getCommands();
        Object _compile_7 = this.compile(_commands_2);
        _builder.append(_compile_7, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t", "");
        _builder.append("od");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EObject _command_13 = c.getCommand();
      if ((_command_13 instanceof If)) {
        _builder.append("if ");
        EObject _command_14 = c.getCommand();
        Expr _expr_2 = ((If) _command_14).getExpr();
        Object _compile_8 = this.compile(_expr_2);
        _builder.append(_compile_8, "");
        _builder.append(" then ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        EObject _command_15 = c.getCommand();
        Commands _commands1 = ((If) _command_15).getCommands1();
        Object _compile_9 = this.compile(_commands1);
        _builder.append(_compile_9, "\t");
        _builder.newLineIfNotEmpty();
        {
          EObject _command_16 = c.getCommand();
          Commands _commands2 = ((If) _command_16).getCommands2();
          boolean _notEquals = (!Objects.equal(_commands2, null));
          if (_notEquals) {
            _builder.append("\t", "");
            _builder.append("else ");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            EObject _command_17 = c.getCommand();
            Commands _commands2_1 = ((If) _command_17).getCommands2();
            Object _compile_10 = this.compile(_commands2_1);
            _builder.append(_compile_10, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t", "");
        _builder.append("fi");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Affectation aff) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<String> _affectations = aff.getAffectations();
      boolean _hasElements = false;
      for(final String v : _affectations) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" ,", "");
        }
        _builder.append(v, "");
      }
    }
    _builder.append(" := ");
    {
      EList<String> _valeurs = aff.getValeurs();
      boolean _hasElements_1 = false;
      for(final String v_1 : _valeurs) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(" ,", "");
        }
        _builder.append(v_1, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public Object compile(final Expr expr) {
    ExprAnd _exprAnd = expr.getExprAnd();
    boolean _notEquals = (!Objects.equal(_exprAnd, null));
    if (_notEquals) {
      ExprAnd _exprAnd_1 = expr.getExprAnd();
      return this.compile(_exprAnd_1);
    } else {
      ExprSimple _exprsimple = expr.getExprsimple();
      return this.compile(_exprsimple);
    }
  }
  
  public Object compile(final ExprAnd expr) {
    ExprAnd _exprAnd = expr.getExprAnd();
    boolean _equals = Objects.equal(_exprAnd, null);
    if (_equals) {
      ExprOr _exprOr = expr.getExprOr();
      return this.compile(_exprOr);
    } else {
      ExprOr _exprOr_1 = expr.getExprOr();
      Object _compile = this.compile(_exprOr_1);
      String _plus = (_compile + " && ");
      ExprAnd _exprAnd_1 = expr.getExprAnd();
      Object _compile_1 = this.compile(_exprAnd_1);
      return (_plus + _compile_1);
    }
  }
  
  public Object compile(final ExprOr expr) {
    ExprOr _exprOr = expr.getExprOr();
    boolean _equals = Objects.equal(_exprOr, null);
    if (_equals) {
      ExprNot _exprNot = expr.getExprNot();
      return this.compile(_exprNot);
    } else {
      ExprNot _exprNot_1 = expr.getExprNot();
      Object _compile = this.compile(_exprNot_1);
      String _plus = (_compile + " || ");
      ExprOr _exprOr_1 = expr.getExprOr();
      Object _compile_1 = this.compile(_exprOr_1);
      return (_plus + _compile_1);
    }
  }
  
  public Object compile(final ExprNot expr) {
    Not _not = expr.getNot();
    boolean _notEquals = (!Objects.equal(_not, null));
    if (_notEquals) {
      ExprEq _exprEq = expr.getExprEq();
      Object _compile = this.compile(_exprEq);
      return ("!" + _compile);
    } else {
      ExprEq _exprEq_1 = expr.getExprEq();
      return this.compile(_exprEq_1);
    }
  }
  
  public Object compile(final ExprEq expr) {
    Expr _expr = expr.getExpr();
    boolean _notEquals = (!Objects.equal(_expr, null));
    if (_notEquals) {
      Expr _expr_1 = expr.getExpr();
      return this.compile(_expr_1);
    } else {
      ExprSimple _exprSimple1 = expr.getExprSimple1();
      String _compile = this.compile(_exprSimple1);
      String _plus = (_compile + "=?");
      ExprSimple _exprSimple2 = expr.getExprSimple2();
      String _compile_1 = this.compile(_exprSimple2);
      return (_plus + _compile_1);
    }
  }
  
  public String compile(final ExprSimple expr) {
    Nil2 _nil = expr.getNil();
    boolean _notEquals = (!Objects.equal(_nil, null));
    if (_notEquals) {
      return "nil";
    }
    String _variable = expr.getVariable();
    boolean _notEquals_1 = (!Objects.equal(_variable, null));
    if (_notEquals_1) {
      return expr.getVariable();
    }
    if (((!Objects.equal(expr.getSymbol(), null)) && Objects.equal(expr.getLexpr(), null))) {
      return expr.getSymbol();
    }
    Cons _cons = expr.getCons();
    boolean _notEquals_2 = (!Objects.equal(_cons, null));
    if (_notEquals_2) {
      Lexpr _lexpr = expr.getLexpr();
      Object _compile = this.compile(_lexpr);
      String _plus = ("(cons " + _compile);
      return (_plus + ")");
    }
    List _list = expr.getList();
    boolean _notEquals_3 = (!Objects.equal(_list, null));
    if (_notEquals_3) {
      Lexpr _lexpr_1 = expr.getLexpr();
      Object _compile_1 = this.compile(_lexpr_1);
      String _plus_1 = ("(list " + _compile_1);
      return (_plus_1 + ")");
    }
    Hd _hd = expr.getHd();
    boolean _notEquals_4 = (!Objects.equal(_hd, null));
    if (_notEquals_4) {
      Expr _expr = expr.getExpr();
      Object _compile_2 = this.compile(_expr);
      String _plus_2 = ("(hd " + _compile_2);
      return (_plus_2 + ")");
    }
    Tl _tl = expr.getTl();
    boolean _notEquals_5 = (!Objects.equal(_tl, null));
    if (_notEquals_5) {
      Expr _expr_1 = expr.getExpr();
      Object _compile_3 = this.compile(_expr_1);
      String _plus_3 = ("(tl " + _compile_3);
      return (_plus_3 + ")");
    }
    String _symbol = expr.getSymbol();
    boolean _notEquals_6 = (!Objects.equal(_symbol, null));
    if (_notEquals_6) {
      String _symbol_1 = expr.getSymbol();
      String _plus_4 = ("( " + _symbol_1);
      Lexpr _lexpr_2 = expr.getLexpr();
      Object _compile_4 = this.compile(_lexpr_2);
      String _plus_5 = (_plus_4 + _compile_4);
      return (_plus_5 + ")");
    }
    return null;
  }
  
  public Object compile(final Lexpr expr) {
    Lexpr _lexpr = expr.getLexpr();
    boolean _notEquals = (!Objects.equal(_lexpr, null));
    if (_notEquals) {
      Expr _expr = expr.getExpr();
      Object _compile = this.compile(_expr);
      String _plus = (_compile + " ");
      Lexpr _lexpr_1 = expr.getLexpr();
      Object _compile_1 = this.compile(_lexpr_1);
      return (_plus + _compile_1);
    } else {
      Expr _expr_1 = expr.getExpr();
      return this.compile(_expr_1);
    }
  }
}
