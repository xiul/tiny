package ast;

public class NodoBoolean extends NodoBase {
	private boolean valor;

	public NodoBoolean(boolean nombre) {
		super();
		this.valor = nombre;
	}

	public NodoBoolean() {
		super();
	}

	public boolean getNombre() {
		return valor;
	}

}
