/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import bd.Conexion;
import java.security.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Ticket;

/**
 *
 * @author Sebastian
 */
public class RegistroTicket {

    public boolean agregar(Ticket ticket) {

        java.util.Date date = new java.util.Date();
        java.sql.Timestamp timestamp = new java.sql.Timestamp(date.getTime());

        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "INSERT INTO ticketcliente(precioTicket,rutCliente,fechaCompra,idEstadio,idUbicacion,idEvento)VALUES(?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);

            stmt.setInt(1, ticket.getPrecioTicket());
            stmt.setString(2, ticket.getRutCliente());
            stmt.setTimestamp(3, timestamp);
            stmt.setInt(4, ticket.getIdEstadio());
            stmt.setInt(5, ticket.getIdUbicacion());
            stmt.setInt(6, ticket.getIdEvento());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error en SQL al registrar la venta - Clase RegistroVenta " + e.getMessage());
            return false;
        }
    }

    public Ticket buscarTicketPorCliente(String rutCliente, int idEventoTicket) {

        Ticket ticket = new Ticket();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT idTicket "
                    + "FROM ticketcliente "
                    + "WHERE rutCliente = ? "
                    + "AND idEvento = ? "
                    + "AND fechaCompra = "
                    + "(SELECT max(fechaCompra) FROM ticketcliente WHERE rutCliente= ? AND idEvento = ?) ";

            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, rutCliente);
            stmt.setInt(2, idEventoTicket);
            stmt.setString(3, rutCliente);
            stmt.setInt(4, idEventoTicket);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                ticket.setIdTicket(rs.getInt("idTicket"));
                ticket.setPrecioTicket(rs.getInt("precioTicket"));
                ticket.setRutCliente(rs.getString("rutCliente"));
                ticket.setIdEstadio(rs.getInt("idEstadio"));
                ticket.setIdEstadio(rs.getInt("idUbicacion"));
                ticket.setIdEstadio(rs.getInt("idEvento"));

            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar ticket por ID " + e.getMessage());
        }
        return ticket;
    }

    public List<Ticket> buscarTicketPorIdEvento(int idEvento) {

        List<Ticket> lista = new ArrayList<>();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM ticketcliente WHERE idEvento = ? order by fechaCompra DESC";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            stmt.setInt(1, idEvento);
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Ticket ticket = new Ticket();
                ticket.setIdTicket(rs.getInt("idTicket"));
                ticket.setPrecioTicket(rs.getInt("precioTicket"));
                ticket.setRutCliente(rs.getString("rutCliente"));
                //ticket.setFechaCompra(rs.getTimestamp("fechaCompra"));
                ticket.setIdEstadio(rs.getInt("idEstadio"));
                ticket.setIdUbicacion(rs.getInt("idUbicacion"));
                ticket.setIdEvento(rs.getInt("idEvento"));

                lista.add(ticket);
            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar tickets " + e.getMessage());
        }
        return lista;
    }

    public List<Ticket> buscarTodos() {

        List<Ticket> lista = new ArrayList<>();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM ticketcliente order by fechaCompra DESC";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Ticket ticket = new Ticket();
                ticket.setIdTicket(rs.getInt("idTicket"));
                ticket.setPrecioTicket(rs.getInt("precioTicket"));
                ticket.setRutCliente(rs.getString("rutCliente"));
                //ticket.setFechaCompra(rs.getTimestamp("fechaCompra"));
                ticket.setIdEstadio(rs.getInt("idEstadio"));
                ticket.setIdUbicacion(rs.getInt("idUbicacion"));
                ticket.setIdEvento(rs.getInt("idEvento"));

                lista.add(ticket);
            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar tickets " + e.getMessage());
        }
        return lista;
    }

    

    
}
