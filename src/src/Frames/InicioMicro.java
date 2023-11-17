
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblRazonSocial = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEvento = new javax.swing.JList<>();
        bttAgregarEvento = new javax.swing.JButton();
        bttPromociones = new javax.swing.JButton();
        bttEliminarEvento = new javax.swing.JButton();
        bttProducto = new javax.swing.JButton();
        bttCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Bienvenido");

        lblRazonSocial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblRazonSocial.setText("jLabel2");

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        jLabel2.setText("Microempresario");

        lstEvento.setBackground(new java.awt.Color(179, 255, 179));
        lstEvento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        lstEvento.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstEvento);

        bttAgregarEvento.setBackground(new java.awt.Color(230, 255, 230));
        bttAgregarEvento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bttAgregarEvento.setText("Agregar Evento");
        bttAgregarEvento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttAgregarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAgregarEventoActionPerformed(evt);
            }
        });

        bttPromociones.setBackground(new java.awt.Color(230, 255, 230));
        bttPromociones.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bttPromociones.setText("Agregar Promocion");
        bttPromociones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttPromociones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttPromocionesActionPerformed(evt);
            }
        });

        bttEliminarEvento.setBackground(new java.awt.Color(230, 255, 230));
        bttEliminarEvento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bttEliminarEvento.setText("Eliminar Evento");
        bttEliminarEvento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttEliminarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEliminarEventoActionPerformed(evt);
            }
        });

        bttProducto.setBackground(new java.awt.Color(230, 255, 230));
        bttProducto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bttProducto.setText("Agregar Producto");
        bttProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttProductoActionPerformed(evt);
            }
        });

        bttCerrarSesion.setBackground(new java.awt.Color(230, 255, 230));
        bttCerrarSesion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bttCerrarSesion.setText("Cerrar Sesion");
        bttCerrarSesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblRazonSocial))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bttEliminarEvento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bttProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bttAgregarEvento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bttPromociones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(bttCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(149, 149, 149))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblRazonSocial))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bttAgregarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bttPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bttProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttEliminarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bttCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRazonSocial;
    private javax.swing.JList<String> lstEvento;
    // End of variables declaration//GEN-END:variables
}
