 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import ConexionBd.ConexionBd;
import VO.Persona;
/**
 *
 * @author z40L
 */
public class PersonaDAO {
    public void registrarPersona(Persona persona) {
        ConexionBd conex= new ConexionBd();
        try {
            Statement estatuto = conex.getConnection().createStatement();
            estatuto.executeUpdate("INSERT INTO rem_personal (`rut`, `dv`, `nombre`, `apellidoP`, `apellidoM`, `direccion`, `fechaNacimiento`, `sueldoBase`, `bonoColacion`, `bonoMovilizacion`,`codigoAfp`, `idCiudad`) VALUES ("
                    +persona.getRut()+","+persona.getDv()+",'"+persona.getNombre()+"','"+persona.getApellidoPat()+"','"+persona.getApellidoMat()+"','"+persona.getDireccion()+"','"+persona.getFechaNacimiento()+"',"+persona.getSueldoBase()+","
                    +persona.getBonoColacion()+","+persona.getBonoMovilizacion()+","+persona.getIdAfp()+","+persona.getIdCiudad()+")");
            JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
            estatuto.close();
            conex.desconectar();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se Registro la persona");
        }
     }
}
