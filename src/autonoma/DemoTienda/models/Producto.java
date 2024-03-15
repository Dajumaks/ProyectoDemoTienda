/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.DemoTienda.models;

/**
 *
 * @author Josue Castaño (DajumaKs)
 */
public class Producto {
    
    ////////////////////
    private static int contadorProducto = 1;
    
    /////////////Atributos
    private long id;
    private String nombre;
    private double precio;
    
    /////////////////////////////////////
    //constructores
    
    public Producto(){
        this.id = Producto.contadorProducto;
        this.nombre = "";
        this.precio= 0;
        contadorProducto++;
    }
    
    public Producto(String nombre, double precio){
        this.id = Producto.contadorProducto;
        this.nombre = nombre;
        this.precio = precio;
        contadorProducto++;
        
    }
    
    ///////////////////////////////
    //////////////Metodos de acceso

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    ///////////////////////////////
    ///////Metodos
    @Override
    public String toString(){
        return "Producto " +id+ "\n"+
               " Nombre: " +nombre+ "\n"+
               "Producto " +precio+ "\n";
    }
    
    
}
