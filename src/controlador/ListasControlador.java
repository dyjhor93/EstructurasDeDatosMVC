package controlador;
import modelo.listas.NodoSimple;
import modelo.listas.ListaSimple;
import modelo.Persona;

public class ListasControlador extends ListaSimple{
    public void agregarNodo(NodoSimple nuevo){
        if(super.estaVacia()){//si la lista esta vacia agregamos el nodo al inicio de la lista
            super.setInicio(nuevo);
        }else{
            NodoSimple aux = super.getInicio();
            while(aux.getSiguiente()!= null)//recorremos la lista hasta llegar al final
                aux = aux.getSiguiente();
            aux.setSiguiente(nuevo);//agregamos el nuevo nodo al final de la lista
        }
        super.tam++;
    }
    
    public void eliminarLista(){
        super.setInicio(null);
        tam=0;
    }
    
    //ejercicios
    //maxima distancia entre dos nodos con la misma edad x
    public int maximaDistancia(int Edad){
        int maxima=0,distancia=0;//maxima distancia y distancia actual entre nodos
        boolean encontrado=false;//para validar si ya se encontro un primer elemento
        NodoSimple tmp=this.getInicio();
        while(tmp!=null){
            Persona prs = tmp.getPerson();//datos de la persona actual
            if(encontrado){
                distancia++;//si se encontro el primer nodo aumentamos la distancia
                if(prs.getEdad()==Edad){//si se encuentra el siguiente elemento coincidiente
                    if(distancia>maxima)//si la distancia actual es mayor que la maxima cambiamos
                        maxima=distancia-1;//si la distancia
                    distancia=1;//empezamos a comprobar con los siguientes nodos
                }
            }else{//si no se ha encontrado el primer nodo que coincida
                if(prs.getEdad()==Edad){//si coincide encontramos al primer nodo que coincide
                    encontrado=true;//marcamos como encontrado
                    distancia=1;//iniciamos el conteo de distancia
                }
            }
            tmp=tmp.getSiguiente();//pasamos al siguiente nodo
        }
        return maxima;//devolvemos la maxima distancia
    }
    
    //eliminar pares o impares
    public void delParImpar(int n) {
        NodoSimple tmp = getInicio();
        while (tmp != null) {
            if (n % 2 == getInicio().getPerson().getDocumento() % 2) {//si el nodo a eliminar es el primero
                setInicio(getInicio().getSiguiente());//el primero apuntara a su siguiente
                tmp = getInicio();//reiniciamos el recorrido
                tam--;
            } else {
                if (tmp.getSiguiente() != null) {
                    Persona prsSgt = tmp.getSiguiente().getPerson();
                    if (prsSgt.getDocumento() % 2 == n % 2) {
                        tmp.setSiguiente(tmp.getSiguiente().getSiguiente());
                        delParImpar(n);//
                        tam--;
                    }
                }
                tmp = tmp.getSiguiente();
            }
        }
    }
    
    public float edadPromedio(){
        float total=0;//total nodos
        float suma=0;//suma edades
        NodoSimple aux = super.getInicio();//primer nodo de la lista
        if(!estaVacia()){//verificar que la lista no este vacia
            while(aux!= null){//recorrer la lista
                total++;//aumentar total nodo
                suma=suma+aux.getPerson().getEdad();//agregar la suma
                aux=aux.getSiguiente();//pasar al siguiente nodo
            }
        }else{
            total=1;//para evitar dividir por cero si no hay nodos
        }
        return suma/total;//devolver promedio
    }
    
    public void autoLlenar(int t){
        char letra='a';
        for(int i=1;i<=t;i++){
            agregarNodo(new NodoSimple(new Persona(String.valueOf(letra),String.valueOf(letra),i,i,i),null));
            letra++;
        }
        
    }
}
