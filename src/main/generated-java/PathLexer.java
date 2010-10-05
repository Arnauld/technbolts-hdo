// $ANTLR 3.2 Sep 23, 2009 14:05:07 src/main/antlr3/Path.g 2010-10-06 01:21:17

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class PathLexer extends Lexer {
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
    public static final int EOF=-1;
    public static final int DecimalLiteral=8;
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
    public static final int DoubleLiteral=9;
    public static final int Letter=11;

    // delegates
    // delegators

    public PathLexer() {;} 
    public PathLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PathLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "src/main/antlr3/Path.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/main/antlr3/Path.g:3:7: ( '/' )
            // src/main/antlr3/Path.g:3:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/main/antlr3/Path.g:4:7: ( '//' )
            // src/main/antlr3/Path.g:4:9: '//'
            {
            match("//"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/main/antlr3/Path.g:5:7: ( '.' )
            // src/main/antlr3/Path.g:5:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/main/antlr3/Path.g:6:7: ( '@' )
            // src/main/antlr3/Path.g:6:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/main/antlr3/Path.g:7:7: ( '*' )
            // src/main/antlr3/Path.g:7:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/main/antlr3/Path.g:8:7: ( '[' )
            // src/main/antlr3/Path.g:8:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/main/antlr3/Path.g:9:7: ( ']' )
            // src/main/antlr3/Path.g:9:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/main/antlr3/Path.g:10:7: ( 'and' )
            // src/main/antlr3/Path.g:10:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/main/antlr3/Path.g:11:7: ( 'or' )
            // src/main/antlr3/Path.g:11:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/main/antlr3/Path.g:12:7: ( '(' )
            // src/main/antlr3/Path.g:12:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/main/antlr3/Path.g:13:7: ( ')' )
            // src/main/antlr3/Path.g:13:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/main/antlr3/Path.g:14:7: ( 'contains' )
            // src/main/antlr3/Path.g:14:9: 'contains'
            {
            match("contains"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/main/antlr3/Path.g:15:7: ( 'excludes' )
            // src/main/antlr3/Path.g:15:9: 'excludes'
            {
            match("excludes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/main/antlr3/Path.g:16:7: ( ':' )
            // src/main/antlr3/Path.g:16:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            int _type = Letter;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/main/antlr3/Path.g:65:5: ( '\\u0024' | '\\u005f' | '\\u0041' .. '\\u005a' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' )
            // src/main/antlr3/Path.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u3040' && input.LA(1)<='\u318F')||(input.LA(1)>='\u3300' && input.LA(1)<='\u337F')||(input.LA(1)>='\u3400' && input.LA(1)<='\u3D2D')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FFF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFAFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Letter"

    // $ANTLR start "IntegerLiteral"
    public final void mIntegerLiteral() throws RecognitionException {
        try {
            int _type = IntegerLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/main/antlr3/Path.g:74:16: ( ( '0' .. '9' )+ )
            // src/main/antlr3/Path.g:74:19: ( '0' .. '9' )+
            {
            // src/main/antlr3/Path.g:74:19: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/main/antlr3/Path.g:74:20: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IntegerLiteral"

    // $ANTLR start "DecimalLiteral"
    public final void mDecimalLiteral() throws RecognitionException {
        try {
            int _type = DecimalLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/main/antlr3/Path.g:75:16: ( ( '.' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='.') ) {
                alt5=1;
            }
            else if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // src/main/antlr3/Path.g:75:19: ( '.' ( '0' .. '9' )+ )
                    {
                    // src/main/antlr3/Path.g:75:19: ( '.' ( '0' .. '9' )+ )
                    // src/main/antlr3/Path.g:75:20: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // src/main/antlr3/Path.g:75:24: ( '0' .. '9' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // src/main/antlr3/Path.g:75:25: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // src/main/antlr3/Path.g:75:40: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* )
                    {
                    // src/main/antlr3/Path.g:75:40: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* )
                    // src/main/antlr3/Path.g:75:41: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // src/main/antlr3/Path.g:75:41: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // src/main/antlr3/Path.g:75:42: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    match('.'); 
                    // src/main/antlr3/Path.g:75:57: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // src/main/antlr3/Path.g:75:57: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DecimalLiteral"

    // $ANTLR start "DoubleLiteral"
    public final void mDoubleLiteral() throws RecognitionException {
        try {
            int _type = DoubleLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/main/antlr3/Path.g:76:16: ( ( ( '.' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? ) ) ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // src/main/antlr3/Path.g:76:19: ( ( '.' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? ) ) ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            // src/main/antlr3/Path.g:76:19: ( ( '.' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='.') ) {
                alt10=1;
            }
            else if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // src/main/antlr3/Path.g:76:20: ( '.' ( '0' .. '9' )+ )
                    {
                    // src/main/antlr3/Path.g:76:20: ( '.' ( '0' .. '9' )+ )
                    // src/main/antlr3/Path.g:76:21: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // src/main/antlr3/Path.g:76:25: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // src/main/antlr3/Path.g:76:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // src/main/antlr3/Path.g:76:40: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? )
                    {
                    // src/main/antlr3/Path.g:76:40: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? )
                    // src/main/antlr3/Path.g:76:41: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )?
                    {
                    // src/main/antlr3/Path.g:76:41: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // src/main/antlr3/Path.g:76:42: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    // src/main/antlr3/Path.g:76:53: ( '.' ( '0' .. '9' )* )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='.') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // src/main/antlr3/Path.g:76:54: '.' ( '0' .. '9' )*
                            {
                            match('.'); 
                            // src/main/antlr3/Path.g:76:58: ( '0' .. '9' )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // src/main/antlr3/Path.g:76:58: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    break loop8;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // src/main/antlr3/Path.g:76:84: ( '+' | '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='+'||LA11_0=='-') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // src/main/antlr3/Path.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // src/main/antlr3/Path.g:76:97: ( '0' .. '9' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // src/main/antlr3/Path.g:76:98: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DoubleLiteral"

    // $ANTLR start "StringLiteral"
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/main/antlr3/Path.g:78:15: ( '\"' (~ ( '\"' ) )* '\"' | '\\'' (~ ( '\\'' ) )* '\\'' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\"') ) {
                alt15=1;
            }
            else if ( (LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // src/main/antlr3/Path.g:78:17: '\"' (~ ( '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // src/main/antlr3/Path.g:78:21: (~ ( '\"' ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='\uFFFF')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // src/main/antlr3/Path.g:78:21: ~ ( '\"' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // src/main/antlr3/Path.g:78:35: '\\'' (~ ( '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // src/main/antlr3/Path.g:78:40: (~ ( '\\'' ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='\uFFFF')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // src/main/antlr3/Path.g:78:40: ~ ( '\\'' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "StringLiteral"

    // $ANTLR start "ComparisonOp"
    public final void mComparisonOp() throws RecognitionException {
        try {
            int _type = ComparisonOp;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/main/antlr3/Path.g:80:14: ( '=' | '<' | '>' | '!=' | '<=' | '>=' )
            int alt16=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt16=1;
                }
                break;
            case '<':
                {
                int LA16_2 = input.LA(2);

                if ( (LA16_2=='=') ) {
                    alt16=5;
                }
                else {
                    alt16=2;}
                }
                break;
            case '>':
                {
                int LA16_3 = input.LA(2);

                if ( (LA16_3=='=') ) {
                    alt16=6;
                }
                else {
                    alt16=3;}
                }
                break;
            case '!':
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // src/main/antlr3/Path.g:80:16: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // src/main/antlr3/Path.g:80:22: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // src/main/antlr3/Path.g:80:28: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 4 :
                    // src/main/antlr3/Path.g:80:34: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 5 :
                    // src/main/antlr3/Path.g:80:41: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 6 :
                    // src/main/antlr3/Path.g:80:48: '>='
                    {
                    match(">="); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ComparisonOp"

    // $ANTLR start "VarRef"
    public final void mVarRef() throws RecognitionException {
        try {
            int _type = VarRef;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/main/antlr3/Path.g:82:7: ( '$' NCName )
            // src/main/antlr3/Path.g:82:9: '$' NCName
            {
            match('$'); 
            mNCName(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VarRef"

    // $ANTLR start "NCName"
    public final void mNCName() throws RecognitionException {
        try {
            int _type = NCName;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/main/antlr3/Path.g:84:8: ( ( Letter ) ( Letter | ( '0' .. '9' ) | '.' | '-' )* )
            // src/main/antlr3/Path.g:84:10: ( Letter ) ( Letter | ( '0' .. '9' ) | '.' | '-' )*
            {
            // src/main/antlr3/Path.g:84:10: ( Letter )
            // src/main/antlr3/Path.g:84:11: Letter
            {
            mLetter(); 

            }

            // src/main/antlr3/Path.g:84:19: ( Letter | ( '0' .. '9' ) | '.' | '-' )*
            loop17:
            do {
                int alt17=5;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='$'||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')||(LA17_0>='\u00C0' && LA17_0<='\u00D6')||(LA17_0>='\u00D8' && LA17_0<='\u00F6')||(LA17_0>='\u00F8' && LA17_0<='\u1FFF')||(LA17_0>='\u3040' && LA17_0<='\u318F')||(LA17_0>='\u3300' && LA17_0<='\u337F')||(LA17_0>='\u3400' && LA17_0<='\u3D2D')||(LA17_0>='\u4E00' && LA17_0<='\u9FFF')||(LA17_0>='\uF900' && LA17_0<='\uFAFF')) ) {
                    alt17=1;
                }
                else if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                    alt17=2;
                }
                else if ( (LA17_0=='.') ) {
                    alt17=3;
                }
                else if ( (LA17_0=='-') ) {
                    alt17=4;
                }


                switch (alt17) {
            	case 1 :
            	    // src/main/antlr3/Path.g:84:20: Letter
            	    {
            	    mLetter(); 

            	    }
            	    break;
            	case 2 :
            	    // src/main/antlr3/Path.g:84:29: ( '0' .. '9' )
            	    {
            	    // src/main/antlr3/Path.g:84:29: ( '0' .. '9' )
            	    // src/main/antlr3/Path.g:84:30: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // src/main/antlr3/Path.g:84:42: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;
            	case 4 :
            	    // src/main/antlr3/Path.g:84:48: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NCName"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/main/antlr3/Path.g:86:3: ( ( ' ' | '\\t' | '\\u000C' ) )
            // src/main/antlr3/Path.g:86:5: ( ' ' | '\\t' | '\\u000C' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // src/main/antlr3/Path.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | Letter | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | ComparisonOp | VarRef | NCName | WS )
        int alt18=23;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // src/main/antlr3/Path.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // src/main/antlr3/Path.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // src/main/antlr3/Path.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // src/main/antlr3/Path.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // src/main/antlr3/Path.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // src/main/antlr3/Path.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // src/main/antlr3/Path.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // src/main/antlr3/Path.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // src/main/antlr3/Path.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // src/main/antlr3/Path.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // src/main/antlr3/Path.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // src/main/antlr3/Path.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // src/main/antlr3/Path.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // src/main/antlr3/Path.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // src/main/antlr3/Path.g:1:94: Letter
                {
                mLetter(); 

                }
                break;
            case 16 :
                // src/main/antlr3/Path.g:1:101: IntegerLiteral
                {
                mIntegerLiteral(); 

                }
                break;
            case 17 :
                // src/main/antlr3/Path.g:1:116: DecimalLiteral
                {
                mDecimalLiteral(); 

                }
                break;
            case 18 :
                // src/main/antlr3/Path.g:1:131: DoubleLiteral
                {
                mDoubleLiteral(); 

                }
                break;
            case 19 :
                // src/main/antlr3/Path.g:1:145: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 20 :
                // src/main/antlr3/Path.g:1:159: ComparisonOp
                {
                mComparisonOp(); 

                }
                break;
            case 21 :
                // src/main/antlr3/Path.g:1:172: VarRef
                {
                mVarRef(); 

                }
                break;
            case 22 :
                // src/main/antlr3/Path.g:1:179: NCName
                {
                mNCName(); 

                }
                break;
            case 23 :
                // src/main/antlr3/Path.g:1:186: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\1\25\1\26\4\uffff\2\31\2\uffff\2\31\1\uffff\1\31\1\41"+
        "\2\uffff\1\31\4\uffff\1\42\1\32\2\uffff\1\44\2\32\1\47\1\42\3\uffff"+
        "\1\55\1\uffff\2\32\1\uffff\4\47\1\42\1\uffff\10\32\1\70\1\71\2\uffff";
    static final String DFA18_eofS =
        "\72\uffff";
    static final String DFA18_minS =
        "\1\11\1\57\1\60\4\uffff\2\44\2\uffff\2\44\1\uffff\1\44\1\56\2\uffff"+
        "\1\44\4\uffff\1\60\1\144\2\uffff\1\44\1\156\1\143\1\44\1\60\3\uffff"+
        "\1\44\1\uffff\1\164\1\154\1\uffff\4\44\1\60\1\uffff\1\141\1\165"+
        "\1\151\1\144\1\156\1\145\2\163\2\44\2\uffff";
    static final String DFA18_maxS =
        "\1\ufaff\1\57\1\71\4\uffff\2\ufaff\2\uffff\2\ufaff\1\uffff\1\ufaff"+
        "\1\145\2\uffff\1\ufaff\4\uffff\1\145\1\144\2\uffff\1\ufaff\1\156"+
        "\1\143\1\ufaff\1\145\3\uffff\1\ufaff\1\uffff\1\164\1\154\1\uffff"+
        "\4\ufaff\1\145\1\uffff\1\141\1\165\1\151\1\144\1\156\1\145\2\163"+
        "\2\ufaff\2\uffff";
    static final String DFA18_acceptS =
        "\3\uffff\1\4\1\5\1\6\1\7\2\uffff\1\12\1\13\2\uffff\1\16\2\uffff"+
        "\1\23\1\24\1\uffff\1\27\1\2\1\1\1\3\2\uffff\1\17\1\26\5\uffff\1"+
        "\22\1\20\1\21\1\uffff\1\11\2\uffff\1\25\5\uffff\1\10\12\uffff\1"+
        "\14\1\15";
    static final String DFA18_specialS =
        "\72\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\23\2\uffff\1\23\23\uffff\1\23\1\21\1\20\1\uffff\1\16\2\uffff"+
            "\1\20\1\11\1\12\1\4\3\uffff\1\2\1\1\12\17\1\15\1\uffff\3\21"+
            "\1\uffff\1\3\32\22\1\5\1\uffff\1\6\1\uffff\1\22\1\uffff\1\7"+
            "\1\22\1\13\1\22\1\14\11\22\1\10\13\22\105\uffff\27\22\1\uffff"+
            "\37\22\1\uffff\u1f08\22\u1040\uffff\u0150\22\u0170\uffff\u0080"+
            "\22\u0080\uffff\u092e\22\u10d2\uffff\u5200\22\u5900\uffff\u0200"+
            "\22",
            "\1\24",
            "\12\27",
            "",
            "",
            "",
            "",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1"+
            "\32\1\uffff\15\32\1\30\14\32\105\uffff\27\32\1\uffff\37\32\1"+
            "\uffff\u1f08\32\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080"+
            "\uffff\u092e\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1"+
            "\32\1\uffff\21\32\1\33\10\32\105\uffff\27\32\1\uffff\37\32\1"+
            "\uffff\u1f08\32\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080"+
            "\uffff\u092e\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "",
            "",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1"+
            "\32\1\uffff\16\32\1\34\13\32\105\uffff\27\32\1\uffff\37\32\1"+
            "\uffff\u1f08\32\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080"+
            "\uffff\u092e\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1"+
            "\32\1\uffff\27\32\1\35\2\32\105\uffff\27\32\1\uffff\37\32\1"+
            "\uffff\u1f08\32\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080"+
            "\uffff\u092e\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "",
            "\1\36\10\uffff\2\32\1\uffff\12\32\7\uffff\32\36\4\uffff\1"+
            "\36\1\uffff\32\36\105\uffff\27\36\1\uffff\37\36\1\uffff\u1f08"+
            "\36\u1040\uffff\u0150\36\u0170\uffff\u0080\36\u0080\uffff\u092e"+
            "\36\u10d2\uffff\u5200\36\u5900\uffff\u0200\36",
            "\1\37\1\uffff\12\17\13\uffff\1\40\37\uffff\1\40",
            "",
            "",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1"+
            "\32\1\uffff\32\32\105\uffff\27\32\1\uffff\37\32\1\uffff\u1f08"+
            "\32\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080\uffff\u092e"+
            "\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "",
            "",
            "",
            "",
            "\12\27\13\uffff\1\40\37\uffff\1\40",
            "\1\43",
            "",
            "",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1"+
            "\32\1\uffff\32\32\105\uffff\27\32\1\uffff\37\32\1\uffff\u1f08"+
            "\32\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080\uffff\u092e"+
            "\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "\1\45",
            "\1\46",
            "\1\50\10\uffff\1\53\1\52\1\uffff\12\51\7\uffff\32\50\4\uffff"+
            "\1\50\1\uffff\32\50\105\uffff\27\50\1\uffff\37\50\1\uffff\u1f08"+
            "\50\u1040\uffff\u0150\50\u0170\uffff\u0080\50\u0080\uffff\u092e"+
            "\50\u10d2\uffff\u5200\50\u5900\uffff\u0200\50",
            "\12\54\13\uffff\1\40\37\uffff\1\40",
            "",
            "",
            "",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1"+
            "\32\1\uffff\32\32\105\uffff\27\32\1\uffff\37\32\1\uffff\u1f08"+
            "\32\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080\uffff\u092e"+
            "\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "",
            "\1\56",
            "\1\57",
            "",
            "\1\50\10\uffff\1\53\1\52\1\uffff\12\51\7\uffff\32\50\4\uffff"+
            "\1\50\1\uffff\32\50\105\uffff\27\50\1\uffff\37\50\1\uffff\u1f08"+
            "\50\u1040\uffff\u0150\50\u0170\uffff\u0080\50\u0080\uffff\u092e"+
            "\50\u10d2\uffff\u5200\50\u5900\uffff\u0200\50",
            "\1\50\10\uffff\1\53\1\52\1\uffff\12\51\7\uffff\32\50\4\uffff"+
            "\1\50\1\uffff\32\50\105\uffff\27\50\1\uffff\37\50\1\uffff\u1f08"+
            "\50\u1040\uffff\u0150\50\u0170\uffff\u0080\50\u0080\uffff\u092e"+
            "\50\u10d2\uffff\u5200\50\u5900\uffff\u0200\50",
            "\1\50\10\uffff\1\53\1\52\1\uffff\12\51\7\uffff\32\50\4\uffff"+
            "\1\50\1\uffff\32\50\105\uffff\27\50\1\uffff\37\50\1\uffff\u1f08"+
            "\50\u1040\uffff\u0150\50\u0170\uffff\u0080\50\u0080\uffff\u092e"+
            "\50\u10d2\uffff\u5200\50\u5900\uffff\u0200\50",
            "\1\50\10\uffff\1\53\1\52\1\uffff\12\51\7\uffff\32\50\4\uffff"+
            "\1\50\1\uffff\32\50\105\uffff\27\50\1\uffff\37\50\1\uffff\u1f08"+
            "\50\u1040\uffff\u0150\50\u0170\uffff\u0080\50\u0080\uffff\u092e"+
            "\50\u10d2\uffff\u5200\50\u5900\uffff\u0200\50",
            "\12\54\13\uffff\1\40\37\uffff\1\40",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1"+
            "\32\1\uffff\32\32\105\uffff\27\32\1\uffff\37\32\1\uffff\u1f08"+
            "\32\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080\uffff\u092e"+
            "\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1"+
            "\32\1\uffff\32\32\105\uffff\27\32\1\uffff\37\32\1\uffff\u1f08"+
            "\32\u1040\uffff\u0150\32\u0170\uffff\u0080\32\u0080\uffff\u092e"+
            "\32\u10d2\uffff\u5200\32\u5900\uffff\u0200\32",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | Letter | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | ComparisonOp | VarRef | NCName | WS );";
        }
    }
 

}