/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Bd.Conexion;
import Controller.HelperController;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import java.sql.PreparedStatement;


/**
 *
 * @author Cetecom
 */
public class ClienteController {
    
    HelperController helper = new HelperController();
    Conexion cx;
    public ClienteController() {
        cx = new Conexion();
        cx.conectar();
        
    }
    
    public List<Cliente> obtenerClientes(){
        List<Cliente> clientes = new ArrayList<>();
        String query = "SELECT * FROM cliente";
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            while (rs.next()) {
                clientes.add(new Cliente(
                        rs.getString("rut"),
                        rs.getString("nombre"),
                        rs.getInt("numero_contacto"),
                        rs.getString("direccion"),
                        rs.getString("tipo_cliente")
                ));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            helper.showError("Error al obtener clientes");
        }
        return clientes;
    }
    
    public void agregarCliente(String rut, String nombre, int numero_contacto, String direccion, String tipo_cliente){
        String query="INSERT INTO cliente VALUES(?,?,?,?,?)";
        try {
            PreparedStatement st = cx.getConnection().prepareStatement(query);
            st.setString(1, rut);
            st.setString(2, nombre);
            st.setInt(3, numero_contacto);
            st.setString(4, direccion);
            st.setString(5, tipo_cliente);
            st.executeUpdate();
            helper.showInformation("Cliente agregado con exito.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            helper.showError("Error al agregar cliente.");
        }
    }
    
    public Cliente buscarClientePorRut(String rut){
        Cliente clienteEncontrado = null;
        String query = "SELECT * FROM cliente WHERE rut = '"+rut+"'";
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            while (rs.next()) {
                    clienteEncontrado= new Cliente(
                        rs.getString("rut"),
                        rs.getString("nombre"),
                        rs.getInt("numero_contacto"),
                        rs.getString("direccion"),
                        rs.getString("tipo_cliente")
                );
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //helper.showError("Error al buscar cliente.");
        }
        return clienteEncontrado;
    }
    
    public void editarCliente(String rut, String nombre, int numero_contacto, String direccion, String  tipo_cliente){
        if(buscarClientePorRut(rut) != null){
            String query = "UPDATE cliente SET nombre = '"+nombre+"', numero_contacto = "+numero_contacto+", direccion = '"+direccion+"', tipo_cliente = '"+tipo_cliente+"' WHERE cliente.rut = '"+rut+"'";
            try {
                PreparedStatement st = cx.getConnection().prepareStatement(query);
                st.executeUpdate();
                helper.showInformation("Cliente editado exitosamente.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                helper.showError("Error al editar cliente.");
            }
        }
    }
    
    public void eliminarCliente(String rut){
        if(buscarClientePorRut(rut) != null){
            String query = "DELETE FROM cliente WHERE rut= '"+rut+"'";
            try {
                PreparedStatement st = cx.getConnection().prepareStatement(query);
                st.executeUpdate();
                helper.showInformation("Cliente eliminado exitosamente.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                helper.showError("Error al eliminar cliente.");
            }
        }
    }

}
