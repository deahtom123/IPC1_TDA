package tda;

/**
 *
 * @author Dénilson Argueta
 */
public class ListaSimple {
    private NodoSimple cabeza;
    public ListaSimple()
    {
        setCabeza(null);
    }
    public void insertar(String palabra)
    {
        NodoSimple nuevo=new NodoSimple(palabra);
        if(cabeza==null){
            cabeza=nuevo;
        }
        else{
            NodoSimple auxiliar=cabeza;
            while(auxiliar.getSiguiente()!=null){
                auxiliar=auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }
    public void imprimir()
    {
        System.out.println("-------IMPRIMIENDO------------------");
        for(NodoSimple actual=this.getCabeza();actual!=null; actual=actual.getSiguiente())
        {
                System.out.println(actual.getPalabra());
        }
    }
    public NodoSimple getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoSimple cabeza) {
        this.cabeza = cabeza;
    }    
}
