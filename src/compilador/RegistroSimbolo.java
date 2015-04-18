package compilador;

public class RegistroSimbolo {
	private String identificador;
	private int NumLinea;//imem instrucciones
	private int DireccionMemoria;//variables y parametros
        private String tipo;
        private int tamaño; //Vectores
        
	
	public RegistroSimbolo(String identificador, int numLinea,
			int direccionMemoria) {
		super();
		this.identificador = identificador;
		NumLinea = numLinea;
		DireccionMemoria = direccionMemoria;
	}

	public String getIdentificador() {
		return identificador;
	}

	public int getNumLinea() {
		return NumLinea;
	}

	public int getDireccionMemoria() {
		return DireccionMemoria;
	}

	public void setDireccionMemoria(int direccionMemoria) {
		DireccionMemoria = direccionMemoria;
	}


  
}
