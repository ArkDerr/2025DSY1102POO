/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.daeriquelme.ejemplosemana6_2;

/**
 *
 * @author Cetecom
 */
public class Persona {
    private String rutPersona;
    private String nombrePersona;
    private int edadPersona;

    public Persona() {
    }

    public Persona(String rutPersona, String nombrePersona, int edadPersona) {
        this.rutPersona = rutPersona;
        this.nombrePersona = nombrePersona;
        this.edadPersona = edadPersona;
    }

    public String getRutPersona() {
        return rutPersona;
    }

    public void setRutPersona(String rutPersona) {
        this.rutPersona = rutPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "rutPersona=" + rutPersona + ", nombrePersona=" + nombrePersona + ", edadPersona=" + edadPersona + '}';
    }
     
}
