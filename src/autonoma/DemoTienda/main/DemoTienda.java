/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.DemoTienda.main;

import autonoma.DemoTienda.models.Administrador;
import autonoma.DemoTienda.models.Producto;
import autonoma.DemoTienda.models.Tienda;
import autonoma.DemoTienda.views.IniciarSesion;
import autonoma.DemoTienda.views.VentanaPrincipal;

/**
 *
 * @author Danie
 */
public class DemoTienda {

    public static void main(String[] args) {
        
        Tienda tienda = new Tienda("vortex shop" , "Calle 20 cra 23");
        Administrador  admin = new Administrador("Dajuma", "123456", "Daniel Montoya", "654894", "calle 45");
        tienda.setAdministrador(admin);
        
        VentanaPrincipal ventana = new VentanaPrincipal(tienda);
        IniciarSesion login = new IniciarSesion(ventana, true, tienda, ventana);
        login.setVisible(true);
        
        
    }

}
