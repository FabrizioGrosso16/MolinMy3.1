/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author User001
 */
public class Ciudadano extends Usuario{
    
   private String NicknameCiu;

    public String getNicknameCiu() {
        return NicknameCiu;
    }

    public void setNicknameCiu(String NicknameCiu) {
        this.NicknameCiu = NicknameCiu;
    }
   
     public Ciudadano(String NicknameCiu) {
        super();
        this.NicknameCiu=NicknameCiu;
    } 
    
}
