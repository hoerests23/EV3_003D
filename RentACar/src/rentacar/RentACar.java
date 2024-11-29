/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rentacar;

import Bd.Conexion;
import controller.ClienteController;
import view.MenuPrincipal;

/**
 *
 * @author Cetecom
 */
public class RentACar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conexion cx = new Conexion();
        cx.conectar();
        
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        mp.setLocationRelativeTo(null);
        
        //ClienteController cc = new ClienteController();
        //cc.buscarClientePorRut("12");
        
    }
    
}
