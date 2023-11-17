/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import Clases.ProductoPromocion;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author User001
 */
public class ListaPromociones extends javax.swing.JFrame {

    public CategoriaPromociones padre;
    public String CategoriaSeleccionada;
    public String nickNameMicro;
    DefaultListModel modele = new DefaultListModel();
    List<ProductoPromocion> promocion = new ArrayList<>();
    public ListaPromociones(CategoriaPromociones padre,String CategoriaSeleccionada,String nickNameMicro) {
        initComponents();
        this.padre=padre;
        this.CategoriaSeleccionada=CategoriaSeleccionada;
        this.nickNameMicro=nickNameMicro;
        lblRazonSocial.setText(nickNameMicro);
    }

    private ListaPromociones() {}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblRazonSocial = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPromociones = new javax.swing.JList<>();
        bttAgregarPromocion = new javax.swing.JButton();
        bttEliminarPromocion = new javax.swing.JButton();
        bttVolverAPM = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        jLabel2.setText("Ofertones");

        lblRazonSocial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblRazonSocial.setText("jLabel2");

        lstPromociones.setBackground(new java.awt.Color(179, 255, 179));
        lstPromociones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        lstPromociones.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstPromociones);

        bttAgregarPromocion.setBackground(new java.awt.Color(230, 255, 230));
        bttAgregarPromocion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bttAgregarPromocion.setText("Agregar Promocion");
        bttAgregarPromocion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttAgregarPromocion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAgregarPromocionActionPerformed(evt);
            }
        });

        bttEliminarPromocion.setBackground(new java.awt.Color(230, 255, 230));
        bttEliminarPromocion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bttEliminarPromocion.setText("Eliminar Promocion");
        bttEliminarPromocion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttEliminarPromocion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEliminarPromocionActionPerformed(evt);
            }
        });

        bttVolverAPM.setBackground(new java.awt.Color(230, 255, 230));
        bttVolverAPM.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bttVolverAPM.setText("Volver");
        bttVolverAPM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttVolverAPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttVolverAPMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(144, 144, 144)
                        .addComponent(lblRazonSocial))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(bttVolverAPM, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(bttAgregarPromocion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttEliminarPromocion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRazonSocial)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttAgregarPromocion, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttEliminarPromocion, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bttVolverAPM, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttAgregarPromocionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttAgregarPromocionActionPerformed
        AgregarPromociones ventanacurso = new AgregarPromociones(this);
        ventanacurso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bttAgregarPromocionActionPerformed

    private void bttEliminarPromocionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEliminarPromocionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttEliminarPromocionActionPerformed

    private void bttVolverAPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVolverAPMActionPerformed
        padre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttVolverAPMActionPerformed

    public void agregarPromocionALista(String NombrePromocion, String DescripcionPromocion, String PrecioPromocion) {
    ProductoPromocion nuevaPromo = new ProductoPromocion(NombrePromocion, DescripcionPromocion, PrecioPromocion);
    promocion.add(nuevaPromo);
    modele.addElement(NombrePromocion + " | " + DescripcionPromocion + " | " + PrecioPromocion+" soles | "+CategoriaSeleccionada+" | "+ nickNameMicro);
    lstPromociones.setModel(modele);
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
            java.util.logging.Logger.getLogger(ListaPromociones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaPromociones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaPromociones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaPromociones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaPromociones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttAgregarPromocion;
    private javax.swing.JButton bttEliminarPromocion;
    private javax.swing.JButton bttVolverAPM;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRazonSocial;
    private javax.swing.JList<String> lstPromociones;
    // End of variables declaration//GEN-END:variables
}
