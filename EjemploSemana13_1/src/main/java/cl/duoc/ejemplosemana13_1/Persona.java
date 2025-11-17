/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.ejemplosemana13_1;

/**
 *
 * @author Daniel
 */
public abstract class Persona {
    protected String nombre, apellido;
    protected int rut;
    protected char dv;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int rut, char dv) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }
   
}
