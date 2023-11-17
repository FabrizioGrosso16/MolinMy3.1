/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Categoria extends Evento {
    public String getNombreCategoria() {
        return NombreCategoria;
        
    }

    public void setNombreCategoria(String NombreCategoria) {
        this.NombreCategoria = NombreCategoria;
    }

    public Categoria(String NombreCategoria) {
        super();
        this.NombreCategoria = NombreCategoria;

    }
    public Categoria() {}
    private String NombreCategoria;
    
}
