/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


public class Evento {
    private String NombreEvento;
    

    public Evento(String NombreEvento) {
        this.NombreEvento = NombreEvento;
    }
    public Evento() {}

    public String getNombreEvento() {
        return NombreEvento;
    }

    public void setNombreEvento(String NombreEvento) {
        this.NombreEvento = NombreEvento;
    }
    public String mostrarDatos(){
    return this.getNombreEvento();
    }
    
    
}
