/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

/**
 *
 * @author Alex
 */
public class NodoFuncion extends NodoBase {
    private String tipo;
    private String identificador;
    private NodoBase arg;

    public NodoFuncion(String tipo, String identificador) {
        this.tipo = tipo;
        this.identificador = identificador;   
    }
    public NodoFuncion(String tipo, String identificador, NodoBase variable, NodoBase hermanoDerecha) {
        super(hermanoDerecha);
        this.tipo = tipo;
        this.identificador = identificador;
        this.arg = variable;
    }
  

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public NodoBase getVariable() {
        return arg;
    }

    public void setVariable(NodoBase arg) {
        this.arg = arg;
    }
    

    

    
    
    
   
    
    
    
}
