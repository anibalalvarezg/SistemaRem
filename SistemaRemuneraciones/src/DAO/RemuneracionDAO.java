/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexionBd.ConexionBd;
import VO.Remuneracion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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

            JOptionPane.showMessageDialog(null, "Se ha pagado exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
            st.close();
            conex.desconectar();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se registró la persona");
        }
    }
    
    public void registrarPagos(ArrayList<Remuneracion> listaRem) {
        ConexionBd conex= new ConexionBd();
        try {
            int i = 0;
            
            Statement st = conex.getConnection().createStatement();
            for(Remuneracion r: listaRem){
                st.executeUpdate("INSERT INTO erpremuneraciones.`REM_Remuneracion` (fecha, montoBruto, montoLiquido, seguroCesantia, descuentoAfp, descuentoRenta, PersonalRut,comisiones) VALUES ('"+r.getFecha()+"',"+r.getMontoBruto()+","+r.getMontoLiquido()+","+r.getSeguroCesantia()+","+r.getDescuentoAfp()+","+r.getDescuentoRenta()+","+r.getPersonaRut()+","+r.getComisiones()+")");
            }
            JOptionPane.showMessageDialog(null, "Se han pagado exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
            st.close();
            conex.desconectar();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se registró la persona");
        }
    }
    public int consultarPago(int rut, String fecha){
        ConexionBd conex= new ConexionBd();
        int resultado = 0;
        try {
            Statement st = conex.getConnection().createStatement();
            ResultSet rs;
            
            rs = st.executeQuery("SELECT * FROM REM_Remuneracion WHERE Personalrut="+rut+" AND fecha='"+fecha+"'");
            System.out.println("SELECT * FROM REM_Remuneracion WHERE Personalrut="+rut+" AND fecha='"+fecha+"'");
            if (!rs.next() ) {
                resultado = 0;
            } else {
                resultado = 1;
            }
            st.close();
            conex.desconectar();
            return resultado;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se encontraron pagos");
            return 0;
        }
        
    }
    
    public ArrayList<Remuneracion> getListaPagos(){
        ConexionBd conex = new ConexionBd();
        ArrayList<Remuneracion> listaPagos = new ArrayList<Remuneracion>();
        try {
            Statement estatuto = conex.getConnection().createStatement();
            ResultSet rs;
            Remuneracion pago;
            rs = estatuto.executeQuery("SELECT * FROM REM_Remuneracion");
            while(rs.next()){
                pago = new Remuneracion(rs.getString("fecha"),rs.getInt("montoBruto"),rs.getInt("montoLiquido"),rs.getInt("seguroCesantia"),rs.getInt("descuentoAfp"),rs.getInt("descuentoRenta"),rs.getInt("comisiones"),rs.getInt("PersonalRut"));
                listaPagos.add(pago);
            }
            estatuto.close();
            conex.desconectar();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Pago no encontrado");
        }
        return listaPagos;
    }
}
