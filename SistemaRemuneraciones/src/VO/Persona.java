/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author z40L
 */
public class Persona {
    private String nombre;
    private String apellidoPat;
    private String apellidoMat;
    private String direccion;
    private String fechaNacimiento;
    private int rut;
    private int dv;
    private int idCiudad;
    private int sueldoBase;
    private int bonoColacion;
    private int bonoMovilizacion;
    private int idAfp;

    public Persona(String nombre, String apellidoPat, String apellidoMat, String direccion, String fechaNacimiento, int rut, int dv, int idCiudad, int sueldoBase, int bonoColacion, int bonoMovilizacion, int idAfp) {
        this.nombre = nombre;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.rut = rut;
        this.dv = dv;
        this.idCiudad = idCiudad;
        this.sueldoBase = sueldoBase;
        this.bonoColacion = bonoColacion;
        this.bonoMovilizacion = bonoMovilizacion;
        this.idAfp = idAfp;
    }

    public int getIdAfp() {
        return idAfp;
    }

    public void setIdAfp(int idAfp) {
        this.idAfp = idAfp;
    }

    
    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getDv() {
        return dv;
    }

    public void setDv(int dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getBonoColacion() {
        return bonoColacion;
    }

    public void setBonoColacion(int bonoColacion) {
        this.bonoColacion = bonoColacion;
    }

    public int getBonoMovilizacion() {
        return bonoMovilizacion;
    }

    public void setBonoMovilizacion(int bonoMovilizacion) {
        this.bonoMovilizacion = bonoMovilizacion;
    }
    
}
