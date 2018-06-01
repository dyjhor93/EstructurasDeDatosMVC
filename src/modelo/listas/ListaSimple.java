package modelo.listas;

public class ListaSimple {
    private NodoSimple inicio;
    public int tam;

    public ListaSimple() {
        this.inicio = null;
    }

    public NodoSimple getInicio() {
        return inicio;
    }

    public void setInicio(NodoSimple inicio) {
        this.inicio = inicio;
    }

    public boolean estaVacia(){
        return inicio==null;
    }
    
}
