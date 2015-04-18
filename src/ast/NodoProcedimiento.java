package ast;

public class NodoProcedimiento extends NodoBase {
	private String identificador;
	private NodoBase operacion;
	private NodoBase cuerpo;
	
	public NodoProcedimiento(String identificador, NodoBase operacion, NodoBase cuerpo) {
		super();
		this.identificador = identificador;
		this.operacion = operacion;
		this.cuerpo = cuerpo;
	}
	
	public NodoProcedimiento() {
		super();
		this.identificador= null;
		this.operacion= null;
		this.cuerpo= null;
		
			
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
		
		public NodoBase getCuerpo() {
			return cuerpo;
	}

		public void setCuerpo(NodoBase cuerpo) {
			this.cuerpo = cuerpo;
	}
}
