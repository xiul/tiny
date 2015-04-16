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
			
	}

	public NodoBase getPrueba() {
		return prueba;
	}

	public void setPrueba(NodoBase prueba) {
		this.prueba = prueba;
	}


	public void setParteElse(NodoBase parteElse) {
		this.parteElse = parteElse;
	}
	
	
	
}
