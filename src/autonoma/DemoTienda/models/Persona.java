/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.DemoTienda.models;

/**
 *
 * @author Josue Castaño (DajumaKs)
 */
public abstract class Persona {
    //////////////////////////////////
    //////////Atributos
    private String nombre;
    private String cedula;
    private String direccion;
    
    
    //////////////////////////////////////////
    /////////constructor

    public Persona(String nombre, String cedula, String direccion){
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
    }
    
    /////////////////////////////////
    /////////metodos de acceso

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    

    
}
    

