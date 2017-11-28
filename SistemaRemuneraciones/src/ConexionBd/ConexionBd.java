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
    static String bd = "erpremuneraciones";
    static String login = "erpremuneraciones";
    static String password = "GpPG4*jG";
    static String url = "jdbc:mysql://beta.inf.ucv.cl:3306/"+bd;
   
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
    
   public ConexionBd(String bdAux) {
        String urlAux = "jdbc:mysql://beta.inf.ucv.cl:3306/"+bdAux;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(urlAux,login,password);
            
            if (connection != null) {
                System.out.println("Conexión a base de datos" + bdAux +" OK\n");
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
