/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;
import Clases.Categoria;
import Clases.Evento;
import Clases.ExcepcionEliminarElemento;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
public class CategoriaPromociones extends javax.swing.JFrame {

    public InicioMicro padre;
    public String EventoSeleccionado;
    public String nickNameMicro;
    DefaultListModel modele = new DefaultListModel();
    List<Evento> categoria = new ArrayList<>();
    public CategoriaPromociones(InicioMicro padre, String EventoSeleccionado, String nickNameMicro) {
        initComponents();    
     this.padre= padre;
     this.EventoSeleccionado= EventoSeleccionado;
     this.nickNameMicro=nickNameMicro;
     lblRazonSocial.setText(nickNameMicro);    
    }

    private CategoriaPromociones() {}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblRazonSocial = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bttAgregarCatProm = new javax.swing.JButton();
        bttSeleccionarCatProm = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCategorias = new javax.swing.JList<>();
        bttVolverCPC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        jLabel1.setText("Ofertones");

        lblRazonSocial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblRazonSocial.setText("jLabel3");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione una categoria");

        bttAgregarCatProm.setBackground(new java.awt.Color(230, 255, 230));
        bttAgregarCatProm.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bttAgregarCatProm.setText("Agregar Categoria");
        bttAgregarCatProm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttAgregarCatProm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAgregarCatPromActionPerformed(evt);
            }
        });

        bttSeleccionarCatProm.setBackground(new java.awt.Color(230, 255, 230));
        bttSeleccionarCatProm.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bttSeleccionarCatProm.setText("Seleccionar Categoria");
        bttSeleccionarCatProm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttSeleccionarCatProm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSeleccionarCatPromActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(230, 255, 230));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("Eliminar Categoria");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lstCategorias.setBackground(new java.awt.Color(179, 255, 179));
        lstCategorias.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        lstCategorias.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstCategorias);

        bttVolverCPC.setBackground(new java.awt.Color(230, 255, 230));
        bttVolverCPC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bttVolverCPC.setText("Volver");
        bttVolverCPC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttVolverCPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttVolverCPCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblRazonSocial)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bttSeleccionarCatProm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttAgregarCatProm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(bttVolverCPC, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblRazonSocial))
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bttAgregarCatProm, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bttSeleccionarCatProm, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(bttVolverCPC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttVolverCPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVolverCPCActionPerformed
        padre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttVolverCPCActionPerformed

    private void bttAgregarCatPromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttAgregarCatPromActionPerformed
         AgregarCategoriaPromociones ventanacurso = new AgregarCategoriaPromociones(this);
        ventanacurso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bttAgregarCatPromActionPerformed

    private void bttSeleccionarCatPromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSeleccionarCatPromActionPerformed
            String categoriaSeleccionada = lstCategorias.getSelectedValue();

    if (categoriaSeleccionada != null) {
        ListaPromociones ventanacurso = new ListaPromociones(this,categoriaSeleccionada,nickNameMicro);
        ventanacurso.setVisible(true);
        this.setVisible(false);
    }
    }//GEN-LAST:event_bttSeleccionarCatPromActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String categoriaSeleccionada = lstCategorias.getSelectedValue();
        if (categoriaSeleccionada != null) {
        ExcepcionEliminarElemento excepcionEliminar = new ExcepcionEliminarElemento();
        if (excepcionEliminar.confirmarEliminacion()) {
            int indiceSeleccionado = lstCategorias.getSelectedIndex();
        if (indiceSeleccionado != -1) { 
        categoria.remove(indiceSeleccionado); 
        modele.removeElementAt(indiceSeleccionado); 
        }
        }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void agregarCategoriaPromALista(String NombreCategoria) {
     Categoria nuevaCategoria = new Categoria(NombreCategoria);
     categoria.add(nuevaCategoria);
     modele.addElement(NombreCategoria +" | "+ EventoSeleccionado);
     lstCategorias.setModel(modele);
    }
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
            java.util.logging.Logger.getLogger(CategoriaPromociones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoriaPromociones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoriaPromociones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoriaPromociones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoriaPromociones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttAgregarCatProm;
    private javax.swing.JButton bttSeleccionarCatProm;
    private javax.swing.JButton bttVolverCPC;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRazonSocial;
    private javax.swing.JList<String> lstCategorias;
    // End of variables declaration//GEN-END:variables
}
