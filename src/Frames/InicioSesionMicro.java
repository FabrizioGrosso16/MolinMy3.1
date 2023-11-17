
package Frames;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import Clases.Microempresario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InicioSesionMicro extends javax.swing.JFrame {
private Map<String, Microempresario> usuariosMicro = new HashMap<>();
public MolinMy padre;
    public InicioSesionMicro(MolinMy padre) {
        initComponents();
        
        this.padre = padre;
        Microempresario micro1 = new Microempresario("Pepito SA", "1234567890");
        micro1.setContraseña("contrasena1");
        micro1.setCorreo("usuario1@example.com");
        usuariosMicro.put("usuario1@example.com", micro1);
        
        Microempresario micro2 = new Microempresario("NicknameEmpresario2", "0987654321");
        micro2.setContraseña("contrasena2");
        micro2.setCorreo("usuario2@example.com");
        
        usuariosMicro.put("usuario2@example.com", micro2);
         Microempresario micro3 = new Microempresario("3", "1");
        micro3.setContraseña("1");
        micro3.setCorreo("d");
        usuariosMicro.put("d", micro3); 
        
        txtCorreoMicro.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        bttInicioSesionMicro.doClick();
            }
});
        pssContraMicro.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        bttInicioSesionMicro.doClick(); 
    }
});
    }

    private InicioSesionMicro() {
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCorreoMicro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pssContraMicro = new javax.swing.JPasswordField();
        bttInicioSesionMicro = new javax.swing.JButton();
        bttSalirMicro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(478, 256));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Correo");

        txtCorreoMicro.setToolTipText("");
        txtCorreoMicro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoMicroActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Contraseña");

        pssContraMicro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pssContraMicroActionPerformed(evt);
            }
        });

        bttInicioSesionMicro.setBackground(new java.awt.Color(230, 255, 230));
        bttInicioSesionMicro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bttInicioSesionMicro.setText("Iniciar Sesion");
        bttInicioSesionMicro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttInicioSesionMicro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttInicioSesionMicroActionPerformed(evt);
            }
        });

        bttSalirMicro.setBackground(new java.awt.Color(230, 255, 230));
        bttSalirMicro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bttSalirMicro.setText("Salir");
        bttSalirMicro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttSalirMicro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalirMicroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(109, 109, 109)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pssContraMicro)
                            .addComponent(bttSalirMicro, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(txtCorreoMicro)))
                    .addComponent(bttInicioSesionMicro, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoMicro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pssContraMicro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bttSalirMicro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttInicioSesionMicro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 82, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttInicioSesionMicroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttInicioSesionMicroActionPerformed
        String correoIngresado = txtCorreoMicro.getText();
        String contraseñaIngresada = pssContraMicro.getText();

      if (usuariosMicro.containsKey(correoIngresado)) {
    Microempresario micro = usuariosMicro.get(correoIngresado);
    if (micro.getContraseña().equals(contraseñaIngresada)) {  
        InicioMicro ventanacurso = new InicioMicro(this,micro.getNicknameMicroempresario());
        ventanacurso.setVisible(true);
        this.setVisible(false);
        return;
    }
   
}
SwingUtilities.invokeLater(() -> {
    JOptionPane.showMessageDialog(this, "Credenciales incorrectas. Inténtalo de nuevo.");
});
    }//GEN-LAST:event_bttInicioSesionMicroActionPerformed

    private void txtCorreoMicroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoMicroActionPerformed

    }//GEN-LAST:event_txtCorreoMicroActionPerformed

    private void bttSalirMicroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalirMicroActionPerformed
        MolinMy ventanacurso = new MolinMy();
        ventanacurso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bttSalirMicroActionPerformed

    private void pssContraMicroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pssContraMicroActionPerformed

    }//GEN-LAST:event_pssContraMicroActionPerformed

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
            java.util.logging.Logger.getLogger(InicioSesionMicro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesionMicro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesionMicro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesionMicro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesionMicro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttInicioSesionMicro;
    private javax.swing.JButton bttSalirMicro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pssContraMicro;
    private javax.swing.JTextField txtCorreoMicro;
    // End of variables declaration//GEN-END:variables
}
