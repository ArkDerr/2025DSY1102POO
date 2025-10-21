/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejempoev2_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class Catalogo {

    private List<Tour> coleccionTours = new ArrayList<Tour>();

    public Catalogo() {
    }

    public List<Tour> getTours() {
        return coleccionTours;
    }

    public void setTours(List<Tour> tours) {
        this.coleccionTours = tours;
    }

    public void agregarTour(Tour t) {
        coleccionTours.add(t);
    }

    public void buscarTour(int codigo) {
        boolean encontrado = false;
        for (Tour tour : coleccionTours) {
            if (tour.getCodigo() == codigo) {
                encontrado = true;
                System.out.println(tour.toString());
            }
        }
        if (!encontrado) {
            System.out.println("No existe registro");
        }
    }

    public void aplicarAjuste() {

    }

    public void calcularDescuentoTotal() {

    }

    public void eliminarTour(int codigo) {
        boolean encontrado = false;
        for (Tour tour : coleccionTours) {
            if (tour.getCodigo() == codigo) {
                encontrado = true;
                coleccionTours.remove(tour);
                System.out.println("Tour Eliminado");
            }
        }
        if (!encontrado) {
            System.out.println("No existe registro");
        }
    }

}
