package ast;

public class NodoFuncion extends NodoBase {

	private String identificador;
	private NodoBase operacion;
	private NodoBase body;
	
	public NodoFuncion(String identificador, NodoBase operacion, NodoBase body) {
		super();
		this.identificador = identificador;
		this.operacion = operacion;
		this.body = body;
	}
	

	
	public NodoFuncion() {
		super();
		this.identificador= null;
		this.operacion= null;
		this.body= null;
		
			
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String prueba) {
		this.identificador = prueba;
	}
	
	
	public NodoBase getOperacion() {
		return operacion;
	}

	public void setOperacion(NodoBase operacion) {
		this.operacion = operacion;
	}
	
	public NodoBase getBody() {
		return body;
	}

	public void setBody(NodoBase body) {
		this.body= body;
	}

}
