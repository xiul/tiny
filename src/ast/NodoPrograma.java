package ast;

public class NodoPrograma extends NodoBase {

	private NodoBase lista;
	private NodoBase cuerpo;
	
	public NodoPrograma(NodoBase cuerpo) {
		super();
		this.lista = null;
		this.cuerpo = cuerpo;
	}
	
	public NodoPrograma(NodoBase lista, NodoBase cuerpo) {
		super();
		this.lista = lista;
		this.cuerpo = cuerpo;
	}
	
	public NodoPrograma() {
		super();
		this.lista = null;
		this.cuerpo = null;	
	}

	public NodoBase getLista() {
		return lista;
	}

	public void setLista(NodoBase lista) {
		this.lista = lista;
	}

	public NodoBase getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(NodoBase cuerpo) {
		this.cuerpo = cuerpo;
	}
}
