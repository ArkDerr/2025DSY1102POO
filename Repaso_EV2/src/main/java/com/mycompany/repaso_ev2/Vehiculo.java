/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repaso_ev2;

/**
 *
 * @author Cetecom
 */
public abstract class Vehiculo implements MyInterface{
    protected String patente, marca, color;
    protected int precio;

    public Vehiculo() {
    }

    public Vehiculo(String patente, String marca, String color, int precio) {
        this.patente = patente;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", marca=" + marca + ", color=" + color + ", precio=" + precio + '}';
    }

    @Override
    public void descuento(int parametro) {
        this.precio = (int)(this.precio - (this.precio*(parametro/100.0)));
    }
    
    public abstract void otroMetodo();
    
}
