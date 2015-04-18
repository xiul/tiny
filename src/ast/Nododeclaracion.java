/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

/**
 *
 * @author Alex
 */
public class Nododeclaracion extends NodoBase{
   String tipo;
   NodoBase ex;

    public Nododeclaracion(String tipo, NodoBase ex) {
        this.tipo = tipo;
        this.ex = ex;
    }

    public Nododeclaracion(String tipo, NodoBase ex, NodoBase hermanoDerecha) {
        super(hermanoDerecha);
        this.tipo = tipo;
        this.ex = ex;
    }

    public NodoBase getEx() {
        return ex;
    }

    public void setEx(NodoBase ex) {
        this.ex = ex;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   
   
   
}
