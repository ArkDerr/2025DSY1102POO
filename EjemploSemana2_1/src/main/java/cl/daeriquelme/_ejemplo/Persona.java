/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.daeriquelme._ejemplo;

/**
 *
 * @author arkder
 */
public class Persona {
    
    private String nombreCompleto;
    private int edad;
    private int pasosDiarios = 0;
    private int diaMes;

    public Persona() {
    }

    public Persona(String nombreCompleto, int edad, int diaMes) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.diaMes = diaMes;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPasosDiarios() {
        return pasosDiarios;
    }

    public void setPasosDiarios(int pasosDiarios) {
        this.pasosDiarios = pasosDiarios;
    }

    public int getDiaMes() {
        return diaMes;
    }

    public void setDiaMes(int diaMes) {
        this.diaMes = diaMes;
    }
    

    @Override
    public String toString() {
        return "Persona{" + "nombreCompleto=" + nombreCompleto + ", edad=" + edad + ", pasosDiarios=" + pasosDiarios + ", diaMes=" + diaMes + '}';
    }
    
    public void agregarPasos(int pasos){
        pasosDiarios = pasosDiarios + pasos;
    }
    
    public int agregarEdad(int edad){
        this.edad = this.edad + edad;
        return this.edad;
    }
    
    public void cambiarDia(){
        this.diaMes = this.diaMes + 1;
    }
   
    //Una linea
    /*
    Varias
    Lineas
    */
    
    //Constantes CONSTANTES
}
