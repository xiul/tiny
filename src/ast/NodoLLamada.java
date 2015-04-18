package ast;

public class NodoLLamada {
	private String identificador1;
	private NodoBase parametros;
	private String identificador2;
	
	public NodoLLamada(String identificador1, NodoBase parametros) {
		super();
		this.identificador1 = null;
		this.parametros= parametros;
		this.identificador2 = identificador1;
	}
	
	public NodoLLamada(String identificador1, String identificador2, NodoBase parametros) {
		super();
		this.identificador1 = identificador1;
		this.parametros = parametros;
		this.identificador2 = identificador2;
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
