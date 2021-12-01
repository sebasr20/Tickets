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
import modelo.UbicacionEstadio;

/**
 *
 * @author Sebastian
 */
public class RegistroUbicacion {

    public UbicacionEstadio buscarPorId(int idSector) {

        UbicacionEstadio sector = new UbicacionEstadio();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT idUbicacion,nombreUbicacion,idEstadio FROM ubicacionEstadio WHERE idUbicacion = ?";
            
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idSector);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                sector.setIdUbicacion(rs.getInt("idUbicacion"));
                sector.setNombreUbicacion(rs.getString("nombreUbicacion"));
                sector.setIdEstadio(rs.getInt("idEstadio"));

            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar estadio por ID " + e.getMessage());
        }
        return sector;
    }
}
