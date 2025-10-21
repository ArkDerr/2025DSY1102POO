/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejempoev2_1;

/**
 *
 * @author Cetecom
 */
public abstract class Tour implements Promocion{
    protected int codigo, precioBase, duracionHoras;
    protected String nombre, dificultad;

    public Tour() {
    }

    public Tour(int codigo, int precioBase, int duracionHoras, String nombre, String dificultad) {
        this.codigo = codigo;
        this.precioBase = precioBase;
        this.duracionHoras = duracionHoras;
        this.nombre = nombre;
        this.dificultad = dificultad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    @Override
    public String toString() {
        return "Tour{" + "codigo=" + codigo + ", precioBase=" + precioBase + ", duracionHoras=" + duracionHoras + ", nombre=" + nombre + ", dificultad=" + dificultad + '}';
    }
    
    public void disminuirBase(){
        if (dificultad.equalsIgnoreCase("baja")) {
            precioBase = precioBase - (int)(precioBase*0.1);
        }
    }

    @Override
    public double aplicarDescuento() {
        int descuento = 0;
        if (dificultad.equalsIgnoreCase("alta") && duracionHoras > 5) {
            descuento = (int)(precioBase*DTO_TEM);
        }
        return descuento;
    }
    
    public abstract double calcularCostoAdicional (int x);
    
    
}
