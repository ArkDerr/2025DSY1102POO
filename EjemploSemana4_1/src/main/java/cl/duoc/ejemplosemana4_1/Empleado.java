/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.ejemplosemana4_1;

/**
 *
 * @author Cetecom
 */
public class Empleado {
    private int rutEmpleado;
    private char dvEmpleado;
    private String nombreEmpleado;
    private String apellidoEmpleado;
    private GiftCard tarjetaAsignada;

    public Empleado() {
    }

    public Empleado(int rutEmpleado, char dvEmpleado, String nombreEmpleado, String apellidoEmpleado, GiftCard tarjetaAsignada) {
        this.rutEmpleado = rutEmpleado;
        this.dvEmpleado = dvEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.tarjetaAsignada = tarjetaAsignada;
    }

    public int getRutEmpleado() {
        return rutEmpleado;
    }

    public void setRutEmpleado(int rutEmpleado) {
        this.rutEmpleado = rutEmpleado;
    }

    public char getDvEmpleado() {
        return dvEmpleado;
    }

    public void setDvEmpleado(char dvEmpleado) {
        this.dvEmpleado = dvEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public GiftCard getTarjetaAsignada() {
        return tarjetaAsignada;
    }

    public void setTarjetaAsignada(GiftCard tarjetaAsignada) {
        this.tarjetaAsignada = tarjetaAsignada;
    }

    @Override
    public String toString() {
        return "Empleado{" + "rutEmpleado=" + rutEmpleado + ", dvEmpleado=" + dvEmpleado + ", nombreEmpleado=" + nombreEmpleado + ", apellidoEmpleado=" + apellidoEmpleado + ", tarjetaAsignada=" + tarjetaAsignada.toString() + '}';
    }

    

    
    
    
    
}
