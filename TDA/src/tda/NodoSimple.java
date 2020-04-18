package tda;
/**
 *
 * @author Dénilson Argueta
 */
public class NodoSimple {
    private String palabra;
    private NodoSimple siguiente;
    
    public NodoSimple(String palabra)
    {
        this.palabra=palabra;
        siguiente=null;
    } 
    
    public NodoSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
}
