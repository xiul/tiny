package ast;

public class NodoVector extends NodoBase {

	private NodoBase variable;
	private NodoBase lcorchete;
	private NodoBase numero;
	private NodoBase rcorchete;
	
	public NodoVector(NodoBase variable, NodoBase lcorchete, NodoBase numero, NodoBase rcorchete) {
		super();
		this.variable = variable;
		this.lcorchete = lcorchete;
		this.numero = numero;
		this.rcorchete=rcorchete;
	}
	
	public NodoRepeat() {
		super();
		this.variable = null;
		this.lcorchete = null;
		this.numero = null;
		this.rcorchete=null;
	}

	public NodoBase getVariable() {
		return variable;
	}

	public void setVariable(NodoBase variable) {
		this.variable = variable;
	}

	public NodoBase getLcorchete() {
		return lcorchete;
	}

	public void setLcorchete(NodoBase lcorchete) {
		this.lcorchete = lcorchete;
	}
	
	public NodoBase getRcorchete() {
		return rcorchete;
	}

	public void setRcorchete(NodoBase rcorchete) {
		this.rcorchete = rcorchete;
	}
	
	public NodoBase getNumero() {
		return numero;
	}

	public void setNumero(NodoBase numero) {
		this.numero = numero;
	}
	
	
	
	
	
}
