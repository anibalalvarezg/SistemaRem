/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexionBd.ConexionBd;
import VO.Afp;
import java.sql.SQLException;
import java.sql.Statement;
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
                   +afp.getNombre()+"',"+afp.getDescuento()+")");
            JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
            estatuto.close();
            conex.desconectar();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se registró la Afp");
        }
     }

}
