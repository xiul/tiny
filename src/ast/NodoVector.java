package ast;

<<<<<<< HEAD
public class NodoVector {

=======
public class NodoVector extends NodoBase {

	private String variable;
	private NodoBase numero;

	
	public NodoVector(String variable,NodoBase numero) {
		super();
		this.variable = variable;
		this.numero = numero;
	}
	
	public NodoVector() {
		super();
		this.variable = null;
		this.numero = null;
	}

	public String getVariable() {
		return variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}

	
	public NodoBase getNumero() {
		return numero;
	}

	public void setNumero(NodoBase numero) {
		this.numero = numero;
	}
	
	
>>>>>>> 216956c6ac6eccf3b888d1ad2cb2f445601dbf2f
}
