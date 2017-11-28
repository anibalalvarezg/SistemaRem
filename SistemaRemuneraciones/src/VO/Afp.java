/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author Drebin01
 */
public class Afp {
    private int codigoAfp;
    private String nombre; 
    private float tasaAfp;
    private float tasaSis;

    public Afp(int codigoAfp, String nombre, float tasaAfp, float tasaSis) {
        this.codigoAfp = codigoAfp;
        this.nombre = nombre;
        this.tasaAfp = tasaAfp;
        this.tasaSis = tasaSis;
    }

    public Afp(String nombre, int descuento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodigoAfp() {
        return codigoAfp;
    }

    public void setCodigoAfp(int codigoAfp) {
        this.codigoAfp = codigoAfp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTasaAfp() {
        return tasaAfp;
    }

    public void setTasaAfp(float tasaAfp) {
        this.tasaAfp = tasaAfp;
    }

    public float getTasaSis() {
        return tasaSis;
    }

    public void setTasaSis(float tasaSis) {
        this.tasaSis = tasaSis;
    }
            
    
}
