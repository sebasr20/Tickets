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
import modelo.Estadio;

/**
 *
 * @author Sebastian
 */
public class RegistroEstadio {
    public Estadio buscarPorId(int idEstadio) {

        Estadio estadio = new Estadio();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT idEstadio,nombreEstadio FROM estadio WHERE idEstadio = ?";
            
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idEstadio);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                estadio.setIdEstadio(rs.getInt("idEstadio"));
                estadio.setNombreEstadio(rs.getString("nombreEstadio"));

            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar estadio por ID " + e.getMessage());
        }
        return estadio;
    }
}
