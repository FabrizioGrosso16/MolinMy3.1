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

        jScrollPane1 = new javax.swing.JScrollPane();
        lstPromociones = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        lblRazonSocial = new javax.swing.JLabel();
        bttAgregarPromocion = new javax.swing.JButton();
        bttEliminarPromocion = new javax.swing.JButton();
        bttVolverAPM = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstPromociones.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstPromociones);

        jLabel2.setText("Ofertones");

        lblRazonSocial.setText("jLabel2");

        bttAgregarPromocion.setText("Agregar Promocion");
        bttAgregarPromocion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAgregarPromocionActionPerformed(evt);
            }
        });

        bttEliminarPromocion.setText("Eliminar Promocion");
        bttEliminarPromocion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEliminarPromocionActionPerformed(evt);
            }
        });

        bttVolverAPM.setText("Volver");
        bttVolverAPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttVolverAPMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(bttAgregarPromocion)
                            .addGap(26, 26, 26)
                            .addComponent(bttEliminarPromocion))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(108, 108, 108)
                            .addComponent(bttVolverAPM)
                            .addGap(115, 115, 115)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(243, 243, 243)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(lblRazonSocial)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRazonSocial)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttAgregarPromocion)
                    .addComponent(bttEliminarPromocion))
                .addGap(18, 18, 18)
                .addComponent(bttVolverAPM)
                .addGap(18, 18, 18))
        );

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRazonSocial;
    private javax.swing.JList<String> lstPromociones;
    // End of variables declaration//GEN-END:variables
}
