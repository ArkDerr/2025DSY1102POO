/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.ejemplosemana2;

/**
 *
 * @author Cetecom
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private int pasosDiarios = 0;
    private int dia;

    //Contructores
    public Persona() {
    }

    /*
    Esto es un comentario
    de mas de una
    Fila
    */
    public Persona(String nombre, int edad, int dia) {
        this.nombre = nombre;
        this.edad = edad;
        this.dia = dia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", pasosDiarios=" + pasosDiarios + ", dia=" + dia + '}';
    }
    
    public void agregarPasos(int pasos){
        pasosDiarios = pasosDiarios + pasos;
    }
    
    public void cambiarDia(){
        this.dia = this.dia + 1;
    }
    
    public int agregarEdad(int edad){
        this.edad = this.edad + edad;
        return this.edad;
    }
}
