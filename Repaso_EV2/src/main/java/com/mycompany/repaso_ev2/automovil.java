/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repaso_ev2;

/**
 *
 * @author Cetecom
 */
public class automovil extends Vehiculo{
    private int cantPuertas;

    public automovil() {
    }

    public automovil(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public automovil(int cantPuertas, String patente, String marca, String color, int precio) {
        super(patente, marca, color, precio);
        this.cantPuertas = cantPuertas;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
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
        return super.toString() + "automovil{" + "cantPuertas=" + cantPuertas + '}';
    }

    @Override
    public void otroMetodo() {
        System.out.println("Esto es un metodo heredado");
    }
    
    
    
    
}
