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
import modelo.Categoria;


/**
 *
 * @author Sebastian
 */
public class RegistroCategoria {
    public List<Categoria> buscarTodos() {

        List<Categoria> lista = new ArrayList<>();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT idcategoria, nombreCategoria FROM categoria order by idcategoria";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setIdcategoria(rs.getInt("idcategoria"));
                categoria.setNombreCategoria(rs.getString("nombreCategoria"));

                lista.add(categoria);
            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL "
                    + "al listar categoria " + e.getMessage());
        }
        return lista;
    }
    
    public Categoria buscarPorId(int idCategoria) {

        Categoria categoria = new Categoria();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT idCategoria,nombreCategoria FROM categoria WHERE idCategoria = ?";
            
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idCategoria);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                categoria.setIdcategoria(rs.getInt("idcategoria"));
                categoria.setNombreCategoria(rs.getString("nombreCategoria"));

            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar libro por ID " + e.getMessage());
        }
        return categoria;
    }
}
