/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Frames.MolinMy;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ExcepcionCerrarSesion extends Exception {
    public ExcepcionCerrarSesion(String Msj) {
        super(Msj);
    }

    public ExcepcionCerrarSesion() {
        super("Cierre de Sesion exitoso");
    }
    public void cerrarSesion(JFrame frame) {
        int confirmacion = JOptionPane.showConfirmDialog(frame, "¿Estás seguro de cerrar sesión?", "Confirmar Cierre de Sesión", JOptionPane.YES_NO_OPTION);
    if (confirmacion == JOptionPane.YES_OPTION) {
           try {
            MolinMy ventanacurso = new MolinMy();
            ventanacurso.setVisible(true);
            frame.setVisible(false);
            throw new ExcepcionCerrarSesion();
        } catch (ExcepcionCerrarSesion ex) {
            JOptionPane.showMessageDialog(frame, ex.getMessage(), "Cierre de sesión", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }
    
}