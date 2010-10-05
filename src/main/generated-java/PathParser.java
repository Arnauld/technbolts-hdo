// $ANTLR 3.2 Sep 23, 2009 14:05:07 src/main/antlr3/Path.g 2010-10-06 01:21:17

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class PathParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ComparisonOp", "StringLiteral", "VarRef", "IntegerLiteral", "DecimalLiteral", "DoubleLiteral", "NCName", "Letter", "WS", "'/'", "'//'", "'.'", "'@'", "'*'", "'['", "']'", "'and'", "'or'", "'('", "')'", "'contains'", "'excludes'", "':'"
    };
    public static final int NCName=10;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int VarRef=6;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int ComparisonOp=4;
    public static final int DecimalLiteral=8;
    public static final int EOF=-1;
    public static final int StringLiteral=5;
    public static final int T__19=19;
    public static final int WS=12;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int IntegerLiteral=7;
    public static final int Letter=11;
    public static final int DoubleLiteral=9;

    // delegates
    // delegators


        public PathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PathParser.tokenNames; }
    public String getGrammarFileName() { return "src/main/antlr3/Path.g"; }



    // $ANTLR start "xPath"
    // src/main/antlr3/Path.g:20:1: xPath : pathExpr ;
    public final void xPath() throws RecognitionException {
        try {
            // src/main/antlr3/Path.g:21:5: ( pathExpr )
            // src/main/antlr3/Path.g:21:10: pathExpr
            {
            pushFollow(FOLLOW_pathExpr_in_xPath33);
            pathExpr();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "xPath"


    // $ANTLR start "pathExpr"
    // src/main/antlr3/Path.g:24:1: pathExpr : ( ( '/' ( relativePathExpr )? ) | ( '//' relativePathExpr ) | relativePathExpr );
    public final void pathExpr() throws RecognitionException {
        try {
            // src/main/antlr3/Path.g:25:5: ( ( '/' ( relativePathExpr )? ) | ( '//' relativePathExpr ) | relativePathExpr )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case NCName:
            case 15:
            case 16:
            case 17:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // src/main/antlr3/Path.g:25:10: ( '/' ( relativePathExpr )? )
                    {
                    // src/main/antlr3/Path.g:25:10: ( '/' ( relativePathExpr )? )
                    // src/main/antlr3/Path.g:25:11: '/' ( relativePathExpr )?
                    {
                    match(input,13,FOLLOW_13_in_pathExpr54); 
                    // src/main/antlr3/Path.g:25:15: ( relativePathExpr )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==NCName||(LA1_0>=15 && LA1_0<=17)) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // src/main/antlr3/Path.g:25:15: relativePathExpr
                            {
                            pushFollow(FOLLOW_relativePathExpr_in_pathExpr56);
                            relativePathExpr();

                            state._fsp--;


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // src/main/antlr3/Path.g:26:10: ( '//' relativePathExpr )
                    {
                    // src/main/antlr3/Path.g:26:10: ( '//' relativePathExpr )
                    // src/main/antlr3/Path.g:26:11: '//' relativePathExpr
                    {
                    match(input,14,FOLLOW_14_in_pathExpr70); 
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr72);
                    relativePathExpr();

                    state._fsp--;


                    }


                    }
                    break;
                case 3 :
                    // src/main/antlr3/Path.g:27:10: relativePathExpr
                    {
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr84);
                    relativePathExpr();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "pathExpr"


    // $ANTLR start "relativePathExpr"
    // src/main/antlr3/Path.g:30:1: relativePathExpr : primaryStep= stepExpr ( ( '/' | '//' ) trailingStep= stepExpr )* ;
    public final void relativePathExpr() throws RecognitionException {
        try {
            // src/main/antlr3/Path.g:31:5: (primaryStep= stepExpr ( ( '/' | '//' ) trailingStep= stepExpr )* )
            // src/main/antlr3/Path.g:31:10: primaryStep= stepExpr ( ( '/' | '//' ) trailingStep= stepExpr )*
            {
            pushFollow(FOLLOW_stepExpr_in_relativePathExpr108);
            stepExpr();

            state._fsp--;

            // src/main/antlr3/Path.g:32:10: ( ( '/' | '//' ) trailingStep= stepExpr )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=13 && LA3_0<=14)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // src/main/antlr3/Path.g:32:11: ( '/' | '//' ) trailingStep= stepExpr
            	    {
            	    if ( (input.LA(1)>=13 && input.LA(1)<=14) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_stepExpr_in_relativePathExpr134);
            	    stepExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "relativePathExpr"


    // $ANTLR start "stepExpr"
    // src/main/antlr3/Path.g:35:1: stepExpr : ( '.' | abbrevForwardStep ) ( predicate )? ;
    public final void stepExpr() throws RecognitionException {
        try {
            // src/main/antlr3/Path.g:36:5: ( ( '.' | abbrevForwardStep ) ( predicate )? )
            // src/main/antlr3/Path.g:36:10: ( '.' | abbrevForwardStep ) ( predicate )?
            {
            // src/main/antlr3/Path.g:36:10: ( '.' | abbrevForwardStep )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==NCName||(LA4_0>=16 && LA4_0<=17)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // src/main/antlr3/Path.g:36:12: '.'
                    {
                    match(input,15,FOLLOW_15_in_stepExpr159); 

                    }
                    break;
                case 2 :
                    // src/main/antlr3/Path.g:37:12: abbrevForwardStep
                    {
                    pushFollow(FOLLOW_abbrevForwardStep_in_stepExpr172);
                    abbrevForwardStep();

                    state._fsp--;


                    }
                    break;

            }

            // src/main/antlr3/Path.g:38:12: ( predicate )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // src/main/antlr3/Path.g:38:13: predicate
                    {
                    pushFollow(FOLLOW_predicate_in_stepExpr186);
                    predicate();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "stepExpr"


    // $ANTLR start "abbrevForwardStep"
    // src/main/antlr3/Path.g:41:1: abbrevForwardStep : (attributeFlag= '@' )? (stQName= qName | stNodeExpansion= '*' ) ;
    public final void abbrevForwardStep() throws RecognitionException {
        Token attributeFlag=null;
        Token stNodeExpansion=null;

        try {
            // src/main/antlr3/Path.g:42:5: ( (attributeFlag= '@' )? (stQName= qName | stNodeExpansion= '*' ) )
            // src/main/antlr3/Path.g:42:10: (attributeFlag= '@' )? (stQName= qName | stNodeExpansion= '*' )
            {
            // src/main/antlr3/Path.g:42:24: (attributeFlag= '@' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // src/main/antlr3/Path.g:42:24: attributeFlag= '@'
                    {
                    attributeFlag=(Token)match(input,16,FOLLOW_16_in_abbrevForwardStep212); 

                    }
                    break;

            }

            // src/main/antlr3/Path.g:42:31: (stQName= qName | stNodeExpansion= '*' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==NCName) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // src/main/antlr3/Path.g:42:32: stQName= qName
                    {
                    pushFollow(FOLLOW_qName_in_abbrevForwardStep220);
                    qName();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // src/main/antlr3/Path.g:42:50: stNodeExpansion= '*'
                    {
                    stNodeExpansion=(Token)match(input,17,FOLLOW_17_in_abbrevForwardStep229); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "abbrevForwardStep"


    // $ANTLR start "predicate"
    // src/main/antlr3/Path.g:45:1: predicate : '[' predicateExpr ']' ;
    public final void predicate() throws RecognitionException {
        try {
            // src/main/antlr3/Path.g:46:5: ( '[' predicateExpr ']' )
            // src/main/antlr3/Path.g:46:10: '[' predicateExpr ']'
            {
            match(input,18,FOLLOW_18_in_predicate250); 
            pushFollow(FOLLOW_predicateExpr_in_predicate252);
            predicateExpr();

            state._fsp--;

            match(input,19,FOLLOW_19_in_predicate254); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "predicate"


    // $ANTLR start "predicateExpr"
    // src/main/antlr3/Path.g:49:1: predicateExpr : ( expr ( ( 'and' | 'or' ) expr )* | '(' expr ')' );
    public final void predicateExpr() throws RecognitionException {
        try {
            // src/main/antlr3/Path.g:50:5: ( expr ( ( 'and' | 'or' ) expr )* | '(' expr ')' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==NCName||(LA9_0>=13 && LA9_0<=17)) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // src/main/antlr3/Path.g:50:10: expr ( ( 'and' | 'or' ) expr )*
                    {
                    pushFollow(FOLLOW_expr_in_predicateExpr274);
                    expr();

                    state._fsp--;

                    // src/main/antlr3/Path.g:50:15: ( ( 'and' | 'or' ) expr )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=20 && LA8_0<=21)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // src/main/antlr3/Path.g:50:16: ( 'and' | 'or' ) expr
                    	    {
                    	    if ( (input.LA(1)>=20 && input.LA(1)<=21) ) {
                    	        input.consume();
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_expr_in_predicateExpr283);
                    	    expr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // src/main/antlr3/Path.g:50:39: '(' expr ')'
                    {
                    match(input,22,FOLLOW_22_in_predicateExpr290); 
                    pushFollow(FOLLOW_expr_in_predicateExpr292);
                    expr();

                    state._fsp--;

                    match(input,23,FOLLOW_23_in_predicateExpr294); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "predicateExpr"


    // $ANTLR start "expr"
    // src/main/antlr3/Path.g:53:1: expr : pathExpr ( comparisonExpr | containmentExpr ) ;
    public final void expr() throws RecognitionException {
        try {
            // src/main/antlr3/Path.g:54:5: ( pathExpr ( comparisonExpr | containmentExpr ) )
            // src/main/antlr3/Path.g:54:10: pathExpr ( comparisonExpr | containmentExpr )
            {
            pushFollow(FOLLOW_pathExpr_in_expr314);
            pathExpr();

            state._fsp--;

            // src/main/antlr3/Path.g:54:19: ( comparisonExpr | containmentExpr )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ComparisonOp) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=24 && LA10_0<=25)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // src/main/antlr3/Path.g:54:20: comparisonExpr
                    {
                    pushFollow(FOLLOW_comparisonExpr_in_expr317);
                    comparisonExpr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // src/main/antlr3/Path.g:54:37: containmentExpr
                    {
                    pushFollow(FOLLOW_containmentExpr_in_expr321);
                    containmentExpr();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expr"


    // $ANTLR start "comparisonExpr"
    // src/main/antlr3/Path.g:56:1: comparisonExpr : ( ComparisonOp ) literal ;
    public final void comparisonExpr() throws RecognitionException {
        try {
            // src/main/antlr3/Path.g:56:17: ( ( ComparisonOp ) literal )
            // src/main/antlr3/Path.g:56:19: ( ComparisonOp ) literal
            {
            // src/main/antlr3/Path.g:56:19: ( ComparisonOp )
            // src/main/antlr3/Path.g:56:20: ComparisonOp
            {
            match(input,ComparisonOp,FOLLOW_ComparisonOp_in_comparisonExpr332); 

            }

            pushFollow(FOLLOW_literal_in_comparisonExpr336);
            literal();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "comparisonExpr"


    // $ANTLR start "containmentExpr"
    // src/main/antlr3/Path.g:57:1: containmentExpr : ( 'contains' | 'excludes' ) '(' StringLiteral ')' ;
    public final void containmentExpr() throws RecognitionException {
        try {
            // src/main/antlr3/Path.g:57:17: ( ( 'contains' | 'excludes' ) '(' StringLiteral ')' )
            // src/main/antlr3/Path.g:57:19: ( 'contains' | 'excludes' ) '(' StringLiteral ')'
            {
            if ( (input.LA(1)>=24 && input.LA(1)<=25) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,22,FOLLOW_22_in_containmentExpr351); 
            match(input,StringLiteral,FOLLOW_StringLiteral_in_containmentExpr353); 
            match(input,23,FOLLOW_23_in_containmentExpr355); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "containmentExpr"


    // $ANTLR start "literal"
    // src/main/antlr3/Path.g:59:1: literal : ( StringLiteral | numericLiteral | VarRef );
    public final void literal() throws RecognitionException {
        try {
            // src/main/antlr3/Path.g:59:9: ( StringLiteral | numericLiteral | VarRef )
            int alt11=3;
            switch ( input.LA(1) ) {
            case StringLiteral:
                {
                alt11=1;
                }
                break;
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
                {
                alt11=2;
                }
                break;
            case VarRef:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // src/main/antlr3/Path.g:59:11: StringLiteral
                    {
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal363); 

                    }
                    break;
                case 2 :
                    // src/main/antlr3/Path.g:59:27: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_literal367);
                    numericLiteral();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // src/main/antlr3/Path.g:59:44: VarRef
                    {
                    match(input,VarRef,FOLLOW_VarRef_in_literal371); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "literal"


    // $ANTLR start "numericLiteral"
    // src/main/antlr3/Path.g:60:1: numericLiteral : ( IntegerLiteral | DecimalLiteral | DoubleLiteral );
    public final void numericLiteral() throws RecognitionException {
        try {
            // src/main/antlr3/Path.g:60:15: ( IntegerLiteral | DecimalLiteral | DoubleLiteral )
            // src/main/antlr3/Path.g:
            {
            if ( (input.LA(1)>=IntegerLiteral && input.LA(1)<=DoubleLiteral) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "numericLiteral"


    // $ANTLR start "qName"
    // src/main/antlr3/Path.g:61:1: qName : ( ( NCName ':' NCName ) | NCName );
    public final void qName() throws RecognitionException {
        try {
            // src/main/antlr3/Path.g:61:6: ( ( NCName ':' NCName ) | NCName )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==NCName) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==26) ) {
                    alt12=1;
                }
                else if ( (LA12_1==EOF||LA12_1==ComparisonOp||(LA12_1>=13 && LA12_1<=14)||LA12_1==18||(LA12_1>=24 && LA12_1<=25)) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // src/main/antlr3/Path.g:61:8: ( NCName ':' NCName )
                    {
                    // src/main/antlr3/Path.g:61:8: ( NCName ':' NCName )
                    // src/main/antlr3/Path.g:61:9: NCName ':' NCName
                    {
                    match(input,NCName,FOLLOW_NCName_in_qName392); 
                    match(input,26,FOLLOW_26_in_qName394); 
                    match(input,NCName,FOLLOW_NCName_in_qName396); 

                    }


                    }
                    break;
                case 2 :
                    // src/main/antlr3/Path.g:61:30: NCName
                    {
                    match(input,NCName,FOLLOW_NCName_in_qName401); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "qName"

    // Delegated rules


 

    public static final BitSet FOLLOW_pathExpr_in_xPath33 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_pathExpr54 = new BitSet(new long[]{0x0000000000038402L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_pathExpr70 = new BitSet(new long[]{0x0000000000038400L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stepExpr_in_relativePathExpr108 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_set_in_relativePathExpr120 = new BitSet(new long[]{0x0000000000038400L});
    public static final BitSet FOLLOW_stepExpr_in_relativePathExpr134 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_15_in_stepExpr159 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_abbrevForwardStep_in_stepExpr172 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_predicate_in_stepExpr186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_abbrevForwardStep212 = new BitSet(new long[]{0x0000000000020400L});
    public static final BitSet FOLLOW_qName_in_abbrevForwardStep220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_abbrevForwardStep229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_predicate250 = new BitSet(new long[]{0x000000000043E400L});
    public static final BitSet FOLLOW_predicateExpr_in_predicate252 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_predicate254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_predicateExpr274 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_set_in_predicateExpr277 = new BitSet(new long[]{0x000000000003E400L});
    public static final BitSet FOLLOW_expr_in_predicateExpr283 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_22_in_predicateExpr290 = new BitSet(new long[]{0x000000000003E400L});
    public static final BitSet FOLLOW_expr_in_predicateExpr292 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_predicateExpr294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathExpr_in_expr314 = new BitSet(new long[]{0x0000000003000010L});
    public static final BitSet FOLLOW_comparisonExpr_in_expr317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_containmentExpr_in_expr321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ComparisonOp_in_comparisonExpr332 = new BitSet(new long[]{0x00000000000003E0L});
    public static final BitSet FOLLOW_literal_in_comparisonExpr336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_containmentExpr343 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_containmentExpr351 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_StringLiteral_in_containmentExpr353 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_containmentExpr355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VarRef_in_literal371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCName_in_qName392 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_qName394 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NCName_in_qName396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCName_in_qName401 = new BitSet(new long[]{0x0000000000000002L});

}