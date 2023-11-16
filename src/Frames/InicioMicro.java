
package Frames;

import Clases.Evento;
import Clases.ExcepcionCerrarSesion;
import Clases.ExcepcionEliminarElemento;
import Clases.MolinMy10;
import java.util.List;
import javax.swing.DefaultListModel;


public class InicioMicro extends javax.swing.JFrame {

    public InicioSesionMicro padre;
    public String nickNameMicro;

    private DefaultListModel<String> modele;
    private List<Evento> ListaEvento;
    
    public InicioMicro(InicioSesionMicro padre,String nickNameMicro) {
        initComponents();
        ListaEvento= MolinMy10.EventosEnElSistema;
        modele= new DefaultListModel<>();
        this.lstEvento.setModel(modele);
        modele.removeAllElements();
        this.padre = padre;
        this.nickNameMicro = nickNameMicro;
        lblRazonSocial.setText(nickNameMicro);   
    }

    public InicioMicro() {}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblRazonSocial = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEvento = new javax.swing.JList<>();
        bttAgregarEvento = new javax.swing.JButton();
        bttEliminarEvento = new javax.swing.JButton();
        bttCerrarSesion = new javax.swing.JButton();
        bttPromociones = new javax.swing.JButton();
        bttProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bienvenido");

        lblRazonSocial.setText("jLabel2");

        jLabel2.setText("Microempresario");

        lstEvento.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstEvento);

        bttAgregarEvento.setText("Agregar Evento");
        bttAgregarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAgregarEventoActionPerformed(evt);
            }
        });

        bttEliminarEvento.setText("Eliminar Evento");
        bttEliminarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEliminarEventoActionPerformed(evt);
            }
        });

        bttCerrarSesion.setText("Cerrar Sesion");
        bttCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCerrarSesionActionPerformed(evt);
            }
        });

        bttPromociones.setText("Agregar Promocion");
        bttPromociones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttPromocionesActionPerformed(evt);
            }
        });

        bttProducto.setText("Agregar Producto");
        bttProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRazonSocial)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bttAgregarEvento)
                                    .addComponent(bttEliminarEvento)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttPromociones)
                    .addComponent(bttProducto))
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bttCerrarSesion)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblRazonSocial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bttAgregarEvento)
                            .addComponent(bttPromociones))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bttEliminarEvento)
                            .addComponent(bttProducto))
                        .addGap(50, 50, 50)
                        .addComponent(bttCerrarSesion)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttAgregarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttAgregarEventoActionPerformed
        AgregarEvento ventanacurso = new AgregarEvento(this);
        ventanacurso.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_bttAgregarEventoActionPerformed

    private void bttCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCerrarSesionActionPerformed
        ExcepcionCerrarSesion excepcion = new ExcepcionCerrarSesion();
        excepcion.cerrarSesion(this);   
    }//GEN-LAST:event_bttCerrarSesionActionPerformed

    private void bttPromocionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttPromocionesActionPerformed
        String EventoSeleccionado = lstEvento.getSelectedValue();

    if (EventoSeleccionado != null) {
        CategoriaPromociones ventanacurso = new CategoriaPromociones(this,EventoSeleccionado,nickNameMicro);
        ventanacurso.setVisible(true);
        this.setVisible(false);
    }
    }//GEN-LAST:event_bttPromocionesActionPerformed

    private void bttProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttProductoActionPerformed
        String EventoSeleccionado = lstEvento.getSelectedValue();

    if (EventoSeleccionado != null) {
        CategoriaProductos ventanacurso = new CategoriaProductos(this,EventoSeleccionado,nickNameMicro);
        ventanacurso.setVisible(true);
        this.setVisible(false);
    }
    }//GEN-LAST:event_bttProductoActionPerformed

    private void bttEliminarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEliminarEventoActionPerformed
        String EventoSeleccionado = lstEvento.getSelectedValue();
        if (EventoSeleccionado != null) {
        ExcepcionEliminarElemento excepcionEliminar = new ExcepcionEliminarElemento();
        if (excepcionEliminar.confirmarEliminacion()) {
            int indiceSeleccionado = lstEvento.getSelectedIndex();
        if (indiceSeleccionado != -1) { 
        ListaEvento.remove(indiceSeleccionado); 
        modele.removeElementAt(indiceSeleccionado); 
        }
        }
       }
    }//GEN-LAST:event_bttEliminarEventoActionPerformed

    
    public void agregarEventoALista(Evento evento) {

        ListaEvento.add(evento);
        modele.removeAllElements();
        for(Evento NombreEvento: ListaEvento)
        {
           modele.addElement(NombreEvento.mostrarDatos());
        }
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
            java.util.logging.Logger.getLogger(InicioMicro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioMicro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioMicro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioMicro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioMicro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttAgregarEvento;
    private javax.swing.JButton bttCerrarSesion;
    private javax.swing.JButton bttEliminarEvento;
    private javax.swing.JButton bttProducto;
    private javax.swing.JButton bttPromociones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRazonSocial;
    private javax.swing.JList<String> lstEvento;
    // End of variables declaration//GEN-END:variables
}
