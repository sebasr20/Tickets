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
import modelo.Evento;

/**
 *
 * @author Sebastian
 */
public class RegistroEvento {
    public boolean agregar(Evento evento) {
        Date date;
        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            date = evento.getFechaEvento();

            String query = "INSERT INTO evento(nombreEvento,descripcionEvento,fechaEvento,horaEvento,estadoEvento,idVisita)VALUES(?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, evento.getNombreEvento());
            stmt.setString(2, evento.getDescripcionEvento());
            stmt.setDate(3, new java.sql.Date(date.getTime()));
            stmt.setString(4, evento.getHoraEvento());
            stmt.setBoolean(5, evento.isDisponible());
            stmt.setInt(6, evento.getVisita());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error en SQL al registrar Evento - Clase RegistroEvento " + e.getMessage());
            return false;
        }
    }
    
    public List<Evento> buscarTodos() {

        List<Evento> lista = new ArrayList<>();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT nombreEvento, descripcionEvento, fechaEvento, horaEvento, estadoEvento FROM evento order by idEvento";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Evento evento = new Evento();
                evento.setNombreEvento(rs.getString("nombreEvento"));
                evento.setDescripcionEvento(rs.getString("descripcionEvento"));
                evento.setFechaEvento(rs.getDate("fechEvento"));
                evento.setHoraEvento(rs.getString("horaEvento"));
                evento.setDisponible(rs.getBoolean("estadoEvento"));
                
                lista.add(evento);
            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL "
                    + "al listar eventos " + e.getMessage());
        }
        return lista;
    }
}
