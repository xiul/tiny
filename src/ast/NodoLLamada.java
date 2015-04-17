package ast;

public class NodoLLamada {
	private NodoBase identificador1;
	private NodoBase parametros;
	private NodoBase identificador2;
	
	public NodoLLamada(NodoBase identificador1, NodoBase parametros) {
		super();
		this.identificador1 = null;
		this.parametros= parametros;
		this.identificador2 = identificador1;
	}
	
	public NodoLLamada(NodoBase identificador1, NodoBase identificador2, NodoBase parametros) {
		super();
		this.identificador1 = identificador1;
		this.parametros = parametros;
		this.identificador2 = identificador2;
	}

	
	public NodoBase getIdentificador() {
		return identificador1;
	}

	public void setIdentificador1(NodoBase identificador1) {
		this.identificador1 = identificador1;
	}

	public NodoBase getParametros() {
		return parametros;
	}

	public void setParametros(NodoBase parametros) {
		this.parametros = parametros;
	}

	public NodoBase getIdentificador2() {
		return identificador2;
	}

	public void setIdentificador2(NodoBase identificador2) {
		this.identificador2 = identificador2;	
       }
}
