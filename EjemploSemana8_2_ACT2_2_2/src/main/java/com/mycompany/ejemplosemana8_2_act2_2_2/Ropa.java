/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosemana8_2_act2_2_2;

/**
 *
 * @author Cetecom
 */
public class Ropa extends Producto{
    private String talla, color;

    public Ropa(String talla, String color) {
        this.talla = talla;
        this.color = color;
    }

    public Ropa(String talla, String color, String idProducto, String nombre, Double precio) {
        super(idProducto, nombre, precio);
        this.talla = talla;
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        return super.toString() + " Ropa{" + "talla=" + talla + ", color=" + color + '}';
    }
    
    
    
}
