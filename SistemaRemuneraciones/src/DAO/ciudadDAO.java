/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import ConexionBd.ConexionBd;
import VO.Ciudad;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author z40L
 */
public class ciudadDAO {
    public ArrayList<Ciudad> listaCiudad() {
        ArrayList<Ciudad> listaCiudad = new ArrayList<Ciudad>();
        ConexionBd conex= new ConexionBd();

        try {
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM REM_Ciudad");
            ResultSet res = consulta.executeQuery();
            while(res.next()){
                int idCiudad = Integer.parseInt(res.getString("idCiudad"));
                String nombre = res.getString("Nombre");
                
                Ciudad ciudadAux = new Ciudad(idCiudad,nombre);
                listaCiudad.add(ciudadAux);
            }
            res.close();
            consulta.close();
            conex.desconectar();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "no se pudo realizar la consulta\n"+e);
        }
            return listaCiudad;
    }
}
