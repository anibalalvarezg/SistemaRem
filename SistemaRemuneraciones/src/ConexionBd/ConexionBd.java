/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBd;

import java.sql.*;

/**
 *
 * @author z40L
 */
public class ConexionBd {
    static String bd = "sistemaremuneraciones";
    static String login = "root";
    static String password = "";
    static String url = "jdbc:mysql://localhost/"+bd;
   
    Connection connection = null;
   
    public ConexionBd() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,login,password);
            
            if (connection != null) {
                System.out.println("Conexión a base de datos" + bd +" OK\n");
            }
        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        } 
    }
   
    public Connection getConnection() {
        return connection;
    }
    
    public void desconectar() {
        connection = null;
    }

}
