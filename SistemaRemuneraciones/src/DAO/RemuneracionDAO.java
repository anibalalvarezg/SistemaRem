/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexionBd.ConexionBd;
import VO.Remuneracion;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author aniba
 */
public class RemuneracionDAO {
    public void registrarPago(Remuneracion rem) {
        ConexionBd conex= new ConexionBd();
        try {
            
            Statement st = conex.getConnection().createStatement();
            st.executeUpdate("INSERT INTO erpremuneraciones.`REM_Remuneracion` (fecha, montoBruto, montoLiquido, seguroCesantia, descuentoAfp, descuentoRenta, PersonalRut,comisiones) VALUES ('"+rem.getFecha()+"',"+rem.getMontoBruto()+","+rem.getMontoLiquido()+","+rem.getSeguroCesantia()+","+rem.getDescuentoAfp()+","+rem.getDescuentoRenta()+","+rem.getPersonaRut()+","+rem.getComisiones()+")");

            JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
            st.close();
            conex.desconectar();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se registró la persona");
        }
    }
}
