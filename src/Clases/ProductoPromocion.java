/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

<<<<<<< HEAD
import java.util.List;

public class ProductoPromocion extends Microempresario {

    private String NombrePro;
    private String PrecioPro;
    private String DescripcionPro;

    public ProductoPromocion(String NombrePro, String PrecioPro, String DescripcionPro) {
        super();
        this.NombrePro = NombrePro;
        this.PrecioPro = PrecioPro;
        this.DescripcionPro = DescripcionPro;
    }
=======
/**
 *
 * @author User001
 */
public class ProductoPromocion extends Microempresario{
>>>>>>> c6f1e4d840fa97ffa1359c8021c56c9b699f4fc7

    public String getNombrePro() {
        return NombrePro;
    }

    public void setNombrePro(String NombrePro) {
        this.NombrePro = NombrePro;
    }

    public String getPrecioPro() {
        return PrecioPro;
    }

    public void setPrecioPro(String PrecioPro) {
        this.PrecioPro = PrecioPro;
    }

    public String getDescripcionPro() {
        return DescripcionPro;
    }

    public void setDescripcionPro(String DescripcionPro) {
        this.DescripcionPro = DescripcionPro;
    }
<<<<<<< HEAD

    public void guardarProducto() {
        ManejoDatos.agregarProducto(this);
    }

    public static List<ProductoPromocion> obtenerListaProductos() {
        return ManejoDatos.obtenerListaProductos();
    }
=======
    public ProductoPromocion(String NombrePro,String PrecioPro,String DescripcionPro) {
        super();
        this.NombrePro=NombrePro;
        this.PrecioPro=PrecioPro;
        this.DescripcionPro=DescripcionPro;
    } 
 
    private String NombrePro;
    private String PrecioPro;
    private String DescripcionPro;
    
>>>>>>> c6f1e4d840fa97ffa1359c8021c56c9b699f4fc7
}
