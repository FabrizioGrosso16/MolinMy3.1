/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Microempresario extends Usuario{

    public String getNicknameMicroempresario() {
        return NicknameMicroempresario;
    }
    public Microempresario() {} 
    

    public void setNicknameMicroempresario(String NicknameMicroempresario) {
        this.NicknameMicroempresario = NicknameMicroempresario;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public Microempresario(String NicknameMicroempresario, String RUC) {
        super();
        this.NicknameMicroempresario = NicknameMicroempresario;
        this.RUC = RUC;
    } 
    public String mostrar(){
        return this.getContraseña();
    }
    private String NicknameMicroempresario;
    private String RUC;      
}
