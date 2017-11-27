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
            estatuto.executeUpdate("INSERT INTO REM_Personal (`rut`, `dv`, `nombre`, `apellidoP`, `apellidoM`, `direccion`, `fechaNacimiento`, `sueldoBase`, `bonoColacion`, `bonoMovilizacion`,`codigoAfp`, `idCiudad`) VALUES ("
                    +persona.getRut()+","+persona.getDv()+",'"+persona.getNombre()+"','"+persona.getApellidoPat()+"','"+persona.getApellidoMat()+"','"+persona.getDireccion()+"','"+persona.getFechaNacimiento()+"',"+persona.getSueldoBase()+","
                    +persona.getBonoColacion()+","+persona.getBonoMovilizacion()+","+persona.getIdAfp()+","+persona.getIdCiudad()+")");

            JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
            estatuto.close();
            conex.desconectar();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se registró la persona");
        }
    }
    public ArrayList<Persona> getListaPersonas(){
        ConexionBd conex= new ConexionBd();
        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
        try {
            Statement estatuto = conex.getConnection().createStatement();
            ResultSet rs;
            Persona persona;
            rs = estatuto.executeQuery("SELECT * FROM REM_Personal WHERE activo = 1 ");
            while(rs.next()){
                persona = new Persona(rs.getString("nombre"),rs.getString("apellidoP"),rs.getString("apellidoM"),rs.getString("direccion"),rs.getString("fechaNacimiento"),rs.getInt("rut"),rs.getInt("dv"),rs.getInt("idCiudad"),rs.getInt("sueldoBase"),rs.getInt("bonoColacion"),rs.getInt("bonoMovilizacion"),rs.getInt("codigoAfp"));
                listaPersonas.add(persona);
            }
            estatuto.close();
            conex.desconectar();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se encontraron personas");
        }
        return listaPersonas;
    }
    
    public Persona buscarPersona(int rut, int dv){
        ConexionBd conex= new ConexionBd();
        try {
            Statement st = conex.getConnection().createStatement();
            ResultSet rs;
            Persona persona;
            rs = st.executeQuery("SELECT * FROM REM_Personal WHERE rut="+rut+" AND dv="+dv+" AND activo = 1");
            if (!rs.next() ) {
                persona = null;
                JOptionPane.showMessageDialog(null, "No se encontró la persona.");

            } else {
                persona = new Persona(rs.getString("nombre"),rs.getString("apellidoP"),rs.getString("apellidoM"),rs.getString("direccion"),rs.getString("fechaNacimiento"),rs.getInt("rut"),rs.getInt("dv"),rs.getInt("idCiudad"),rs.getInt("sueldoBase"),rs.getInt("bonoColacion"),rs.getInt("bonoMovilizacion"),rs.getInt("codigoAfp"));
            }
            st.close();
            conex.desconectar();
            return persona;


        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se encontraron personas");
            return null;
        }
    }
    
    public void darDeBajaPersona(int rut,int dv) {
        ConexionBd conex= new ConexionBd();
        try {
            Statement st = conex.getConnection().createStatement();
            ResultSet rs;
            Persona persona;
            st.executeUpdate("UPDATE REM_Personal SET activo = 0 WHERE rut="+rut+" AND dv="+dv);
            st.close();
            conex.desconectar();
            JOptionPane.showMessageDialog(null, "Se dió de baja correctamente.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se encontraron personas");
        }
    
    }

    public void editarPersona(Persona editarPersona) {
        ConexionBd conex= new ConexionBd();
        try {
            
            Statement estatuto = conex.getConnection().createStatement();
            estatuto.executeUpdate("UPDATE `erpremuneraciones`.`REM_Personal` SET `nombre`='"+editarPersona.getNombre()+"', `apellidoP`='"+editarPersona.getApellidoPat()+"', `apellidoM`='"+editarPersona.getApellidoMat()+"', `fechaNacimiento`='"+editarPersona.getFechaNacimiento()+"', `direccion`='"+editarPersona.getDireccion()+"', `bonoColacion`="+editarPersona.getBonoColacion()+", `bonoMovilizacion`="+editarPersona.getBonoMovilizacion()+", `codigoAfp`="+editarPersona.getIdAfp()+", `idCiudad`="+editarPersona.getIdCiudad()+" WHERE `rut`='"+editarPersona.getRut()+"'");

            JOptionPane.showMessageDialog(null, "Se ha editado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
            estatuto.close();
            conex.desconectar();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se edito la persona");
        }
    }
    
 
}
