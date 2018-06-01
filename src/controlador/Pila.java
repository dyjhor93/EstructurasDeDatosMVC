package controlador;
import modelo.Persona;
import modelo.listas.NodoSimple;
import modelo.listas.ListaSimple;


public class Pila extends ListaSimple{
    private int maximoPila;

    public int getMaximoPila() {
        return maximoPila;
    }

    public void setMaximoPila(int maximoPila) {
        this.maximoPila = maximoPila;
    }
    
    private void apilar(NodoSimple n){
        if(estaVacia()){//si la pila esta vacia agregamos el nodo al comienzo de la pila
            setInicio(n);
        }else{//si no, apilamos agregando a la cima de la pila
            n.setSiguiente(getInicio());
            setInicio(n);
        }
        tam++;//incrementamos tamaño
    }
    private void desapilar(){
        if(!estaVacia()){//si la pila no esta vacia quitamos el nodo de la cima de la pila
            setInicio(getInicio().getSiguiente());
        }
    }
    
    private void autoApilar(int t){
        char letra='a';
        for(int i=1;i<=t;i++){
            apilar(new NodoSimple(new Persona(String.valueOf(letra),String.valueOf(letra),i,i,i),null));
            letra++;
        }
    }
    
    private void invertirPila(){
        ListasControlador l=new ListasControlador();
        NodoSimple aux = getInicio();
        while(aux!=null){//llenamos una lista aux por el final (invertir pila)
            l.agregarNodo(aux);
            aux=aux.getSiguiente();
        }
        setInicio(null);//eliminamos la pila actual
        aux = l.getInicio();
        while(aux!=null){//llenamos la pila con la lista (pila invertida)
            apilar(aux);
            aux=aux.getSiguiente();
        }
    }
}
