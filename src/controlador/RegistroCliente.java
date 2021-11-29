/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.Cliente;

/**
 *
 * @author Sebastian
 */
public class RegistroCliente {
    public boolean agregar(Cliente cliente) {
        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            //date = cliente.g.getPublicacion();

            String query = "INSERT INTO cliente(rutCliente,nombre,appaterno,apmaterno,idCategoria)VALUES(?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, cliente.getRutCliente());
            stmt.setString(2, cliente.getNombre());
            stmt.setString(3, cliente.getAppaterno());
            stmt.setString(4, cliente.getApmaterno());
            stmt.setInt(5, cliente.getCategoria());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error en SQL al registrar Cliente - Clase RegistroCliente " + e.getMessage());
            return false;
        }
    }
    
    public Cliente buscarPorRut(String rutCliente) {

        Cliente cliente = new Cliente();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT rutCliente,nombre,appaterno,apmaterno,idCategoria FROM cliente WHERE rutCliente = ?";
            
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, rutCliente);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                cliente.setRutCliente(rs.getString("rutCliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setAppaterno(rs.getString("appaterno"));
                cliente.setApmaterno(rs.getString("apmaterno"));
                cliente.setCategoria(rs.getInt("idcategoria"));

            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar cliente por RUN " + e.getMessage());
        }
        return cliente;
    }
    

    public List<Cliente> buscarTodos() {

        List<Cliente> lista = new ArrayList<>();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT rutCliente,nombre,appaterno,apmaterno,idCategoria FROM cliente order by rutCliente";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setRutCliente(rs.getString("rutCliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setAppaterno(rs.getString("appaterno"));
                cliente.setApmaterno(rs.getString("apmaterno"));
                cliente.setCategoria(rs.getInt("idCategoria"));

                lista.add(cliente);
            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar cliente " + e.getMessage());
        }
        return lista;
    }
    
    public boolean actualizar(Cliente cliente) {

        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "UPDATE cliente set nombre = ?,appaterno=?,apmaterno =?,idCategoria=? WHERE rutCliente =?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getAppaterno());
            stmt.setString(3, cliente.getApmaterno());
            stmt.setInt(4, cliente.getCategoria());
            stmt.setString(5, cliente.getRutCliente());
           
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            
            return true;

        } catch (SQLException e) {
            System.out.println("Error en SQL al actualizar cliente - Clase RegistroCliente " + e.getMessage());
            return false;
        }

    }
    
    public boolean eliminarPorRun(String run) {

        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "DELETE FROM cliente WHERE rutCliente=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, run);

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error en SQL al eliminar cliente - Clase RegistroCliente" + e.getMessage());
            return false;
        }
    }
}
