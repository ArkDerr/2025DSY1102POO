/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosemana8_1;

/**
 *
 * @author Cetecom
 */
public class Vehiculo {
    protected String patenteVehiculo;
    public String colorVehiculo;
    public int cantidadPasajeros;

    public Vehiculo() {
    }

    public Vehiculo(String patenteVehiculo, String colorVehiculo, int cantidadPasajeros) {
        this.patenteVehiculo = patenteVehiculo;
        this.colorVehiculo = colorVehiculo;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getPatenteVehiculo() {
        return patenteVehiculo;
    }

    public void setPatenteVehiculo(String patenteVehiculo) {
        this.patenteVehiculo = patenteVehiculo;
    }

    public String getColorVehiculo() {
        return colorVehiculo;
    }

    public void setColorVehiculo(String colorVehiculo) {
        this.colorVehiculo = colorVehiculo;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patenteVehiculo=" + patenteVehiculo + ", colorVehiculo=" + colorVehiculo + ", cantidadPasajeros=" + cantidadPasajeros + '}';
    }
    
}
