/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosemana8_1;

/**
 *
 * @author Cetecom
 */
public class Camion extends Vehiculo{
    private int taraCamion;
    private int volumenCargaCamion;

    public Camion(int taraCamion, int volumenCargaCamion) {
        this.taraCamion = taraCamion;
        this.volumenCargaCamion = volumenCargaCamion;
    }

    public Camion(int taraCamion, int volumenCargaCamion, String patenteVehiculo, String colorVehiculo, int cantidadPasajeros) {
        super(patenteVehiculo, colorVehiculo, cantidadPasajeros);
        this.taraCamion = taraCamion;
        this.volumenCargaCamion = volumenCargaCamion;
    }

    public int getTaraCamion() {
        return taraCamion;
    }

    public void setTaraCamion(int taraCamion) {
        this.taraCamion = taraCamion;
    }

    public int getVolumenCargaCamion() {
        return volumenCargaCamion;
    }

    public void setVolumenCargaCamion(int volumenCargaCamion) {
        this.volumenCargaCamion = volumenCargaCamion;
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
        return super.toString() + " Camion{" + "taraCamion=" + taraCamion + ", volumenCargaCamion=" + volumenCargaCamion + '}';
    }
    
}
