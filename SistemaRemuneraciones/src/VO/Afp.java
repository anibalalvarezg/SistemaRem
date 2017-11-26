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
    private int descuento;

    public Afp(int codigoAfp, String nombre, int descuento) {
        this.codigoAfp = codigoAfp;
        this.nombre = nombre;
        this.descuento = descuento;
    }

    public int getCodigoAfp() {
        return codigoAfp;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setCodigoAfp(int codigoAfp) {
        this.codigoAfp = codigoAfp;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}
