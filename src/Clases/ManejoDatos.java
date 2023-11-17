package Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lysan
 */
import java.util.ArrayList;
import java.util.List;
public class ManejoDatos extends Microempresario  {

    private static List<ProductoPromocion> listaProductos = new ArrayList<>();

    public static void agregarProducto(ProductoPromocion producto) {
        listaProductos.add(producto);
    }
    public static List<ProductoPromocion> obtenerListaProductos() {
        return listaProductos;
    }
}
