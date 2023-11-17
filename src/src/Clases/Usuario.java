/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author User001
 */
public  class Usuario {

    public Usuario(String Correo, String Contraseña) {
        this.Correo = Correo;
        this.Contraseña = Contraseña;
    }
    
    public Usuario (){}

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Usuario) {
        this.Correo = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    private String Correo;
    private String Contraseña;
  
}
