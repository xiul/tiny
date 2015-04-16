package ast;

public class NodoFuncion extends NodoBase {

	private NodoBase identificador;
	private NodoBase operacion;
	private String cuerpo;
	
	public NodoFuncion(NodoBase identificador, NodoBase operacion, String cuerpo) {
		super();
		this.identificador = identificador;
		this.operacion = operacion;
		this.cuerpo = cuerpo
	}
	

	
	public NodoFuncion() {
		super();
		this.identificador= null;
		this.operacion= null;
		this.cuerpo= null;
		
			
	}

	public NodoBase getIdentificador() {
		return identificador;
	}

	public void setIdentificador(NodoBase prueba) {
		this.identificador = prueba;
	}


	public void setParteElse(NodoBase parteElse) {
		this.parteElse = parteElse;
	}
	
	
	
}
