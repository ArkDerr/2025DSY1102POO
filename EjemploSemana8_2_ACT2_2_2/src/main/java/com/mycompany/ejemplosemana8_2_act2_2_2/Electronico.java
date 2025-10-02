/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosemana8_2_act2_2_2;

/**
 *
 * @author Cetecom
 */
public class Electronico extends Producto {
    private String marca;
    private int garantiaMeses;

    public Electronico(String marca, int garantiaMeses) {
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
    }

    public Electronico(String marca, int garantiaMeses, String idProducto, String nombre, Double precio) {
        super(idProducto, nombre, precio);
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.toString() + " Electronico{" + "marca=" + marca + ", garantiaMeses=" + garantiaMeses + '}';
    }
    
    
}
