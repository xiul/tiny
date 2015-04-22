package compilador;

import java_cup.runtime.*;


%%
/* Habilitar la compatibilidad con el interfaz CUP para el generador sintactico*/
%cup
/* Llamar Scanner a la clase que contiene el analizador Lexico */
%class Scanner

/*-- CONSTRUCTOR --*/
%{
	public Scanner(java.io.InputStream r, SymbolFactory sf){
		this(r);
		this.sf=sf;
		lineanum=0;
		debug=true;
	}
	private SymbolFactory sf;
	private int lineanum;
	private boolean debug;

%}

%eofval{
    return sf.newSymbol("EOF",sym.EOF);
%eofval}

/* Acceso a la columna y fila actual de analisis CUP */
%line
%column

digito		= [0-9]
numero		= -?{digito}+
letra			= [a-zA-Z]
identificador	= {letra}+
nuevalinea		= \n | \n\r | \r\n
espacio		= [ \t]+
%%
"bool"      	{	if(debug) System.out.println("token BOOL");
			return sf.newSymbol("BOOL",sym.BOOL);
			}
"void"      	{	if(debug) System.out.println("token VOID");
			return sf.newSymbol("VOID",sym.VOID);
			}			
"int"           {   if(debug) System.out.println("token INT");
			return sf.newSymbol("INT",sym.INT);
			}
"begin"         {   if(debug) System.out.println("token BEGIN");
			return sf.newSymbol("BEGIN",sym.BEGIN);
			}
"and"           {   if(debug) System.out.println("token AND");
			return sf.newSymbol("AND",sym.AND);
			}		
"or"            {   if(debug) System.out.println("token OR");
			return sf.newSymbol("OR",sym.OR);
			}			
"if"            {	if(debug) System.out.println("token IF");
			return sf.newSymbol("IF",sym.IF);
			}
"then"          { if(debug) System.out.println("token THEN");
			return sf.newSymbol("THEN",sym.THEN);
			}
"else"          {	if(debug) System.out.println("token ELSE");
			return sf.newSymbol("ELSE",sym.ELSE);
			}
"end"           {	if(debug) System.out.println("token END");
			return sf.newSymbol("END",sym.END);
			}
"repeat"        {	if(debug) System.out.println("token REPEAT");
			return sf.newSymbol("REPEAT",sym.REPEAT);
			}
"until"         {	if(debug) System.out.println("token UNTIL");
			return sf.newSymbol("UNTIL",sym.UNTIL);
			}
"for"      		{	if(debug) System.out.println("token FOR");
			return sf.newSymbol("FOR",sym.FOR);
			}
"return"		{	if(debug) System.out.println("token RETURN");
			return sf.newSymbol("RETURN",sym.RETURN);
			}		
"read"          {	if(debug) System.out.println("token READ");
			return sf.newSymbol("READ",sym.READ);
			}
"write"         {	if(debug) System.out.println("token WRITE");
			return sf.newSymbol("WRITE",sym.WRITE);
			}
":="            {	if(debug) System.out.println("token ASSIGN");
			return sf.newSymbol("ASSIGN",sym.ASSIGN);
			}
"="             {	if(debug) System.out.println("token EQ");
			return sf.newSymbol("EQ",sym.EQ);
			}
"<"             {	if(debug) System.out.println("token LT");
			return sf.newSymbol("LT",sym.LT);
			}
">"             {   if(debug) System.out.println("token GT");
			return sf.newSymbol("GT",sym.GT);
			}
"<="             {	if(debug) System.out.println("token LE");
			return sf.newSymbol("LE",sym.LE);
			}
">="        	{	if(debug) System.out.println("token GE");
			return sf.newSymbol("GE",sym.GE);
			}
"!="        	{	if(debug) System.out.println("token NEQ");
			return sf.newSymbol("NEQ",sym.NEQ);
			}
"["				{	if(debug) System.out.println("token CORCHETE QUE ABRE");
			return sf.newSymbol("NEQ",sym.LCORCH);
			}
"]"				{	if(debug) System.out.println("token CORCHETE QUE CIERRA");
			return sf.newSymbol("NEQ",sym.RCORCH);
			}									
"+"             {	if(debug) System.out.println("token PLUS");
			return sf.newSymbol("PLUS",sym.PLUS);
			}
"-"              {	if(debug) System.out.println("token MINUS");
			return sf.newSymbol("MINUS",sym.MINUS);
			}
"*"              {	if(debug) System.out.println("token TIMES");
			return sf.newSymbol("TIMES",sym.TIMES);
			}
"/"              {	if(debug) System.out.println("token OVER");
			return sf.newSymbol("OVER",sym.OVER);
			}
"("              {	if(debug) System.out.println("token LPAREN");
			return sf.newSymbol("LPAREN",sym.LPAREN);
			}
")"              {	if(debug) System.out.println("token RPAREN");
			return sf.newSymbol("RPAREN",sym.RPAREN);
			}
";"              {	if(debug) System.out.println("token SEMI");
			return sf.newSymbol("SEMI",sym.SEMI);
			}
","         	 { if(debug) System.out.println("token COMA");
			return sf.newSymbol("COMA",sym.COMA);
            }
{numero}        {	if(debug) System.out.println("token NUM");
			return sf.newSymbol("NUM",sym.NUM,new Integer(yytext()));
			}
{identificador}	{	if(debug) System.out.println("token ID");
				return sf.newSymbol("ID",sym.ID,new String(yytext()));
			}
{nuevalinea}       {lineanum++;}
{espacio}    { /* saltos espacios en blanco*/}
"{"[^}]+"}"  { /* salto comentarios */ if(debug) System.out.println("token COMENTARIO"); }
.               {System.err.println("Caracter Ilegal encontrado en analisis lexico: " + yytext() + "\n");}