package ast;

public class NodoFuncion extends NodoBase {

	private NodoBase identificador;
	private NodoBase operacion;
	private NodoBase cuerpo;
	
	public NodoFuncion(NodoBase identificador, NodoBase operacion, NodoBase body) {
		super();
		this.identificador = identificador;
		this.operacion = operacion;
		this.cuerpo = body;
	}
	

	
	public NodoFuncion() {
		super();
		this.identificador= null;
		this.operacion= null;
		this.body= null;
		
			
	}

	public NodoBase getIdentificador() {
		return identificador;
	}

	public void setIdentificador(NodoBase prueba) {
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

	public void setCuerpo(NodoBase body) {
		this.cuerpo = body;
	}


	
	
}
