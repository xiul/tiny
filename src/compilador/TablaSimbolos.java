package compilador;

import java.util.*;

import ast.NodoAsignacion;
import ast.NodoAsignacion_Vector;
import ast.NodoBase;
import ast.NodoEscribir;
import ast.NodoFor;
import ast.NodoFuncion;
import ast.NodoIdentificador;
import ast.NodoIf;
import ast.NodoLeer;
import ast.NodoOperacion;
import ast.NodoPrincipal;
import ast.NodoRepeat;
import ast.NodoValor;
import ast.NodoVector;
import ast.Nododeclaracion;

public class TablaSimbolos {

    private HashMap<String, HashMap<String, RegistroSimbolo>> tabla;
    private HashMap<String, RegistroSimbolo> ambito;
    private int direccion;  //Contador de las localidades de memoria asignadas a la tabla
    private int ambitoLocal;

    public TablaSimbolos() {
        super();
        tabla = new HashMap<String, HashMap<String, RegistroSimbolo>>();
        ambito = new HashMap<String, RegistroSimbolo>();
        direccion = 0;
        ambitoLocal = 0;
    }

    public void cargarTabla(NodoBase raiz) {
        while (raiz != null) {
            if (raiz instanceof NodoIdentificador) {
                InsertarSimbolo(((NodoIdentificador) raiz).getNombre(), -1);
                //TODO: A�adir el numero de linea y localidad de memoria correcta
            }

            /* Hago el recorrido recursivo */
            if (raiz instanceof NodoIf) {
                cargarTabla(((NodoIf) raiz).getPrueba());
                cargarTabla(((NodoIf) raiz).getParteThen());
                if (((NodoIf) raiz).getParteElse() != null) {
                    cargarTabla(((NodoIf) raiz).getParteElse());
                }
            } else if (raiz instanceof NodoRepeat) {
                cargarTabla(((NodoRepeat) raiz).getCuerpo());
                cargarTabla(((NodoRepeat) raiz).getPrueba());
            } else if (raiz instanceof NodoAsignacion) {
                cargarTabla(((NodoAsignacion) raiz).getExpresion());
            } else if (raiz instanceof NodoEscribir) {
                cargarTabla(((NodoEscribir) raiz).getExpresion());
            } else if (raiz instanceof NodoOperacion) {
                cargarTabla(((NodoOperacion) raiz).getOpIzquierdo());
                cargarTabla(((NodoOperacion) raiz).getOpDerecho());
            } else if (raiz instanceof NodoFuncion) {
                //lostiene?cargarTabla(((NodoFuncion)raiz).getHermanoDerecha());
                cargarTabla(((NodoFuncion) raiz).getIdentificador());
                if (((NodoFuncion) raiz).getArgumento() != null) {
                    cargarTabla(((NodoFuncion) raiz).getArgumento());
                }
                //cargarTabla(((NodoOperacion)raiz).getOpDerecho());
            } else if (raiz instanceof NodoFor) {
                /*cargarTabla(((NodoFor)raiz).getInicia());
                 cargarTabla(((NodoFor)raiz).getComp());
                 cargarTabla(((NodoFor)raiz).getHast()); //increDecre
                 cargarTabla(((NodoFor)raiz).getSente());*/
            } else if (raiz instanceof NodoAsignacion_Vector) {
	    	//cargarTabla(((NodoOperacion)raiz).getOpIzquierdo());
                //cargarTabla(((NodoOperacion)raiz).getOpDerecho());	   	
            } else if (raiz instanceof Nododeclaracion) {
                cargarTabla(((Nododeclaracion) raiz).getEx());//tipo
            } else if (raiz instanceof NodoLeer) {
                cargarTabla(((NodoLeer) raiz).getIdentificador());
            } else if (raiz instanceof NodoVector) {
	    		   	
            } else if (raiz instanceof NodoValor) {
	    	//cargarTabla(((NodoOperacion)raiz).getOpIzquierdo());
                //cargarTabla(((NodoOperacion)raiz).getOpDerecho());	   	
            } else if (raiz instanceof NodoPrincipal) {
                //Total - local = actual.
                ambito = new HashMap<String, RegistroSimbolo>();
                ambitoLocal++;
                cargarTabla(((NodoPrincipal) raiz).getFuncion());
                cargarTabla(((NodoPrincipal) raiz).getContenido());
                tabla.put("ambito" + (((NodoPrincipal) raiz).getAmbito()), ambito);
                cargarTabla(((NodoPrincipal) raiz).getBlock());
            }
            raiz = raiz.getHermanoDerecha();
        }
    }

    //true es nuevo no existe se insertara, false ya existe NO se vuelve a insertar 
    public boolean InsertarSimbolo(String identificador, int numLinea) {
        RegistroSimbolo simbolo;
        if (ambito.containsKey(identificador)) {//
            System.out.println(identificador + ": repetido");
            return false;
        } else {
            simbolo = new RegistroSimbolo(identificador, numLinea, direccion++);
            ambito.put(identificador, simbolo);
            return true;
        }
    }

    public RegistroSimbolo BuscarSimbolo(String identificador) {
        RegistroSimbolo simbolo = (RegistroSimbolo) ambito.get(identificador);
        return simbolo;
    }

    public void ImprimirClaves() {
        System.out.println("*** Tabla de Simbolos ***");
        for (Iterator<String> it = tabla.keySet().iterator(); it.hasNext();) {
            String s = (String) it.next();
            //System.out.println("Consegui Key: " + s + " con direccion: " + BuscarSimbolo(s).getDireccionMemoria());
        }
    }

    public int getDireccion(String Clave) {
        return BuscarSimbolo(Clave).getDireccionMemoria();
    }

        //Ver como identificar el bloque final
}
