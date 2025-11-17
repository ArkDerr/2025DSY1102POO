/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.ejemplosemana13_1;

/**
 *
 * @author Daniel
 */
public class Asignatura {
    private String nombreAsignatura, sala;
    private Alumno alumno;
    private Profesor profesor;

    public Asignatura() {
    }

    public Asignatura(String nombreAsignatura, String sala, Alumno alumno, Profesor profesor) {
        this.nombreAsignatura = nombreAsignatura;
        this.sala = sala;
        this.alumno = alumno;
        this.profesor = profesor;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

}
