package ast;

public class Util {
	
	static int sangria = 0;
	
	//Imprimo en modo texto con sangrias el AST
	public static void imprimirAST(NodoBase raiz){
		  sangria+=2;
		  while (raiz != null) {
		    printSpaces();
		    if (raiz instanceof  NodoIf)
		    	System.out.println("If");
		    else if (raiz instanceof  NodoRepeat)
		    	System.out.println("Repeat");
		    
		    else if (raiz instanceof  NodoAsignacion)
		    	System.out.println("Asignacion a: "+((NodoAsignacion)raiz).getIdentificador());

		    else if (raiz instanceof  NodoLeer)  
		    	System.out.println("Lectura: "+((NodoLeer)raiz).getIdentificador());

		    else if (raiz instanceof  NodoEscribir)
		    	System.out.println("Escribir");
		    
		    else if (raiz instanceof NodoFor)
		    	System.out.println("For");
		    
		    else if (raiz instanceof NodoOperacion
		    		|| raiz instanceof NodoValor
		    		|| raiz instanceof NodoIdentificador )
		    	imprimirNodo(raiz);
    
		    else System.out.println("Tipo de nodo desconocido");;
		    
		    /* Hago el recorrido recursivo */
		    if (raiz instanceof  NodoIf){
		    	printSpaces();
		    	System.out.println("**Prueba IF**");
		    	imprimirAST(((NodoIf)raiz).getPrueba());
		    	printSpaces();
		    	System.out.println("**Then IF**");
		    	imprimirAST(((NodoIf)raiz).getParteThen());
		    	if(((NodoIf)raiz).getParteElse()!=null){
		    		printSpaces();
		    		System.out.println("**Else IF**");
		    		imprimirAST(((NodoIf)raiz).getParteElse());
		    	}
		    }
		    else if (raiz instanceof  NodoRepeat){
		    	printSpaces();
		    	System.out.println("**Cuerpo REPEAT**");
		    	imprimirAST(((NodoRepeat)raiz).getCuerpo());
		    	printSpaces();
		    	System.out.println("**Prueba REPEAT**");
		    	imprimirAST(((NodoRepeat)raiz).getPrueba());
		    }
		    else if (raiz instanceof  NodoAsignacion)
		    	imprimirAST(((NodoAsignacion)raiz).getExpresion());
		    else if (raiz instanceof  NodoEscribir)
		    	imprimirAST(((NodoEscribir)raiz).getExpresion());
		    else if (raiz instanceof NodoOperacion){
		    	printSpaces();
		    	System.out.println("**Expr Izquierda Operacion**");
		    	imprimirAST(((NodoOperacion)raiz).getOpIzquierdo());
		    	printSpaces();
		    	System.out.println("**Expr Derecha Operacion**");		    	
		    	imprimirAST(((NodoOperacion)raiz).getOpDerecho());
		    }
		    else if (raiz instanceof NodoFor){
		    		printSpaces();
		    		System.out.println("**Asignacion for**");
			    	imprimirAST(((NodoFor)raiz).getAsig());
			    	printSpaces();
		    		System.out.println("**Comprobacion for");
		    		imprimirAST(((NodoFor)raiz).getComprob());
		    		printSpaces();
		    		System.out.println("**Paso for");
		    		imprimirAST(((NodoFor)raiz).getPaso());
		    		printSpaces();
		    		System.out.println("**Cuerpo for");
		     		imprimirAST(((NodoFor)raiz).getCuerpo());
		    }
		    
		    else if (raiz instanceof NodoVector){
		    	printSpaces();
		    	System.out.println("**VECTOR de "+((NodoVector)raiz).getVariable()+"[]");
		    	imprimirAST(((NodoVector)raiz).getNumero());
		      }
		    else if(raiz instanceof NodoLLamada)
		    {
		    	printSpaces();
		    	System.out.println("**Parametros de LLamada**");
		    	imprimirAST(((NodoLLamada)raiz).getParametros());
		    	printSpaces();
		    }
		    else if(raiz instanceof NodoProcedimiento){
		    	printSpaces();
	    		System.out.println("**Operacion de Procedimiento**");
		    	imprimirAST(((NodoProcedimiento)raiz).getOperacion());
		    	printSpaces();
	    		System.out.println("**Cuerpo Procedimiento**");
	    		imprimirAST(((NodoProcedimiento)raiz).getCuerpo());
	    		printSpaces();
		    }
		    else if (raiz instanceof NodoPrograma){
		    	
		    	printSpaces();
	    		System.out.println("**Operacion Programa**");
		    	imprimirAST(((NodoPrograma)raiz).getOperacion());
		    	printSpaces();
	    		System.out.println("**Cuerpo Programa**");
	    		imprimirAST(((NodoPrograma)raiz).getCuerpo());
	    		printSpaces();		    	
		    }
   else if (raiz instanceof NodoFuncion){
		    	
		    	printSpaces();
	    		System.out.println("**Operacion Funcion**");
		    	imprimirAST(((NodoFuncion)raiz).getOperacion());
		    	printSpaces();
	    		System.out.println("**Cuerpo Funcion**");
	    		imprimirAST(((NodoFuncion)raiz).getBody());
	    		printSpaces();		    	
		    }
 
		    raiz = raiz.getHermanoDerecha();
		  }
		  sangria-=2;
		}

/* Imprime espacios con sangria */
static void printSpaces()
{ int i;
  for (i=0;i<sangria;i++)
	  System.out.print(" ");
}

/* Imprime informacion de los nodos */
static void imprimirNodo( NodoBase raiz )
{
	if(	raiz instanceof NodoRepeat
		||	raiz instanceof NodoLeer
		||	raiz instanceof NodoEscribir 
		||  raiz instanceof NodoFor)
		{
		System.out.println("palabra reservada: "+ raiz.getClass().getName());
	}
	
	if(	raiz instanceof NodoAsignacion )
		System.out.println(":=");
	
	if(	raiz instanceof NodoOperacion ){
		tipoOp sel=((NodoOperacion) raiz).getOperacion();
		if(sel==tipoOp.menor)
			System.out.println("<"); 
		if(sel==tipoOp.mayor)
			System.out.println(">"); 
		if(sel==tipoOp.menorigual)
			System.out.println("<="); 
		if(sel==tipoOp.mayorigual)
			System.out.println(">=");
		if(sel==tipoOp.igual)
			System.out.println("=");
		if(sel==tipoOp.diferente)
			System.out.println("!=");
		if(sel==tipoOp.mas)
			System.out.println("+");
		if(sel==tipoOp.menos)
			System.out.println("-");
		if(sel==tipoOp.por)
			System.out.println("*");
		if(sel==tipoOp.entre)
			System.out.println("/");	
		if(sel==tipoOp.and)
			System.out.println("AND");
		if(sel==tipoOp.or)
			System.out.println("OR");
	}
	if(	raiz instanceof NodoValor ){
		System.out.println("NUM, val= "+ ((NodoValor)raiz).getValor());
	}

	if(	raiz instanceof NodoIdentificador ){
		System.out.println("ID, nombre= "+ ((NodoIdentificador)raiz).getNombre());
	}
	if(raiz instanceof NodoVector){
		System.out.println("Variable "+((NodoVector)raiz).getVariable());
	}

}


}
