package compilador;

public class RegistroSimbolo {
	private String identificador;
	private int NumLinea;
	private int DireccionMemoria;
        private int Ambito;
	
	public RegistroSimbolo(String identificador, int numLinea,
			int direccionMemoria,int amb) {
		super();
		this.identificador = identificador;
		NumLinea = numLinea;
		DireccionMemoria = direccionMemoria;
                Ambito = amb;
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

    /**
     * @return the Ambito
     */
    public int getAmbito() {
        return Ambito;
    }

    /**
     * @param Ambito the Ambito to set
     */
    public void setAmbito(int Ambito) {
        this.Ambito = Ambito;
    }
}
