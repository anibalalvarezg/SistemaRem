/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexionBd.ConexionBd;
import VO.Afp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Drebin01
 */
public class AfpDAO {
    public void registrarAfp(Afp afp) {
        ConexionBd conex= new ConexionBd();
        try {
            Statement estatuto = conex.getConnection().createStatement();
            estatuto.executeUpdate("INSERT INTO REM_Afp (`nombre`, `descuento`) VALUES ('"
                   +afp.getNombre()+"',"+afp.getTasaAfp()+","+afp.getTasaSis()+")");
            JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
            estatuto.close();
            conex.desconectar();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se registró la Afp");
        }
     }
   
    public ArrayList<Afp> listaDeAfp() {
        ArrayList<Afp> listaAfp = new ArrayList<Afp>();
        ConexionBd conex= new ConexionBd();

        try {
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM REM_Afp");
            ResultSet res = consulta.executeQuery();
            while(res.next()){
                int codAfp = Integer.parseInt(res.getString("codigoAfp"));
                String nombre = res.getString("nombre");
                float tasaAfp = Float.parseFloat(res.getString("tasaAfp"));
                float tasaSis = Float.parseFloat(res.getString("tasaSis"));
                Afp afpAux = new Afp(codAfp,nombre,tasaAfp,tasaSis);
                listaAfp.add(afpAux);
            }
                   res.close();
                   consulta.close();
                   conex.desconectar();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "no se pudo realizar la consulta\n"+e);
        }
            return listaAfp;
    }
    
    public float consultarDescuento(int codAfp){
        float descuento = 0;
        ConexionBd conex= new ConexionBd();
        try {
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM REM_Afp WHERE codigoAfp="+Integer.toString(codAfp));
            ResultSet res = consulta.executeQuery();
            while(res.next()){
                descuento = Float.parseFloat(res.getString("tasaAfp"));
            }
            res.close();
            consulta.close();
            conex.desconectar();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "no se pudo realizar la consulta\n"+e);
        }
            return descuento;
    
    }
    

}


