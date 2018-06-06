package vista;

import controlador.Validador;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;

public class Pila extends javax.swing.JFrame {
    Validador validar = new Validador();//validador
    Agregar AgregarNodo=new Agregar();//ventana de agregar nodo 
    controlador.Pila pl = new controlador.Pila();
    /** Creates new form Pila */
    public Pila() {
        initComponents();
    }

    /*
        * Este método se llama desde dentro del constructor para inicializar el formulario.
        * ADVERTENCIA: NO modifique este código. El contenido de este método siempre es regenerado por el editor de formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLista = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblCantNodos = new javax.swing.JLabel();
        btnApilar = new javax.swing.JButton();
        btnDesapilar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Vista Pilas");

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

        jLabel1.setText("Total Nodos: ");

        lblCantNodos.setText("0");

        btnApilar.setText("Apilar");
        btnApilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApilarActionPerformed(evt);
            }
        });

        btnDesapilar.setText("Desapilar");
        btnDesapilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesapilarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCantNodos))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnApilar)
                                .addGap(18, 18, 18)
                                .addComponent(btnDesapilar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblCantNodos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApilar)
                    .addComponent(btnDesapilar))
                .addGap(146, 146, 146))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnApilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApilarActionPerformed
        AgregarNodo.vaciar();//vaciamos los cajones de texto
        AgregarNodo.setVisible(true);//hacemos la ventana visible
        AgregarNodo.addWindowListener(new Pila.EscucharJFrame());//esperamos que se genere el evento dispose para actualizar la tabla
    }//GEN-LAST:event_btnApilarActionPerformed

    private void btnDesapilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesapilarActionPerformed
        pl.desapilar();
        validar.actualizarTabla(pl.getInicio(),pl.tam,jTableLista,lblCantNodos);
        JOptionPane.showMessageDialog(null, "Desapilado Correctamente!");
    }//GEN-LAST:event_btnDesapilarActionPerformed

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
            java.util.logging.Logger.getLogger(Pila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pila().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApilar;
    private javax.swing.JButton btnDesapilar;
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
                pl.apilar(AgregarNodo.getNuevo());
                validar.actualizarTabla(pl.getInicio(),pl.tam,jTableLista,lblCantNodos);
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
