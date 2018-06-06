package controlador;

import modelo.Persona;
import modelo.listas.NodoSimple;
import modelo.listas.ListaSimple;

public class Cola extends ListaSimple{
    public void encolar(NodoSimple nuevo){
        if(estaVacia()){//si la cola esta vacia agregamos el nodo al inicio de la cola
            setInicio(nuevo);
        }else{//si ya hay nodos en la cola
            NodoSimple aux = getInicio();
            while(aux.getSiguiente()!= null)//recorremos la cola hasta llegar al final
                aux = aux.getSiguiente();
            aux.setSiguiente(nuevo);//agregamos el nuevo nodo al final de la cola
        }
        super.tam++;
    }
    private void desencolar(){
        if(!estaVacia()){//si la cola no esta vacia quitamos el nodo del frente de la cola
            setInicio(getInicio().getSiguiente());
        }
    }
    private void autoEncolar(int t){
        char letra='a';
        for(int i=1;i<=t;i++){
            encolar(new NodoSimple(new Persona(String.valueOf(letra),String.valueOf(letra),i,i,i),null));
            letra++;
        }
    }
    
    private void abandonarCola(){
        if(!estaVacia()){//si la cola no esta vacia
            setInicio(getInicio().getSiguiente());
        }
    }
}
