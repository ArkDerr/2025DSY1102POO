/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejempoev2_1;

/**
 *
 * @author Cetecom
 */
public class Historico extends Tour{
    private String tematicaPrincipal, equipamiento, tipoRecorrido;

    public Historico() {
    }

    public Historico(String tematicaPrincipal, String equipamiento, String tipoRecorrido) {
        this.tematicaPrincipal = tematicaPrincipal;
        this.equipamiento = equipamiento;
        this.tipoRecorrido = tipoRecorrido;
    }

    public Historico(String tematicaPrincipal, String equipamiento, String tipoRecorrido, int codigo, int precioBase, int duracionHoras, String nombre, String dificultad) {
        super(codigo, precioBase, duracionHoras, nombre, dificultad);
        this.tematicaPrincipal = tematicaPrincipal;
        this.equipamiento = equipamiento;
        this.tipoRecorrido = tipoRecorrido;
    }

    public String getTematicaPrincipal() {
        return tematicaPrincipal;
    }

    public void setTematicaPrincipal(String tematicaPrincipal) {
        this.tematicaPrincipal = tematicaPrincipal;
    }

    public String getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(String equipamiento) {
        this.equipamiento = equipamiento;
    }

    public String getTipoRecorrido() {
        return tipoRecorrido;
    }

    public void setTipoRecorrido(String tipoRecorrido) {
        this.tipoRecorrido = tipoRecorrido;
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
        return super.toString() + "Historico{" + "tematicaPrincipal=" + tematicaPrincipal + ", equipamiento=" + equipamiento + ", tipoRecorrido=" + tipoRecorrido + '}';
    }

    @Override
    public double calcularCostoAdicional(int x) {
        double adicional = 0;
        if (tipoRecorrido.equalsIgnoreCase("nocturno")) {
            adicional = this.precioBase*(x/100);
            this.precioBase = (int)(this.precioBase + adicional);
        }
        return adicional;
    }

   
    
    
    
    
}
