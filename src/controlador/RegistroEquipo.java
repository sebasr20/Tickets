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
import java.util.List;
import modelo.Equipo;

/**
 *
 * @author Sebastian
 */
public class RegistroEquipo {
    public List<Equipo> buscarTodos() {

        List<Equipo> lista = new ArrayList<>();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT idEquipo, nombreEquipo FROM equipo order by idEquipo";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Equipo equipo = new Equipo();
                equipo.setIdEquipo(rs.getInt("idEquipo"));
                equipo.setNombreEquipo(rs.getString("nombreEquipo"));

                lista.add(equipo);
            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL "
                    + "al listar equipos " + e.getMessage());
        }
        return lista;
    }
    
    public Equipo buscarPorId(int idEquipo) {

        Equipo equipo = new Equipo();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT idCategoria,nombreCategoria FROM categoria WHERE idCategoria = ?";
            
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idEquipo);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                equipo.setIdEquipo(rs.getInt("idEquipo"));
                equipo.setNombreEquipo(rs.getString("nombreEquipo"));

            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar equipos por ID " + e.getMessage());
        }
        return equipo;
    }
}
