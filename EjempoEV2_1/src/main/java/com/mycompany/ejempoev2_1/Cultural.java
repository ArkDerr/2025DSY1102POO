/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejempoev2_1;

/**
 *
 * @author Cetecom
 */
public class Cultural extends Tour{
    private String idiomaGuia, sectorPatrimonial;

    public Cultural() {
    }

    public Cultural(String idiomaGuia, String sectorPatrimonial) {
        this.idiomaGuia = idiomaGuia;
        this.sectorPatrimonial = sectorPatrimonial;
    }

    public Cultural(String idiomaGuia, String sectorPatrimonial, int codigo, int precioBase, int duracionHoras, String nombre, String dificultad) {
        super(codigo, precioBase, duracionHoras, nombre, dificultad);
        this.idiomaGuia = idiomaGuia;
        this.sectorPatrimonial = sectorPatrimonial;
    }

    public String getIdiomaGuia() {
        return idiomaGuia;
    }

    public void setIdiomaGuia(String idiomaGuia) {
        this.idiomaGuia = idiomaGuia;
    }

    public String getSectorPatrimonial() {
        return sectorPatrimonial;
    }

    public void setSectorPatrimonial(String sectorPatrimonial) {
        this.sectorPatrimonial = sectorPatrimonial;
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
        return super.toString() + "Cultural{" + "idiomaGuia=" + idiomaGuia + ", sectorPatrimonial=" + sectorPatrimonial + '}';
    }

    @Override
    public double calcularCostoAdicional(int x) {
        double adicional = 0;
        if (idiomaGuia.equalsIgnoreCase("ingles")) {
            adicional = this.precioBase*(x/100);
            this.precioBase = (int)(this.precioBase + adicional);
        }
        return adicional;
    }
    
    
}
