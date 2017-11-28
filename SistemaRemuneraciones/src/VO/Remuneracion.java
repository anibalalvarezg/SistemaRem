/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author aniba
 */
public class Remuneracion {
    private String fecha;
    private int montoBruto;
    private float montoLiquido;
    private float seguroCesantia;
    private float descuentoAfp;
    private float descuentoRenta;
    private float comisiones;
    private int personaRut;

    public Remuneracion(String fecha, int montoBruto, float montoLiquido, float seguroCesantia, float descuentoAfp, float descuentoRenta, float comisiones, int personaRut) {
        this.fecha = fecha;
        this.montoBruto = montoBruto;
        this.montoLiquido = montoLiquido;
        this.seguroCesantia = seguroCesantia;
        this.descuentoAfp = descuentoAfp;
        this.descuentoRenta = descuentoRenta;
        this.comisiones = comisiones;
        this.personaRut = personaRut;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public int getMontoBruto() {
        return montoBruto;
    }

    public void setMontoBruto(int montoBruto) {
        this.montoBruto = montoBruto;
    }

    public float getMontoLiquido() {
        return montoLiquido;
    }

    public void setMontoLiquido(float montoLiquido) {
        this.montoLiquido = montoLiquido;
    }

    public float getSeguroCesantia() {
        return seguroCesantia;
    }

    public void setSeguroCesantia(float seguroCesantia) {
        this.seguroCesantia = seguroCesantia;
    }

    public float getDescuentoAfp() {
        return descuentoAfp;
    }

    public void setDescuentoAfp(float descuentoAfp) {
        this.descuentoAfp = descuentoAfp;
    }

    public float getDescuentoRenta() {
        return descuentoRenta;
    }

    public void setDescuentoRenta(float descuentoRenta) {
        this.descuentoRenta = descuentoRenta;
    }

    public float getComisiones() {
        return comisiones;
    }

    public void setComisiones(float comisiones) {
        this.comisiones = comisiones;
    }

    public int getPersonaRut() {
        return personaRut;
    }

    public void setPersonaRut(int personaRut) {
        this.personaRut = personaRut;
    }
    
    
}
