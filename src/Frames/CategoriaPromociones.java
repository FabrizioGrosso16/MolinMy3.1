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

        jScrollPane1 = new javax.swing.JScrollPane();
        lstCategorias = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bttAgregarCatProm = new javax.swing.JButton();
        bttVolverCPC = new javax.swing.JButton();
        bttSeleccionarCatProm = new javax.swing.JButton();
        lblRazonSocial = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstCategorias.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstCategorias);

        jLabel1.setText("Ofertones");

        jLabel2.setText("Seleccione una categoria");

        bttAgregarCatProm.setText("Agregar Categoria");
        bttAgregarCatProm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAgregarCatPromActionPerformed(evt);
            }
        });

        bttVolverCPC.setText("Volver");
        bttVolverCPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttVolverCPCActionPerformed(evt);
            }
        });

        bttSeleccionarCatProm.setText("Seleccionar Categoria");
        bttSeleccionarCatProm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSeleccionarCatPromActionPerformed(evt);
            }
        });

        lblRazonSocial.setText("jLabel3");

        jButton1.setText("Eliminar Categoria");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jButton1))
                                    .addComponent(bttAgregarCatProm)
                                    .addComponent(bttSeleccionarCatProm))))
                        .addContainerGap(161, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRazonSocial)
                        .addGap(18, 18, 18))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttVolverCPC)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblRazonSocial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bttAgregarCatProm)
                        .addGap(18, 18, 18)
                        .addComponent(bttSeleccionarCatProm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addGap(21, 21, 21)
                .addComponent(bttVolverCPC)
                .addGap(20, 20, 20))
        );

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRazonSocial;
    private javax.swing.JList<String> lstCategorias;
    // End of variables declaration//GEN-END:variables
}
