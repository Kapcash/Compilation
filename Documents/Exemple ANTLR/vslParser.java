// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 vsl.g 2009-11-02 17:54:34

//import java.util.*; //conflict with BitSet


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class vslParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IMAGINERY_TOKEN", "PROG", "CORPS", "FCALL_S", "BLOCK", "FCALL", "ARDEC", "PARAM", "ARRAY", "ARELEM", "INST", "DEC", "FUNC_KW", "IDENT", "PG", "PD", "PROTO_KW", "INT_KW", "VOID_KW", "VIRG", "CG", "CD", "ASSIGN_KW", "RETURN_KW", "PRINT_KW", "READ_KW", "IF_KW", "THEN_KW", "ELSE_KW", "FI_KW", "WHILE_KW", "DO_KW", "OD_KW", "AG", "AD", "PLUS", "MOINS", "MUL", "DIV", "INTEGER", "TEXT", "WS", "COMMENT", "LETTER", "DIGIT", "ASCII"
    };
    public static final int DEC=15;
    public static final int LETTER=47;
    public static final int OD_KW=36;
    public static final int PARAM=11;
    public static final int EOF=-1;
    public static final int INT_KW=21;
    public static final int INST=14;
    public static final int MOINS=40;
    public static final int PROG=5;
    public static final int RETURN_KW=27;
    public static final int IMAGINERY_TOKEN=4;
    public static final int ARELEM=13;
    public static final int ARDEC=10;
    public static final int IF_KW=30;
    public static final int VIRG=23;
    public static final int AD=38;
    public static final int IDENT=17;
    public static final int PLUS=39;
    public static final int FI_KW=33;
    public static final int AG=37;
    public static final int DIGIT=48;
    public static final int ASSIGN_KW=26;
    public static final int COMMENT=46;
    public static final int ARRAY=12;
    public static final int READ_KW=29;
    public static final int INTEGER=43;
    public static final int FCALL=9;
    public static final int DO_KW=35;
    public static final int FUNC_KW=16;
    public static final int ELSE_KW=32;
    public static final int TEXT=44;
    public static final int MUL=41;
    public static final int THEN_KW=31;
    public static final int WS=45;
    public static final int PROTO_KW=20;
    public static final int WHILE_KW=34;
    public static final int CORPS=6;
    public static final int BLOCK=8;
    public static final int ASCII=49;
    public static final int FCALL_S=7;
    public static final int CG=24;
    public static final int CD=25;
    public static final int DIV=42;
    public static final int PD=19;
    public static final int PRINT_KW=28;
    public static final int PG=18;
    public static final int VOID_KW=22;

    // delegates
    // delegators


        public vslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public vslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return vslParser.tokenNames; }
    public String getGrammarFileName() { return "vsl.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // vsl.g:34:1: program : ( unite )+ -> ^( PROG ( unite )+ ) ;
    public final vslParser.program_return program() throws RecognitionException {
        vslParser.program_return retval = new vslParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        vslParser.unite_return unite1 = null;


        RewriteRuleSubtreeStream stream_unite=new RewriteRuleSubtreeStream(adaptor,"rule unite");
        try {
            // vsl.g:34:10: ( ( unite )+ -> ^( PROG ( unite )+ ) )
            // vsl.g:34:12: ( unite )+
            {
            // vsl.g:34:12: ( unite )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNC_KW||LA1_0==PROTO_KW) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // vsl.g:34:12: unite
            	    {
            	    pushFollow(FOLLOW_unite_in_program147);
            	    unite1=unite();

            	    state._fsp--;

            	    stream_unite.add(unite1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);



            // AST REWRITE
            // elements: unite
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 35:17: -> ^( PROG ( unite )+ )
            {
                // vsl.g:35:20: ^( PROG ( unite )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROG, "PROG"), root_1);

                if ( !(stream_unite.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_unite.hasNext() ) {
                    adaptor.addChild(root_1, stream_unite.nextTree());

                }
                stream_unite.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class unite_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unite"
    // vsl.g:38:1: unite : ( function | proto );
    public final vslParser.unite_return unite() throws RecognitionException {
        vslParser.unite_return retval = new vslParser.unite_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        vslParser.function_return function2 = null;

        vslParser.proto_return proto3 = null;



        try {
            // vsl.g:38:7: ( function | proto )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FUNC_KW) ) {
                alt2=1;
            }
            else if ( (LA2_0==PROTO_KW) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // vsl.g:38:9: function
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_function_in_unite185);
                    function2=function();

                    state._fsp--;

                    adaptor.addChild(root_0, function2.getTree());

                    }
                    break;
                case 2 :
                    // vsl.g:39:5: proto
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_proto_in_unite191);
                    proto3=proto();

                    state._fsp--;

                    adaptor.addChild(root_0, proto3.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unite"

    public static class function_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function"
    // vsl.g:42:1: function : FUNC_KW type IDENT PG param_list PD statement -> ^( FUNC_KW type IDENT param_list ^( CORPS statement ) ) ;
    public final vslParser.function_return function() throws RecognitionException {
        vslParser.function_return retval = new vslParser.function_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FUNC_KW4=null;
        Token IDENT6=null;
        Token PG7=null;
        Token PD9=null;
        vslParser.type_return type5 = null;

        vslParser.param_list_return param_list8 = null;

        vslParser.statement_return statement10 = null;


        CommonTree FUNC_KW4_tree=null;
        CommonTree IDENT6_tree=null;
        CommonTree PG7_tree=null;
        CommonTree PD9_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_PD=new RewriteRuleTokenStream(adaptor,"token PD");
        RewriteRuleTokenStream stream_PG=new RewriteRuleTokenStream(adaptor,"token PG");
        RewriteRuleTokenStream stream_FUNC_KW=new RewriteRuleTokenStream(adaptor,"token FUNC_KW");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_param_list=new RewriteRuleSubtreeStream(adaptor,"rule param_list");
        try {
            // vsl.g:42:10: ( FUNC_KW type IDENT PG param_list PD statement -> ^( FUNC_KW type IDENT param_list ^( CORPS statement ) ) )
            // vsl.g:42:12: FUNC_KW type IDENT PG param_list PD statement
            {
            FUNC_KW4=(Token)match(input,FUNC_KW,FOLLOW_FUNC_KW_in_function202);  
            stream_FUNC_KW.add(FUNC_KW4);

            pushFollow(FOLLOW_type_in_function204);
            type5=type();

            state._fsp--;

            stream_type.add(type5.getTree());
            IDENT6=(Token)match(input,IDENT,FOLLOW_IDENT_in_function206);  
            stream_IDENT.add(IDENT6);

            PG7=(Token)match(input,PG,FOLLOW_PG_in_function208);  
            stream_PG.add(PG7);

            pushFollow(FOLLOW_param_list_in_function210);
            param_list8=param_list();

            state._fsp--;

            stream_param_list.add(param_list8.getTree());
            PD9=(Token)match(input,PD,FOLLOW_PD_in_function212);  
            stream_PD.add(PD9);

            pushFollow(FOLLOW_statement_in_function214);
            statement10=statement();

            state._fsp--;

            stream_statement.add(statement10.getTree());


            // AST REWRITE
            // elements: statement, type, param_list, IDENT, FUNC_KW
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 43:17: -> ^( FUNC_KW type IDENT param_list ^( CORPS statement ) )
            {
                // vsl.g:43:20: ^( FUNC_KW type IDENT param_list ^( CORPS statement ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_FUNC_KW.nextNode(), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_IDENT.nextNode());
                adaptor.addChild(root_1, stream_param_list.nextTree());
                // vsl.g:43:52: ^( CORPS statement )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CORPS, "CORPS"), root_2);

                adaptor.addChild(root_2, stream_statement.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function"

    public static class proto_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "proto"
    // vsl.g:47:1: proto : PROTO_KW type IDENT PG param_list PD ;
    public final vslParser.proto_return proto() throws RecognitionException {
        vslParser.proto_return retval = new vslParser.proto_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PROTO_KW11=null;
        Token IDENT13=null;
        Token PG14=null;
        Token PD16=null;
        vslParser.type_return type12 = null;

        vslParser.param_list_return param_list15 = null;


        CommonTree PROTO_KW11_tree=null;
        CommonTree IDENT13_tree=null;
        CommonTree PG14_tree=null;
        CommonTree PD16_tree=null;

        try {
            // vsl.g:47:8: ( PROTO_KW type IDENT PG param_list PD )
            // vsl.g:47:11: PROTO_KW type IDENT PG param_list PD
            {
            root_0 = (CommonTree)adaptor.nil();

            PROTO_KW11=(Token)match(input,PROTO_KW,FOLLOW_PROTO_KW_in_proto262); 
            PROTO_KW11_tree = (CommonTree)adaptor.create(PROTO_KW11);
            root_0 = (CommonTree)adaptor.becomeRoot(PROTO_KW11_tree, root_0);

            pushFollow(FOLLOW_type_in_proto265);
            type12=type();

            state._fsp--;

            adaptor.addChild(root_0, type12.getTree());
            IDENT13=(Token)match(input,IDENT,FOLLOW_IDENT_in_proto267); 
            IDENT13_tree = (CommonTree)adaptor.create(IDENT13);
            adaptor.addChild(root_0, IDENT13_tree);

            PG14=(Token)match(input,PG,FOLLOW_PG_in_proto269); 
            pushFollow(FOLLOW_param_list_in_proto272);
            param_list15=param_list();

            state._fsp--;

            adaptor.addChild(root_0, param_list15.getTree());
            PD16=(Token)match(input,PD,FOLLOW_PD_in_proto274); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "proto"

    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // vsl.g:50:1: type : ( INT_KW | VOID_KW );
    public final vslParser.type_return type() throws RecognitionException {
        vslParser.type_return retval = new vslParser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INT_KW17=null;
        Token VOID_KW18=null;

        CommonTree INT_KW17_tree=null;
        CommonTree VOID_KW18_tree=null;

        try {
            // vsl.g:50:7: ( INT_KW | VOID_KW )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==INT_KW) ) {
                alt3=1;
            }
            else if ( (LA3_0==VOID_KW) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // vsl.g:50:9: INT_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INT_KW17=(Token)match(input,INT_KW,FOLLOW_INT_KW_in_type287); 
                    INT_KW17_tree = (CommonTree)adaptor.create(INT_KW17);
                    root_0 = (CommonTree)adaptor.becomeRoot(INT_KW17_tree, root_0);


                    }
                    break;
                case 2 :
                    // vsl.g:51:5: VOID_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VOID_KW18=(Token)match(input,VOID_KW,FOLLOW_VOID_KW_in_type295); 
                    VOID_KW18_tree = (CommonTree)adaptor.create(VOID_KW18);
                    root_0 = (CommonTree)adaptor.becomeRoot(VOID_KW18_tree, root_0);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class param_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param_list"
    // vsl.g:54:1: param_list : ( param ( VIRG param )* -> ^( PARAM ( param )+ ) | -> ^( PARAM ) );
    public final vslParser.param_list_return param_list() throws RecognitionException {
        vslParser.param_list_return retval = new vslParser.param_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VIRG20=null;
        vslParser.param_return param19 = null;

        vslParser.param_return param21 = null;


        CommonTree VIRG20_tree=null;
        RewriteRuleTokenStream stream_VIRG=new RewriteRuleTokenStream(adaptor,"token VIRG");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        try {
            // vsl.g:54:12: ( param ( VIRG param )* -> ^( PARAM ( param )+ ) | -> ^( PARAM ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IDENT) ) {
                alt5=1;
            }
            else if ( (LA5_0==PD) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // vsl.g:54:14: param ( VIRG param )*
                    {
                    pushFollow(FOLLOW_param_in_param_list307);
                    param19=param();

                    state._fsp--;

                    stream_param.add(param19.getTree());
                    // vsl.g:54:20: ( VIRG param )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==VIRG) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // vsl.g:54:22: VIRG param
                    	    {
                    	    VIRG20=(Token)match(input,VIRG,FOLLOW_VIRG_in_param_list311);  
                    	    stream_VIRG.add(VIRG20);

                    	    pushFollow(FOLLOW_param_in_param_list313);
                    	    param21=param();

                    	    state._fsp--;

                    	    stream_param.add(param21.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: param
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 55:17: -> ^( PARAM ( param )+ )
                    {
                        // vsl.g:55:20: ^( PARAM ( param )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAM, "PARAM"), root_1);

                        if ( !(stream_param.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_param.hasNext() ) {
                            adaptor.addChild(root_1, stream_param.nextTree());

                        }
                        stream_param.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // vsl.g:56:5: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 56:5: -> ^( PARAM )
                    {
                        // vsl.g:56:8: ^( PARAM )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAM, "PARAM"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "param_list"

    public static class param_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param"
    // vsl.g:59:1: param : ( IDENT | IDENT CG CD -> ^( ARRAY IDENT ) );
    public final vslParser.param_return param() throws RecognitionException {
        vslParser.param_return retval = new vslParser.param_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT22=null;
        Token IDENT23=null;
        Token CG24=null;
        Token CD25=null;

        CommonTree IDENT22_tree=null;
        CommonTree IDENT23_tree=null;
        CommonTree CG24_tree=null;
        CommonTree CD25_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_CG=new RewriteRuleTokenStream(adaptor,"token CG");
        RewriteRuleTokenStream stream_CD=new RewriteRuleTokenStream(adaptor,"token CD");

        try {
            // vsl.g:59:8: ( IDENT | IDENT CG CD -> ^( ARRAY IDENT ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==CG) ) {
                    alt6=2;
                }
                else if ( (LA6_1==PD||LA6_1==VIRG) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // vsl.g:59:10: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT22=(Token)match(input,IDENT,FOLLOW_IDENT_in_param363); 
                    IDENT22_tree = (CommonTree)adaptor.create(IDENT22);
                    adaptor.addChild(root_0, IDENT22_tree);


                    }
                    break;
                case 2 :
                    // vsl.g:60:12: IDENT CG CD
                    {
                    IDENT23=(Token)match(input,IDENT,FOLLOW_IDENT_in_param376);  
                    stream_IDENT.add(IDENT23);

                    CG24=(Token)match(input,CG,FOLLOW_CG_in_param378);  
                    stream_CG.add(CG24);

                    CD25=(Token)match(input,CD,FOLLOW_CD_in_param380);  
                    stream_CD.add(CD25);



                    // AST REWRITE
                    // elements: IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 61:17: -> ^( ARRAY IDENT )
                    {
                        // vsl.g:61:20: ^( ARRAY IDENT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY, "ARRAY"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "param"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // vsl.g:64:1: statement : ( IDENT ASSIGN_KW expression | tab_elem ASSIGN_KW expression -> ^( ASSIGN_KW tab_elem expression ) | RETURN_KW expression | PRINT_KW print_list | READ_KW read_list | IF_KW expression THEN_KW statement ( ELSE_KW statement )? FI_KW | WHILE_KW expression DO_KW statement OD_KW | IDENT PG ( argument_list )? PD -> ^( FCALL_S IDENT ( argument_list )? ) | block );
    public final vslParser.statement_return statement() throws RecognitionException {
        vslParser.statement_return retval = new vslParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT26=null;
        Token ASSIGN_KW27=null;
        Token ASSIGN_KW30=null;
        Token RETURN_KW32=null;
        Token PRINT_KW34=null;
        Token READ_KW36=null;
        Token IF_KW38=null;
        Token THEN_KW40=null;
        Token ELSE_KW42=null;
        Token FI_KW44=null;
        Token WHILE_KW45=null;
        Token DO_KW47=null;
        Token OD_KW49=null;
        Token IDENT50=null;
        Token PG51=null;
        Token PD53=null;
        vslParser.expression_return expression28 = null;

        vslParser.tab_elem_return tab_elem29 = null;

        vslParser.expression_return expression31 = null;

        vslParser.expression_return expression33 = null;

        vslParser.print_list_return print_list35 = null;

        vslParser.read_list_return read_list37 = null;

        vslParser.expression_return expression39 = null;

        vslParser.statement_return statement41 = null;

        vslParser.statement_return statement43 = null;

        vslParser.expression_return expression46 = null;

        vslParser.statement_return statement48 = null;

        vslParser.argument_list_return argument_list52 = null;

        vslParser.block_return block54 = null;


        CommonTree IDENT26_tree=null;
        CommonTree ASSIGN_KW27_tree=null;
        CommonTree ASSIGN_KW30_tree=null;
        CommonTree RETURN_KW32_tree=null;
        CommonTree PRINT_KW34_tree=null;
        CommonTree READ_KW36_tree=null;
        CommonTree IF_KW38_tree=null;
        CommonTree THEN_KW40_tree=null;
        CommonTree ELSE_KW42_tree=null;
        CommonTree FI_KW44_tree=null;
        CommonTree WHILE_KW45_tree=null;
        CommonTree DO_KW47_tree=null;
        CommonTree OD_KW49_tree=null;
        CommonTree IDENT50_tree=null;
        CommonTree PG51_tree=null;
        CommonTree PD53_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_ASSIGN_KW=new RewriteRuleTokenStream(adaptor,"token ASSIGN_KW");
        RewriteRuleTokenStream stream_PD=new RewriteRuleTokenStream(adaptor,"token PD");
        RewriteRuleTokenStream stream_PG=new RewriteRuleTokenStream(adaptor,"token PG");
        RewriteRuleSubtreeStream stream_argument_list=new RewriteRuleSubtreeStream(adaptor,"rule argument_list");
        RewriteRuleSubtreeStream stream_tab_elem=new RewriteRuleSubtreeStream(adaptor,"rule tab_elem");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // vsl.g:64:11: ( IDENT ASSIGN_KW expression | tab_elem ASSIGN_KW expression -> ^( ASSIGN_KW tab_elem expression ) | RETURN_KW expression | PRINT_KW print_list | READ_KW read_list | IF_KW expression THEN_KW statement ( ELSE_KW statement )? FI_KW | WHILE_KW expression DO_KW statement OD_KW | IDENT PG ( argument_list )? PD -> ^( FCALL_S IDENT ( argument_list )? ) | block )
            int alt9=9;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // vsl.g:64:13: IDENT ASSIGN_KW expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT26=(Token)match(input,IDENT,FOLLOW_IDENT_in_statement417); 
                    IDENT26_tree = (CommonTree)adaptor.create(IDENT26);
                    adaptor.addChild(root_0, IDENT26_tree);

                    ASSIGN_KW27=(Token)match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_statement419); 
                    ASSIGN_KW27_tree = (CommonTree)adaptor.create(ASSIGN_KW27);
                    root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN_KW27_tree, root_0);

                    pushFollow(FOLLOW_expression_in_statement422);
                    expression28=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression28.getTree());

                    }
                    break;
                case 2 :
                    // vsl.g:65:5: tab_elem ASSIGN_KW expression
                    {
                    pushFollow(FOLLOW_tab_elem_in_statement428);
                    tab_elem29=tab_elem();

                    state._fsp--;

                    stream_tab_elem.add(tab_elem29.getTree());
                    ASSIGN_KW30=(Token)match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_statement430);  
                    stream_ASSIGN_KW.add(ASSIGN_KW30);

                    pushFollow(FOLLOW_expression_in_statement432);
                    expression31=expression();

                    state._fsp--;

                    stream_expression.add(expression31.getTree());


                    // AST REWRITE
                    // elements: ASSIGN_KW, expression, tab_elem
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 66:5: -> ^( ASSIGN_KW tab_elem expression )
                    {
                        // vsl.g:66:8: ^( ASSIGN_KW tab_elem expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_ASSIGN_KW.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_tab_elem.nextTree());
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // vsl.g:67:5: RETURN_KW expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    RETURN_KW32=(Token)match(input,RETURN_KW,FOLLOW_RETURN_KW_in_statement452); 
                    RETURN_KW32_tree = (CommonTree)adaptor.create(RETURN_KW32);
                    root_0 = (CommonTree)adaptor.becomeRoot(RETURN_KW32_tree, root_0);

                    pushFollow(FOLLOW_expression_in_statement455);
                    expression33=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression33.getTree());

                    }
                    break;
                case 4 :
                    // vsl.g:68:5: PRINT_KW print_list
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PRINT_KW34=(Token)match(input,PRINT_KW,FOLLOW_PRINT_KW_in_statement461); 
                    PRINT_KW34_tree = (CommonTree)adaptor.create(PRINT_KW34);
                    root_0 = (CommonTree)adaptor.becomeRoot(PRINT_KW34_tree, root_0);

                    pushFollow(FOLLOW_print_list_in_statement464);
                    print_list35=print_list();

                    state._fsp--;

                    adaptor.addChild(root_0, print_list35.getTree());

                    }
                    break;
                case 5 :
                    // vsl.g:69:5: READ_KW read_list
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    READ_KW36=(Token)match(input,READ_KW,FOLLOW_READ_KW_in_statement470); 
                    READ_KW36_tree = (CommonTree)adaptor.create(READ_KW36);
                    root_0 = (CommonTree)adaptor.becomeRoot(READ_KW36_tree, root_0);

                    pushFollow(FOLLOW_read_list_in_statement473);
                    read_list37=read_list();

                    state._fsp--;

                    adaptor.addChild(root_0, read_list37.getTree());

                    }
                    break;
                case 6 :
                    // vsl.g:70:5: IF_KW expression THEN_KW statement ( ELSE_KW statement )? FI_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IF_KW38=(Token)match(input,IF_KW,FOLLOW_IF_KW_in_statement479); 
                    IF_KW38_tree = (CommonTree)adaptor.create(IF_KW38);
                    root_0 = (CommonTree)adaptor.becomeRoot(IF_KW38_tree, root_0);

                    pushFollow(FOLLOW_expression_in_statement482);
                    expression39=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression39.getTree());
                    THEN_KW40=(Token)match(input,THEN_KW,FOLLOW_THEN_KW_in_statement484); 
                    pushFollow(FOLLOW_statement_in_statement487);
                    statement41=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement41.getTree());
                    // vsl.g:70:42: ( ELSE_KW statement )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==ELSE_KW) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // vsl.g:70:43: ELSE_KW statement
                            {
                            ELSE_KW42=(Token)match(input,ELSE_KW,FOLLOW_ELSE_KW_in_statement490); 
                            pushFollow(FOLLOW_statement_in_statement493);
                            statement43=statement();

                            state._fsp--;

                            adaptor.addChild(root_0, statement43.getTree());

                            }
                            break;

                    }

                    FI_KW44=(Token)match(input,FI_KW,FOLLOW_FI_KW_in_statement497); 

                    }
                    break;
                case 7 :
                    // vsl.g:71:5: WHILE_KW expression DO_KW statement OD_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WHILE_KW45=(Token)match(input,WHILE_KW,FOLLOW_WHILE_KW_in_statement504); 
                    WHILE_KW45_tree = (CommonTree)adaptor.create(WHILE_KW45);
                    root_0 = (CommonTree)adaptor.becomeRoot(WHILE_KW45_tree, root_0);

                    pushFollow(FOLLOW_expression_in_statement507);
                    expression46=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression46.getTree());
                    DO_KW47=(Token)match(input,DO_KW,FOLLOW_DO_KW_in_statement509); 
                    pushFollow(FOLLOW_statement_in_statement512);
                    statement48=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement48.getTree());
                    OD_KW49=(Token)match(input,OD_KW,FOLLOW_OD_KW_in_statement514); 

                    }
                    break;
                case 8 :
                    // vsl.g:72:5: IDENT PG ( argument_list )? PD
                    {
                    IDENT50=(Token)match(input,IDENT,FOLLOW_IDENT_in_statement521);  
                    stream_IDENT.add(IDENT50);

                    PG51=(Token)match(input,PG,FOLLOW_PG_in_statement523);  
                    stream_PG.add(PG51);

                    // vsl.g:72:14: ( argument_list )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=IDENT && LA8_0<=PG)||LA8_0==INTEGER) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // vsl.g:72:14: argument_list
                            {
                            pushFollow(FOLLOW_argument_list_in_statement525);
                            argument_list52=argument_list();

                            state._fsp--;

                            stream_argument_list.add(argument_list52.getTree());

                            }
                            break;

                    }

                    PD53=(Token)match(input,PD,FOLLOW_PD_in_statement528);  
                    stream_PD.add(PD53);



                    // AST REWRITE
                    // elements: IDENT, argument_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 73:5: -> ^( FCALL_S IDENT ( argument_list )? )
                    {
                        // vsl.g:73:7: ^( FCALL_S IDENT ( argument_list )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FCALL_S, "FCALL_S"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        // vsl.g:73:23: ( argument_list )?
                        if ( stream_argument_list.hasNext() ) {
                            adaptor.addChild(root_1, stream_argument_list.nextTree());

                        }
                        stream_argument_list.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 9 :
                    // vsl.g:74:5: block
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement548);
                    block54=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block54.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // vsl.g:77:1: block : ( AG declaration suit_inst AD -> ^( BLOCK declaration suit_inst ) | AG suit_inst AD -> ^( BLOCK suit_inst ) );
    public final vslParser.block_return block() throws RecognitionException {
        vslParser.block_return retval = new vslParser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AG55=null;
        Token AD58=null;
        Token AG59=null;
        Token AD61=null;
        vslParser.declaration_return declaration56 = null;

        vslParser.suit_inst_return suit_inst57 = null;

        vslParser.suit_inst_return suit_inst60 = null;


        CommonTree AG55_tree=null;
        CommonTree AD58_tree=null;
        CommonTree AG59_tree=null;
        CommonTree AD61_tree=null;
        RewriteRuleTokenStream stream_AD=new RewriteRuleTokenStream(adaptor,"token AD");
        RewriteRuleTokenStream stream_AG=new RewriteRuleTokenStream(adaptor,"token AG");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_suit_inst=new RewriteRuleSubtreeStream(adaptor,"rule suit_inst");
        try {
            // vsl.g:77:7: ( AG declaration suit_inst AD -> ^( BLOCK declaration suit_inst ) | AG suit_inst AD -> ^( BLOCK suit_inst ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==AG) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==INT_KW) ) {
                    alt10=1;
                }
                else if ( (LA10_1==IDENT||(LA10_1>=RETURN_KW && LA10_1<=IF_KW)||LA10_1==WHILE_KW||LA10_1==AG) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // vsl.g:77:9: AG declaration suit_inst AD
                    {
                    AG55=(Token)match(input,AG,FOLLOW_AG_in_block560);  
                    stream_AG.add(AG55);

                    pushFollow(FOLLOW_declaration_in_block562);
                    declaration56=declaration();

                    state._fsp--;

                    stream_declaration.add(declaration56.getTree());
                    pushFollow(FOLLOW_suit_inst_in_block565);
                    suit_inst57=suit_inst();

                    state._fsp--;

                    stream_suit_inst.add(suit_inst57.getTree());
                    AD58=(Token)match(input,AD,FOLLOW_AD_in_block567);  
                    stream_AD.add(AD58);



                    // AST REWRITE
                    // elements: suit_inst, declaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 78:5: -> ^( BLOCK declaration suit_inst )
                    {
                        // vsl.g:78:8: ^( BLOCK declaration suit_inst )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                        adaptor.addChild(root_1, stream_declaration.nextTree());
                        adaptor.addChild(root_1, stream_suit_inst.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // vsl.g:79:5: AG suit_inst AD
                    {
                    AG59=(Token)match(input,AG,FOLLOW_AG_in_block588);  
                    stream_AG.add(AG59);

                    pushFollow(FOLLOW_suit_inst_in_block590);
                    suit_inst60=suit_inst();

                    state._fsp--;

                    stream_suit_inst.add(suit_inst60.getTree());
                    AD61=(Token)match(input,AD,FOLLOW_AD_in_block592);  
                    stream_AD.add(AD61);



                    // AST REWRITE
                    // elements: suit_inst
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 80:6: -> ^( BLOCK suit_inst )
                    {
                        // vsl.g:80:9: ^( BLOCK suit_inst )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                        adaptor.addChild(root_1, stream_suit_inst.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class tab_elem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tab_elem"
    // vsl.g:84:1: tab_elem : IDENT CG expression CD -> ^( ARELEM IDENT expression ) ;
    public final vslParser.tab_elem_return tab_elem() throws RecognitionException {
        vslParser.tab_elem_return retval = new vslParser.tab_elem_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT62=null;
        Token CG63=null;
        Token CD65=null;
        vslParser.expression_return expression64 = null;


        CommonTree IDENT62_tree=null;
        CommonTree CG63_tree=null;
        CommonTree CD65_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_CG=new RewriteRuleTokenStream(adaptor,"token CG");
        RewriteRuleTokenStream stream_CD=new RewriteRuleTokenStream(adaptor,"token CD");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // vsl.g:84:10: ( IDENT CG expression CD -> ^( ARELEM IDENT expression ) )
            // vsl.g:84:13: IDENT CG expression CD
            {
            IDENT62=(Token)match(input,IDENT,FOLLOW_IDENT_in_tab_elem620);  
            stream_IDENT.add(IDENT62);

            CG63=(Token)match(input,CG,FOLLOW_CG_in_tab_elem622);  
            stream_CG.add(CG63);

            pushFollow(FOLLOW_expression_in_tab_elem624);
            expression64=expression();

            state._fsp--;

            stream_expression.add(expression64.getTree());
            CD65=(Token)match(input,CD,FOLLOW_CD_in_tab_elem626);  
            stream_CD.add(CD65);



            // AST REWRITE
            // elements: expression, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 85:21: -> ^( ARELEM IDENT expression )
            {
                // vsl.g:85:24: ^( ARELEM IDENT expression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARELEM, "ARELEM"), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());
                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tab_elem"

    public static class suit_inst_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "suit_inst"
    // vsl.g:88:1: suit_inst : ( statement )+ -> ^( INST ( statement )+ ) ;
    public final vslParser.suit_inst_return suit_inst() throws RecognitionException {
        vslParser.suit_inst_return retval = new vslParser.suit_inst_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        vslParser.statement_return statement66 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // vsl.g:88:11: ( ( statement )+ -> ^( INST ( statement )+ ) )
            // vsl.g:88:13: ( statement )+
            {
            // vsl.g:88:13: ( statement )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==IDENT||(LA11_0>=RETURN_KW && LA11_0<=IF_KW)||LA11_0==WHILE_KW||LA11_0==AG) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // vsl.g:88:13: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_suit_inst667);
            	    statement66=statement();

            	    state._fsp--;

            	    stream_statement.add(statement66.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 89:17: -> ^( INST ( statement )+ )
            {
                // vsl.g:89:20: ^( INST ( statement )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INST, "INST"), root_1);

                if ( !(stream_statement.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "suit_inst"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // vsl.g:93:1: expression : fact ( ( PLUS | MOINS ) fact )* ;
    public final vslParser.expression_return expression() throws RecognitionException {
        vslParser.expression_return retval = new vslParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS68=null;
        Token MOINS69=null;
        vslParser.fact_return fact67 = null;

        vslParser.fact_return fact70 = null;


        CommonTree PLUS68_tree=null;
        CommonTree MOINS69_tree=null;

        try {
            // vsl.g:93:12: ( fact ( ( PLUS | MOINS ) fact )* )
            // vsl.g:93:14: fact ( ( PLUS | MOINS ) fact )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_fact_in_expression707);
            fact67=fact();

            state._fsp--;

            adaptor.addChild(root_0, fact67.getTree());
            // vsl.g:93:19: ( ( PLUS | MOINS ) fact )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=PLUS && LA13_0<=MOINS)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // vsl.g:93:20: ( PLUS | MOINS ) fact
            	    {
            	    // vsl.g:93:20: ( PLUS | MOINS )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==PLUS) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==MOINS) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // vsl.g:93:21: PLUS
            	            {
            	            PLUS68=(Token)match(input,PLUS,FOLLOW_PLUS_in_expression711); 
            	            PLUS68_tree = (CommonTree)adaptor.create(PLUS68);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS68_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // vsl.g:93:27: MOINS
            	            {
            	            MOINS69=(Token)match(input,MOINS,FOLLOW_MOINS_in_expression714); 
            	            MOINS69_tree = (CommonTree)adaptor.create(MOINS69);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MOINS69_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_fact_in_expression718);
            	    fact70=fact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fact70.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class fact_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fact"
    // vsl.g:96:1: fact : primaire ( ( MUL | DIV ) primaire )* ;
    public final vslParser.fact_return fact() throws RecognitionException {
        vslParser.fact_return retval = new vslParser.fact_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MUL72=null;
        Token DIV73=null;
        vslParser.primaire_return primaire71 = null;

        vslParser.primaire_return primaire74 = null;


        CommonTree MUL72_tree=null;
        CommonTree DIV73_tree=null;

        try {
            // vsl.g:96:7: ( primaire ( ( MUL | DIV ) primaire )* )
            // vsl.g:96:9: primaire ( ( MUL | DIV ) primaire )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_primaire_in_fact732);
            primaire71=primaire();

            state._fsp--;

            adaptor.addChild(root_0, primaire71.getTree());
            // vsl.g:96:18: ( ( MUL | DIV ) primaire )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=MUL && LA15_0<=DIV)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // vsl.g:96:19: ( MUL | DIV ) primaire
            	    {
            	    // vsl.g:96:19: ( MUL | DIV )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==MUL) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==DIV) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // vsl.g:96:20: MUL
            	            {
            	            MUL72=(Token)match(input,MUL,FOLLOW_MUL_in_fact736); 
            	            MUL72_tree = (CommonTree)adaptor.create(MUL72);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MUL72_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // vsl.g:96:25: DIV
            	            {
            	            DIV73=(Token)match(input,DIV,FOLLOW_DIV_in_fact739); 
            	            DIV73_tree = (CommonTree)adaptor.create(DIV73);
            	            root_0 = (CommonTree)adaptor.becomeRoot(DIV73_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_primaire_in_fact743);
            	    primaire74=primaire();

            	    state._fsp--;

            	    adaptor.addChild(root_0, primaire74.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fact"

    public static class primaire_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primaire"
    // vsl.g:99:1: primaire : ( INTEGER | IDENT | tab_elem | IDENT PG ( argument_list )? PD -> ^( FCALL IDENT ( argument_list )? ) | PG expression PD );
    public final vslParser.primaire_return primaire() throws RecognitionException {
        vslParser.primaire_return retval = new vslParser.primaire_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INTEGER75=null;
        Token IDENT76=null;
        Token IDENT78=null;
        Token PG79=null;
        Token PD81=null;
        Token PG82=null;
        Token PD84=null;
        vslParser.tab_elem_return tab_elem77 = null;

        vslParser.argument_list_return argument_list80 = null;

        vslParser.expression_return expression83 = null;


        CommonTree INTEGER75_tree=null;
        CommonTree IDENT76_tree=null;
        CommonTree IDENT78_tree=null;
        CommonTree PG79_tree=null;
        CommonTree PD81_tree=null;
        CommonTree PG82_tree=null;
        CommonTree PD84_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_PD=new RewriteRuleTokenStream(adaptor,"token PD");
        RewriteRuleTokenStream stream_PG=new RewriteRuleTokenStream(adaptor,"token PG");
        RewriteRuleSubtreeStream stream_argument_list=new RewriteRuleSubtreeStream(adaptor,"rule argument_list");
        try {
            // vsl.g:99:10: ( INTEGER | IDENT | tab_elem | IDENT PG ( argument_list )? PD -> ^( FCALL IDENT ( argument_list )? ) | PG expression PD )
            int alt17=5;
            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt17=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case CG:
                    {
                    alt17=3;
                    }
                    break;
                case PG:
                    {
                    alt17=4;
                    }
                    break;
                case EOF:
                case FUNC_KW:
                case IDENT:
                case PD:
                case PROTO_KW:
                case VIRG:
                case CD:
                case RETURN_KW:
                case PRINT_KW:
                case READ_KW:
                case IF_KW:
                case THEN_KW:
                case ELSE_KW:
                case FI_KW:
                case WHILE_KW:
                case DO_KW:
                case OD_KW:
                case AG:
                case AD:
                case PLUS:
                case MOINS:
                case MUL:
                case DIV:
                    {
                    alt17=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }

                }
                break;
            case PG:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // vsl.g:99:12: INTEGER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INTEGER75=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_primaire756); 
                    INTEGER75_tree = (CommonTree)adaptor.create(INTEGER75);
                    adaptor.addChild(root_0, INTEGER75_tree);


                    }
                    break;
                case 2 :
                    // vsl.g:100:5: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT76=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaire762); 
                    IDENT76_tree = (CommonTree)adaptor.create(IDENT76);
                    adaptor.addChild(root_0, IDENT76_tree);


                    }
                    break;
                case 3 :
                    // vsl.g:101:11: tab_elem
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_tab_elem_in_primaire774);
                    tab_elem77=tab_elem();

                    state._fsp--;

                    adaptor.addChild(root_0, tab_elem77.getTree());

                    }
                    break;
                case 4 :
                    // vsl.g:102:5: IDENT PG ( argument_list )? PD
                    {
                    IDENT78=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaire780);  
                    stream_IDENT.add(IDENT78);

                    PG79=(Token)match(input,PG,FOLLOW_PG_in_primaire782);  
                    stream_PG.add(PG79);

                    // vsl.g:102:14: ( argument_list )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=IDENT && LA16_0<=PG)||LA16_0==INTEGER) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // vsl.g:102:14: argument_list
                            {
                            pushFollow(FOLLOW_argument_list_in_primaire784);
                            argument_list80=argument_list();

                            state._fsp--;

                            stream_argument_list.add(argument_list80.getTree());

                            }
                            break;

                    }

                    PD81=(Token)match(input,PD,FOLLOW_PD_in_primaire787);  
                    stream_PD.add(PD81);



                    // AST REWRITE
                    // elements: IDENT, argument_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 103:4: -> ^( FCALL IDENT ( argument_list )? )
                    {
                        // vsl.g:103:7: ^( FCALL IDENT ( argument_list )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FCALL, "FCALL"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        // vsl.g:103:21: ( argument_list )?
                        if ( stream_argument_list.hasNext() ) {
                            adaptor.addChild(root_1, stream_argument_list.nextTree());

                        }
                        stream_argument_list.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // vsl.g:104:5: PG expression PD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PG82=(Token)match(input,PG,FOLLOW_PG_in_primaire807); 
                    pushFollow(FOLLOW_expression_in_primaire810);
                    expression83=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression83.getTree());
                    PD84=(Token)match(input,PD,FOLLOW_PD_in_primaire812); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primaire"

    public static class argument_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argument_list"
    // vsl.g:107:1: argument_list : expression ( VIRG expression )* ;
    public final vslParser.argument_list_return argument_list() throws RecognitionException {
        vslParser.argument_list_return retval = new vslParser.argument_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VIRG86=null;
        vslParser.expression_return expression85 = null;

        vslParser.expression_return expression87 = null;


        CommonTree VIRG86_tree=null;

        try {
            // vsl.g:107:15: ( expression ( VIRG expression )* )
            // vsl.g:107:17: expression ( VIRG expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expression_in_argument_list824);
            expression85=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression85.getTree());
            // vsl.g:107:28: ( VIRG expression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==VIRG) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // vsl.g:107:30: VIRG expression
            	    {
            	    VIRG86=(Token)match(input,VIRG,FOLLOW_VIRG_in_argument_list828); 
            	    pushFollow(FOLLOW_expression_in_argument_list831);
            	    expression87=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression87.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "argument_list"

    public static class print_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "print_list"
    // vsl.g:111:1: print_list : print_item ( VIRG print_item )* ;
    public final vslParser.print_list_return print_list() throws RecognitionException {
        vslParser.print_list_return retval = new vslParser.print_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VIRG89=null;
        vslParser.print_item_return print_item88 = null;

        vslParser.print_item_return print_item90 = null;


        CommonTree VIRG89_tree=null;

        try {
            // vsl.g:111:12: ( print_item ( VIRG print_item )* )
            // vsl.g:111:14: print_item ( VIRG print_item )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_print_item_in_print_list846);
            print_item88=print_item();

            state._fsp--;

            adaptor.addChild(root_0, print_item88.getTree());
            // vsl.g:111:25: ( VIRG print_item )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==VIRG) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // vsl.g:111:27: VIRG print_item
            	    {
            	    VIRG89=(Token)match(input,VIRG,FOLLOW_VIRG_in_print_list850); 
            	    pushFollow(FOLLOW_print_item_in_print_list853);
            	    print_item90=print_item();

            	    state._fsp--;

            	    adaptor.addChild(root_0, print_item90.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "print_list"

    public static class print_item_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "print_item"
    // vsl.g:114:1: print_item : ( TEXT | expression );
    public final vslParser.print_item_return print_item() throws RecognitionException {
        vslParser.print_item_return retval = new vslParser.print_item_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TEXT91=null;
        vslParser.expression_return expression92 = null;


        CommonTree TEXT91_tree=null;

        try {
            // vsl.g:114:12: ( TEXT | expression )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==TEXT) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=IDENT && LA20_0<=PG)||LA20_0==INTEGER) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // vsl.g:114:14: TEXT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TEXT91=(Token)match(input,TEXT,FOLLOW_TEXT_in_print_item868); 
                    TEXT91_tree = (CommonTree)adaptor.create(TEXT91);
                    adaptor.addChild(root_0, TEXT91_tree);


                    }
                    break;
                case 2 :
                    // vsl.g:115:5: expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_print_item874);
                    expression92=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression92.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "print_item"

    public static class read_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "read_list"
    // vsl.g:118:1: read_list : read_item ( VIRG read_item )* ;
    public final vslParser.read_list_return read_list() throws RecognitionException {
        vslParser.read_list_return retval = new vslParser.read_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VIRG94=null;
        vslParser.read_item_return read_item93 = null;

        vslParser.read_item_return read_item95 = null;


        CommonTree VIRG94_tree=null;

        try {
            // vsl.g:118:11: ( read_item ( VIRG read_item )* )
            // vsl.g:118:13: read_item ( VIRG read_item )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_read_item_in_read_list885);
            read_item93=read_item();

            state._fsp--;

            adaptor.addChild(root_0, read_item93.getTree());
            // vsl.g:118:22: ( VIRG read_item )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==VIRG) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // vsl.g:118:24: VIRG read_item
            	    {
            	    VIRG94=(Token)match(input,VIRG,FOLLOW_VIRG_in_read_list888); 
            	    pushFollow(FOLLOW_read_item_in_read_list891);
            	    read_item95=read_item();

            	    state._fsp--;

            	    adaptor.addChild(root_0, read_item95.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "read_list"

    public static class read_item_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "read_item"
    // vsl.g:121:1: read_item : ( IDENT | tab_elem );
    public final vslParser.read_item_return read_item() throws RecognitionException {
        vslParser.read_item_return retval = new vslParser.read_item_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT96=null;
        vslParser.tab_elem_return tab_elem97 = null;


        CommonTree IDENT96_tree=null;

        try {
            // vsl.g:121:11: ( IDENT | tab_elem )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==IDENT) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==CG) ) {
                    alt22=2;
                }
                else if ( (LA22_1==EOF||(LA22_1>=FUNC_KW && LA22_1<=IDENT)||LA22_1==PROTO_KW||LA22_1==VIRG||(LA22_1>=RETURN_KW && LA22_1<=IF_KW)||(LA22_1>=ELSE_KW && LA22_1<=WHILE_KW)||(LA22_1>=OD_KW && LA22_1<=AD)) ) {
                    alt22=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // vsl.g:121:13: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT96=(Token)match(input,IDENT,FOLLOW_IDENT_in_read_item906); 
                    IDENT96_tree = (CommonTree)adaptor.create(IDENT96);
                    adaptor.addChild(root_0, IDENT96_tree);


                    }
                    break;
                case 2 :
                    // vsl.g:122:5: tab_elem
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_tab_elem_in_read_item912);
                    tab_elem97=tab_elem();

                    state._fsp--;

                    adaptor.addChild(root_0, tab_elem97.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "read_item"

    public static class declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // vsl.g:125:1: declaration : ( INT_KW list_dec )+ -> ^( DEC ( list_dec )+ ) ;
    public final vslParser.declaration_return declaration() throws RecognitionException {
        vslParser.declaration_return retval = new vslParser.declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INT_KW98=null;
        vslParser.list_dec_return list_dec99 = null;


        CommonTree INT_KW98_tree=null;
        RewriteRuleTokenStream stream_INT_KW=new RewriteRuleTokenStream(adaptor,"token INT_KW");
        RewriteRuleSubtreeStream stream_list_dec=new RewriteRuleSubtreeStream(adaptor,"rule list_dec");
        try {
            // vsl.g:125:13: ( ( INT_KW list_dec )+ -> ^( DEC ( list_dec )+ ) )
            // vsl.g:125:15: ( INT_KW list_dec )+
            {
            // vsl.g:125:15: ( INT_KW list_dec )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==INT_KW) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // vsl.g:125:16: INT_KW list_dec
            	    {
            	    INT_KW98=(Token)match(input,INT_KW,FOLLOW_INT_KW_in_declaration924);  
            	    stream_INT_KW.add(INT_KW98);

            	    pushFollow(FOLLOW_list_dec_in_declaration926);
            	    list_dec99=list_dec();

            	    state._fsp--;

            	    stream_list_dec.add(list_dec99.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);



            // AST REWRITE
            // elements: list_dec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 126:17: -> ^( DEC ( list_dec )+ )
            {
                // vsl.g:126:20: ^( DEC ( list_dec )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEC, "DEC"), root_1);

                if ( !(stream_list_dec.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_list_dec.hasNext() ) {
                    adaptor.addChild(root_1, stream_list_dec.nextTree());

                }
                stream_list_dec.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class list_dec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list_dec"
    // vsl.g:129:1: list_dec : dec_item ( VIRG dec_item )* ;
    public final vslParser.list_dec_return list_dec() throws RecognitionException {
        vslParser.list_dec_return retval = new vslParser.list_dec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VIRG101=null;
        vslParser.dec_item_return dec_item100 = null;

        vslParser.dec_item_return dec_item102 = null;


        CommonTree VIRG101_tree=null;

        try {
            // vsl.g:129:10: ( dec_item ( VIRG dec_item )* )
            // vsl.g:129:12: dec_item ( VIRG dec_item )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_dec_item_in_list_dec966);
            dec_item100=dec_item();

            state._fsp--;

            adaptor.addChild(root_0, dec_item100.getTree());
            // vsl.g:129:21: ( VIRG dec_item )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==VIRG) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // vsl.g:129:23: VIRG dec_item
            	    {
            	    VIRG101=(Token)match(input,VIRG,FOLLOW_VIRG_in_list_dec970); 
            	    pushFollow(FOLLOW_dec_item_in_list_dec973);
            	    dec_item102=dec_item();

            	    state._fsp--;

            	    adaptor.addChild(root_0, dec_item102.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "list_dec"

    public static class dec_item_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dec_item"
    // vsl.g:132:1: dec_item : ( IDENT | IDENT CG INTEGER CD -> ^( ARDEC IDENT INTEGER ) );
    public final vslParser.dec_item_return dec_item() throws RecognitionException {
        vslParser.dec_item_return retval = new vslParser.dec_item_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT103=null;
        Token IDENT104=null;
        Token CG105=null;
        Token INTEGER106=null;
        Token CD107=null;

        CommonTree IDENT103_tree=null;
        CommonTree IDENT104_tree=null;
        CommonTree CG105_tree=null;
        CommonTree INTEGER106_tree=null;
        CommonTree CD107_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_CG=new RewriteRuleTokenStream(adaptor,"token CG");
        RewriteRuleTokenStream stream_CD=new RewriteRuleTokenStream(adaptor,"token CD");

        try {
            // vsl.g:132:10: ( IDENT | IDENT CG INTEGER CD -> ^( ARDEC IDENT INTEGER ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==IDENT) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==CG) ) {
                    alt25=2;
                }
                else if ( (LA25_1==IDENT||LA25_1==INT_KW||LA25_1==VIRG||(LA25_1>=RETURN_KW && LA25_1<=IF_KW)||LA25_1==WHILE_KW||LA25_1==AG) ) {
                    alt25=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // vsl.g:132:12: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT103=(Token)match(input,IDENT,FOLLOW_IDENT_in_dec_item986); 
                    IDENT103_tree = (CommonTree)adaptor.create(IDENT103);
                    adaptor.addChild(root_0, IDENT103_tree);


                    }
                    break;
                case 2 :
                    // vsl.g:133:14: IDENT CG INTEGER CD
                    {
                    IDENT104=(Token)match(input,IDENT,FOLLOW_IDENT_in_dec_item1001);  
                    stream_IDENT.add(IDENT104);

                    CG105=(Token)match(input,CG,FOLLOW_CG_in_dec_item1003);  
                    stream_CG.add(CG105);

                    INTEGER106=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_dec_item1005);  
                    stream_INTEGER.add(INTEGER106);

                    CD107=(Token)match(input,CD,FOLLOW_CD_in_dec_item1007);  
                    stream_CD.add(CD107);



                    // AST REWRITE
                    // elements: INTEGER, IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 134:17: -> ^( ARDEC IDENT INTEGER )
                    {
                        // vsl.g:134:20: ^( ARDEC IDENT INTEGER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARDEC, "ARDEC"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        adaptor.addChild(root_1, stream_INTEGER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dec_item"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\13\uffff";
    static final String DFA9_eofS =
        "\13\uffff";
    static final String DFA9_minS =
        "\1\21\1\22\11\uffff";
    static final String DFA9_maxS =
        "\1\45\1\32\11\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\11\1\1\1\2\1\10";
    static final String DFA9_specialS =
        "\13\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\11\uffff\1\2\1\3\1\4\1\5\3\uffff\1\6\2\uffff\1\7",
            "\1\12\5\uffff\1\11\1\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "64:1: statement : ( IDENT ASSIGN_KW expression | tab_elem ASSIGN_KW expression -> ^( ASSIGN_KW tab_elem expression ) | RETURN_KW expression | PRINT_KW print_list | READ_KW read_list | IF_KW expression THEN_KW statement ( ELSE_KW statement )? FI_KW | WHILE_KW expression DO_KW statement OD_KW | IDENT PG ( argument_list )? PD -> ^( FCALL_S IDENT ( argument_list )? ) | block );";
        }
    }
 

    public static final BitSet FOLLOW_unite_in_program147 = new BitSet(new long[]{0x0000000000110002L});
    public static final BitSet FOLLOW_function_in_unite185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_proto_in_unite191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_KW_in_function202 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_type_in_function204 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENT_in_function206 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PG_in_function208 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_param_list_in_function210 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PD_in_function212 = new BitSet(new long[]{0x0000002478020000L});
    public static final BitSet FOLLOW_statement_in_function214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROTO_KW_in_proto262 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_type_in_proto265 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENT_in_proto267 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PG_in_proto269 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_param_list_in_proto272 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PD_in_proto274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_KW_in_type287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_KW_in_type295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_param_list307 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_VIRG_in_param_list311 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_param_in_param_list313 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_IDENT_in_param363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_param376 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CG_in_param378 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CD_in_param380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_statement417 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_statement419 = new BitSet(new long[]{0x0000080000060000L});
    public static final BitSet FOLLOW_expression_in_statement422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tab_elem_in_statement428 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_statement430 = new BitSet(new long[]{0x0000080000060000L});
    public static final BitSet FOLLOW_expression_in_statement432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_KW_in_statement452 = new BitSet(new long[]{0x0000080000060000L});
    public static final BitSet FOLLOW_expression_in_statement455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_KW_in_statement461 = new BitSet(new long[]{0x0000180000060000L});
    public static final BitSet FOLLOW_print_list_in_statement464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_KW_in_statement470 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_read_list_in_statement473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_KW_in_statement479 = new BitSet(new long[]{0x0000080000060000L});
    public static final BitSet FOLLOW_expression_in_statement482 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_THEN_KW_in_statement484 = new BitSet(new long[]{0x0000002478020000L});
    public static final BitSet FOLLOW_statement_in_statement487 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_ELSE_KW_in_statement490 = new BitSet(new long[]{0x0000002478020000L});
    public static final BitSet FOLLOW_statement_in_statement493 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_FI_KW_in_statement497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_KW_in_statement504 = new BitSet(new long[]{0x0000080000060000L});
    public static final BitSet FOLLOW_expression_in_statement507 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DO_KW_in_statement509 = new BitSet(new long[]{0x0000002478020000L});
    public static final BitSet FOLLOW_statement_in_statement512 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_OD_KW_in_statement514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_statement521 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PG_in_statement523 = new BitSet(new long[]{0x00000800000E0000L});
    public static final BitSet FOLLOW_argument_list_in_statement525 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PD_in_statement528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AG_in_block560 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_declaration_in_block562 = new BitSet(new long[]{0x0000002478020000L});
    public static final BitSet FOLLOW_suit_inst_in_block565 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_AD_in_block567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AG_in_block588 = new BitSet(new long[]{0x0000002478020000L});
    public static final BitSet FOLLOW_suit_inst_in_block590 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_AD_in_block592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tab_elem620 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CG_in_tab_elem622 = new BitSet(new long[]{0x0000080000060000L});
    public static final BitSet FOLLOW_expression_in_tab_elem624 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CD_in_tab_elem626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_suit_inst667 = new BitSet(new long[]{0x0000002478020002L});
    public static final BitSet FOLLOW_fact_in_expression707 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_PLUS_in_expression711 = new BitSet(new long[]{0x0000080000060000L});
    public static final BitSet FOLLOW_MOINS_in_expression714 = new BitSet(new long[]{0x0000080000060000L});
    public static final BitSet FOLLOW_fact_in_expression718 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_primaire_in_fact732 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_MUL_in_fact736 = new BitSet(new long[]{0x0000080000060000L});
    public static final BitSet FOLLOW_DIV_in_fact739 = new BitSet(new long[]{0x0000080000060000L});
    public static final BitSet FOLLOW_primaire_in_fact743 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_INTEGER_in_primaire756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaire762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tab_elem_in_primaire774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaire780 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PG_in_primaire782 = new BitSet(new long[]{0x00000800000E0000L});
    public static final BitSet FOLLOW_argument_list_in_primaire784 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PD_in_primaire787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PG_in_primaire807 = new BitSet(new long[]{0x0000080000060000L});
    public static final BitSet FOLLOW_expression_in_primaire810 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PD_in_primaire812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_argument_list824 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_VIRG_in_argument_list828 = new BitSet(new long[]{0x0000080000060000L});
    public static final BitSet FOLLOW_expression_in_argument_list831 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_print_item_in_print_list846 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_VIRG_in_print_list850 = new BitSet(new long[]{0x0000180000060000L});
    public static final BitSet FOLLOW_print_item_in_print_list853 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_TEXT_in_print_item868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_print_item874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_item_in_read_list885 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_VIRG_in_read_list888 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_read_item_in_read_list891 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_IDENT_in_read_item906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tab_elem_in_read_item912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_KW_in_declaration924 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_list_dec_in_declaration926 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_dec_item_in_list_dec966 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_VIRG_in_list_dec970 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_dec_item_in_list_dec973 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_IDENT_in_dec_item986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_dec_item1001 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CG_in_dec_item1003 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_INTEGER_in_dec_item1005 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CD_in_dec_item1007 = new BitSet(new long[]{0x0000000000000002L});

}