/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Frames.MolinMy;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author User001
 */
public class ExcepcionEliminarElemento extends Exception{
     public ExcepcionEliminarElemento(String Msj) {
        super(Msj);
    }

    public ExcepcionEliminarElemento() {
        super("Elemento Eliminado");
    }
    
    public boolean confirmarEliminacion() {
        int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres eliminar este elemento?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        return opcion == JOptionPane.YES_OPTION;
    }
   
}
