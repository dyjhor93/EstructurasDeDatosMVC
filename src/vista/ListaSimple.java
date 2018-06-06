package vista;
import controlador.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;
public class ListaSimple extends javax.swing.JFrame {

    //
    Validador validar = new Validador();
    Agregar AgregarNodo=new Agregar();//ventana de agregar nodo a la lista
    ListasControlador lst = new ListasControlador();//lista controlador
    //borra los valores de los cajones de texto
    
    /** Creates new form ListaSimple */
    public ListaSimple() {
        initComponents();
    }

    /*
        * Este método se llama desde dentro del constructor para inicializar el formulario.
        * ADVERTENCIA: NO modifique este código. El contenido de este método siempre es regenerado por el editor de formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarNodo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLista = new javax.swing.JTable();
        btnMaxDistance = new javax.swing.JButton();
        btnDelParImpar = new javax.swing.JButton();
        btnEdadPromedio = new javax.swing.JButton();
        btnBorrarLista = new javax.swing.JButton();
        btnAutollenar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblCantNodos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnAgregarNodo.setText("Agregar Nodo");
        btnAgregarNodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarNodoActionPerformed(evt);
            }
        });

        jTableLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Documento", "Edad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableLista);

        btnMaxDistance.setText("Maxima Distancia");
        btnMaxDistance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaxDistanceActionPerformed(evt);
            }
        });

        btnDelParImpar.setText("Borrar Par o Impar");
        btnDelParImpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelParImparActionPerformed(evt);
            }
        });

        btnEdadPromedio.setText("Edad Promedio");
        btnEdadPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdadPromedioActionPerformed(evt);
            }
        });

        btnBorrarLista.setText("Eliminar lista");
        btnBorrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarListaActionPerformed(evt);
            }
        });

        btnAutollenar.setText("Autollenar");
        btnAutollenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutollenarActionPerformed(evt);
            }
        });

        jLabel1.setText("Total Nodos: ");

        lblCantNodos.setText("0");

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Vista Listas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnBorrarLista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAgregarNodo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnMaxDistance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAutollenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelParImpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEdadPromedio))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCantNodos)))
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblCantNodos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarNodo)
                    .addComponent(btnMaxDistance)
                    .addComponent(btnDelParImpar)
                    .addComponent(btnEdadPromedio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrarLista)
                    .addComponent(btnAutollenar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarNodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarNodoActionPerformed
        AgregarNodo.vaciar();//vaciamos los cajones de texto
        AgregarNodo.setVisible(true);//hacemos la ventana visible
        AgregarNodo.addWindowListener(new EscucharJFrame());//esperamos que se genere el evento dispose para actualizar la tabla
    }//GEN-LAST:event_btnAgregarNodoActionPerformed

    
    private void btnMaxDistanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaxDistanceActionPerformed
        int edad=validar.pedirNumero("Calcular maxima distancia entre nodos con la misma edad x.\nIngrese la edad:");
        JOptionPane.showMessageDialog(null, "La maxima distancia entre nodos con edades "+edad+" es: "+lst.maximaDistancia(edad));
    }//GEN-LAST:event_btnMaxDistanceActionPerformed

    private void btnDelParImparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelParImparActionPerformed
        int parOimpar = validar.pedirNumero("Dado un numero borrar los nodos con documento pares si el numero es par\nen caso contrario borrar los impares.\nIngrese el numero: ");
        lst.delParImpar(parOimpar);
        validar.actualizarTabla(lst.getInicio(),lst.tam,jTableLista,lblCantNodos);
    }//GEN-LAST:event_btnDelParImparActionPerformed

    private void btnEdadPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdadPromedioActionPerformed
        JOptionPane.showMessageDialog(null, "La edad promedio es: "+lst.edadPromedio());
    }//GEN-LAST:event_btnEdadPromedioActionPerformed

    private void btnBorrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarListaActionPerformed
        lst.eliminarLista();
        validar.actualizarTabla(lst.getInicio(),lst.tam,jTableLista,lblCantNodos);
    }//GEN-LAST:event_btnBorrarListaActionPerformed

    private void btnAutollenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutollenarActionPerformed
        lst.autoLlenar(validar.pedirNumero("Ingrese cantidad de nodos"));
        validar.actualizarTabla(lst.getInicio(),lst.tam,jTableLista,lblCantNodos);
    }//GEN-LAST:event_btnAutollenarActionPerformed
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ListaSimple().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarNodo;
    private javax.swing.JButton btnAutollenar;
    private javax.swing.JButton btnBorrarLista;
    private javax.swing.JButton btnDelParImpar;
    private javax.swing.JButton btnEdadPromedio;
    private javax.swing.JButton btnMaxDistance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLista;
    private javax.swing.JLabel lblCantNodos;
    // End of variables declaration//GEN-END:variables
    
//implentado para escuchar acciones de la ventana agregar (abrir, cerrar, maximizar, etc...)
        class EscucharJFrame implements WindowListener{
        @Override
        public void windowClosed(WindowEvent e) {
            //este codigo se ejecuda al cerrar o desactivar la ventana
            if(AgregarNodo.getNuevo()!=null){
                lst.agregarNodo(AgregarNodo.getNuevo());
                validar.actualizarTabla(lst.getInicio(),lst.tam,jTableLista,lblCantNodos);
                JOptionPane.showMessageDialog(null, "Agregado Correctamente!");
            }
            
            
        }

        @Override
        public void windowOpened(WindowEvent we) {
            
        }

        @Override
        public void windowClosing(WindowEvent we) {
            
        }

        @Override
        public void windowIconified(WindowEvent we) {
            
        }

        @Override
        public void windowDeiconified(WindowEvent we) {
            
        }

        @Override
        public void windowActivated(WindowEvent we) {
            
        }

        @Override
        public void windowDeactivated(WindowEvent we) {
            
        }
    }
}
