package ast;

public class NodoFuncion extends NodoBase {

	private String identificador;
	private NodoBase argumentos;
	private NodoBase body;
	
	public NodoFuncion(String identificador, NodoBase argumentos, NodoBase body) {
		super();
		this.identificador = identificador;
		this.argumentos = argumentos;
		this.body = body;
	}
	
	public NodoFuncion(String identificador, NodoBase body) {
		super();
		this.identificador = identificador;
		this.argumentos = null;
		this.body = body;
	}	
	
	public NodoFuncion() {
		super();
		this.identificador= null;
		this.argumentos= null;
		this.body= null;
		
			
	}
	
	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String prueba) {
		this.identificador = prueba;
	}
	
	
	public NodoBase getArgumentos() {
		return argumentos;
	}

	public void setArgumentos(NodoBase operacion) {
		this.argumentos = argumentos;
	}
	
	public NodoBase getBody() {
		return body;
	}

	public void setBody(NodoBase body) {
		this.body= body;
	}

}
