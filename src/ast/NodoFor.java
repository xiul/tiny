package ast;

public class NodoFor  extends NodoBase{
	private NodoBase asig;
    private NodoBase comprob;
	private NodoBase paso;
    private NodoBase cuerpo;
	
	public NodoFor(NodoBase asig, NodoBase comprob,NodoBase paso,NodoBase cuerpo){

        super();
        this.asig = asig;
        this.comprob = comprob;
        this.paso = paso;
        this.cuerpo = cuerpo;
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
