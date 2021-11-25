/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
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
}
