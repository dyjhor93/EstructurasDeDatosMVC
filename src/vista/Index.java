package vista;
import java.awt.Desktop;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Index extends javax.swing.JFrame {

    
    //
    
    ListaSimple lst= new ListaSimple();
    /** Creates new form Index */
    public Index() {
        initComponents();
    }

    /*
        * Este método se llama desde dentro del constructor para inicializar el formulario.
        * ADVERTENCIA: NO modifique este código. El contenido de este método siempre es regenerado por el editor de formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLstSmpl = new javax.swing.JButton();
        btnPilas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnColas = new javax.swing.JButton();
        btnDoc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLstSmpl.setText("Lista Simple");
        btnLstSmpl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLstSmplActionPerformed(evt);
            }
        });

        btnPilas.setText("Pilas");
        btnPilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Estructuras de Datos MVC");

        btnColas.setText("Colas");

        btnDoc.setText("Documentacion");
        btnDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLstSmpl, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnPilas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnColas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDoc)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnLstSmpl)
                .addGap(18, 18, 18)
                .addComponent(btnPilas)
                .addGap(18, 18, 18)
                .addComponent(btnColas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDoc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void mostrarMenu(){
        this.setVisible(true);
    }
    private void btnLstSmplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLstSmplActionPerformed
        this.setVisible(false);
        lst.setVisible(true);
        lst.addWindowListener(new Index.EscucharJFrame());
        
    }//GEN-LAST:event_btnLstSmplActionPerformed

    private void btnDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocActionPerformed
        String doc = String.valueOf("Documentacion.docx");//nombre del documento a abrir
        try {
            Runtime.getRuntime().exec("cmd /c start " + doc);//abrir documento
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "No se pudo encontrar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDocActionPerformed

    private void btnPilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPilasActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Index().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnColas;
    private javax.swing.JButton btnDoc;
    private javax.swing.JButton btnLstSmpl;
    private javax.swing.JButton btnPilas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    //implentado para escuchar acciones de las ventanas (abrir, cerrar, maximizar, etc...)
        class EscucharJFrame implements WindowListener{
        @Override
        public void windowClosed(WindowEvent e) {
            //este codigo se ejecuda al cerrar o desactivar una ventana
            mostrarMenu();
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
