package ast;

public class NodoLLamada extends NodoBase {
	private String identificador1;
	private String identificador2;
	private NodoBase parametros;	
	
	public NodoLLamada(String identificador2, NodoBase parametros) {
		super();
		this.identificador1 = null; /* seria: identificador2(parametros) */
		this.identificador2 = identificador2;
		this.parametros= parametros;		
	}
	
	public NodoLLamada(String identificador1, String identificador2, NodoBase parametros) {
		super();
		this.identificador1 = identificador1; /* seria: identificador1 = identificador2(parametros) */
		this.identificador2 = identificador2;
		this.parametros = parametros;		
	}

	
	public String getIdentificador() {
		return identificador1;
	}

	public void setIdentificador1(String identificador1) {
		this.identificador1 = identificador1;
	}

	public NodoBase getParametros() {
		return parametros;
	}

	public void setParametros(NodoBase parametros) {
		this.parametros = parametros;
	}

	public String getIdentificador2() {
		return identificador2;
	}

	public void setIdentificador2(String identificador2) {
		this.identificador2 = identificador2;	
       }
}
