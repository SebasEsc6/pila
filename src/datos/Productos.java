/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.Base;

/**
 *
 * @author Administrador
 */
public class Productos extends Base{
    
    private String nombreProducto;
    private int cantidad;
    private double precio;

    public Productos() {
    }

    public Productos(String nombreProducto, int cantidad, double precio) {
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

    @Override
    public Base copy() {
    return new Productos(nombreProducto, cantidad, precio);
        
    }

    @Override
    public String toString() {
        return "Nombre = " + nombreProducto + ", cantidad = " + cantidad + ", precio = " + precio + "\n";
    }
    
    
    
}
