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
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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

            String query = "INSERT INTO evento(equipoLocal,descripcionEvento,jornadaEvento,fechaEvento,horaEvento,estadoEvento,idVisita)VALUES(?,?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, evento.getEquipoLocal());
            stmt.setString(2, evento.getDescripcionEvento());
            stmt.setInt(3, evento.getJornadaEvento());
            stmt.setDate(4, new java.sql.Date(date.getTime()));
            stmt.setString(5, evento.getHoraEvento());
            stmt.setBoolean(6, evento.isDisponible());
            stmt.setInt(7, evento.getVisita());

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

            String query = "SELECT idEvento, equipoLocal,descripcionEvento,jornadaEvento,fechaEvento,horaEvento,estadoEvento,idVisita FROM evento order by fechaEvento DESC";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Evento evento = new Evento();
                evento.setIdEvento(rs.getInt("idEvento"));
                evento.setEquipoLocal(rs.getString("equipoLocal"));
                evento.setDescripcionEvento(rs.getString("descripcionEvento"));
                evento.setJornadaEvento(rs.getInt("jornadaEvento"));
                evento.setFechaEvento(rs.getDate("fechaEvento"));
                evento.setHoraEvento(rs.getString("horaEvento"));
                evento.setDisponible(rs.getBoolean("estadoEvento"));
                evento.setVisita(rs.getInt("idVisita"));
                
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
    
    public Evento buscarPorId(int idEvento) {

        Evento evento = new Evento();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT idEvento,equipoLocal,descripcionEvento,jornadaEvento,fechaEvento,horaEvento,estadoEvento,idVisita FROM evento WHERE idEvento = ?";
            
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idEvento);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                evento.setIdEvento(rs.getInt("idEvento"));
                evento.setEquipoLocal(rs.getString("equipoLocal"));
                evento.setDescripcionEvento(rs.getString("descripcionEvento"));
                evento.setJornadaEvento(rs.getInt("jornadaEvento"));
                evento.setFechaEvento(rs.getDate("fechaEvento"));
                evento.setHoraEvento(rs.getString("horaEvento"));
                evento.setDisponible(rs.getBoolean("estadoEvento"));
                evento.setVisita(rs.getInt("idVisita"));

            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar evento por ID " + e.getMessage());
        }
        return evento;
    }
    
    public boolean actualizar(Evento evento) {
        Date date;
        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            date = evento.getFechaEvento();
            
            String query = "UPDATE evento set jornadaEvento = ?,fechaEvento=?,horaEvento =?,estadoEvento=?,idVisita=? WHERE idEvento =?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, evento.getJornadaEvento());
            stmt.setDate(2, new java.sql.Date(date.getTime()));
            stmt.setString(3, evento.getHoraEvento());
            stmt.setBoolean(4, evento.isDisponible());
            stmt.setInt(5, evento.getVisita());
            stmt.setInt(6, evento.getIdEvento());
           
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            
            return true;

        } catch (SQLException e) {
            System.out.println("Error en SQL al actualizar evento - Clase RegistroEvento " + e.getMessage());
            return false;
        }

    }
    
    public boolean eliminarPorId(int idEvento) {

        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "DELETE FROM evento WHERE idEvento=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idEvento);

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error en SQL al eliminar evento - Clase RegistroEvento" + e.getMessage());
            return false;
        }
    }
}
