/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sebastian
 */
public class Conexion {

    public Connection obtenerConexion() {

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tickets_duoc", "root", "");
            System.out.println("Conexión exitosa");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de Clase conexión " + e.getMessage());

        }
        return connection;
    }
}
