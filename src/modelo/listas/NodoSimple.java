package modelo.listas;

import modelo.Persona;

public class NodoSimple {
    private Persona person;
    private NodoSimple siguiente;

    public NodoSimple() {
        this.person = new Persona();
        this.siguiente = null;
    }

    public NodoSimple(Persona dato, NodoSimple siguiente) {
        this.person = dato;
        this.siguiente = siguiente;
    }
    
    public Persona getPerson() {
        return person;
    }

    public void setPerson(Persona dato) {
        this.person = dato;
    }

    public NodoSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
    }
}
