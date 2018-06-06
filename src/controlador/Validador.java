package controlador;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Persona;
import modelo.listas.ListaSimple;
import modelo.listas.NodoSimple;

public class Validador {
    //implementado para validar la solicitud de un numero JOptionPane
    public int pedirNumero(String msg){
        boolean esnumero;//validar si es un numero
        int numero=0;//variable utilizada para guardar el numero
        do {
            try {//intentar guardar el numero
                //mostramos un mensaje pidiendo el numero
                numero = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(msg));
                esnumero = true;//suponemos que es un numero
            } catch (NumberFormatException e) {//si se genera error de formato numerico
                JOptionPane.showMessageDialog(null, "Solo se permiten numeros enteros positivos");//avisamos que solo deben ingresarse numeros
                esnumero = false;//no se ingreso un numero
            }
        } while (!esnumero);
        return numero;
    }
    
    //implementado para actualizar la tabla de una lista simple
    public void actualizarTabla(NodoSimple tmp, int tam, javax.swing.JTable jTableLista, javax.swing.JLabel lblCantNodos) {
        //NodoSimple tmp = lst.getInicio();
        //Modelo de la tabla que mostrara los datos
        String columnas[] = new String[]{"Nombre", "Apellido", "Documento", "Telefono", "Edad"};
        Object filas[][] = new Object[tam][5];
        for (int i = 0; tmp != null; i++) {
            Persona prs = tmp.getPerson();
            filas[i][0] = prs.getNombres();
            filas[i][1] = prs.getApellidos();
            filas[i][2] = prs.getDocumento();
            filas[i][3] = prs.getTelefono();
            filas[i][4] = prs.getEdad();
            tmp = tmp.getSiguiente();
        }
        DefaultTableModel tablaModel = new DefaultTableModel(filas, columnas);
        lblCantNodos.setText(String.valueOf(tam));
        jTableLista.setModel(tablaModel);
    }
    
    //validar los cajones de datos numericos al precionar cualquier tecla
    public void validarEventKeyTyped(java.awt.event.KeyEvent evt){
        int k=(int)evt.getKeyChar();
        if (k <48 || k >= 58){//solo valores numericos
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "Ingrese solo valores numericos");
        }
    }
}
