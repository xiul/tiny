package ast;

public class NodoFor {
    private String variable;
	private NodoBase asig;
    private NodoBase comprob;
	private NodoBase paso;
    private NodoBase cuerpo;
	
	public NodoFor(String variable, NodoBase asig, NodoBase comprob,NodoBase paso,NodoBase cuerpo){

        super();
        this.variable = variable;
        this.asig = asig;
        this.comprob = comprob;
        this.paso = paso;
        this.cuerpo = cuerpo;
    }
	
	public String getVariable() {
		return variable;
	}

    public void setVariable(String variable) {
		this.variable = variable;
	}

    public NodoBase getAsig() {
		return asig;
	}

    public void setAsig(NodoBase comprob) {
		this.asig = asig;
	}

    public NodoBase getComprob() {
		return comprob;
	}

    public void setComprob(NodoBase comprob) {
		this.comprob = comprob;
	}

    public NodoBase  getPaso() {
		return paso;
	}

    public void setPaso(NodoBase  paso) {
		this.paso=paso;
	}
    
    public NodoBase getCuerpo() {
		return cuerpo;
	}

    public void setCuerpo(NodoBase cuerpo) {
		this.cuerpo = cuerpo;
	}

}
