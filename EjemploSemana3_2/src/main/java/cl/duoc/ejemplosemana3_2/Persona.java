/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.ejemplosemana3_2;

/**
 *
 * @author Cetecom
 */
public class Persona {
    
    private String nombreCompleto;
    private int edad;
    private String carrera;

    //Constructuctores
    
    //Constructor sin parametros
    public Persona() {
    }
    
    //Constructor con Parametros
    public Persona(String nombreCompleto, int edad, String carrera) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.carrera = carrera;
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombreCompleto=" + nombreCompleto + ", edad=" + edad + ", carrera=" + carrera + '}';
        //return "Esto es un ejemplo";
    }
   
}
