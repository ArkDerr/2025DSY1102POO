/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.daeriquelme.ejemploev2_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arkder
 */
public class Catalogo {

    private List<Tour> tours = new ArrayList<Tour>();

    public Catalogo() {
    }

    public List<Tour> getTours() {
        return tours;
    }

    public void setTours(List<Tour> tours) {
        this.tours = tours;
    }

    //Metodos:
    public void agregarTour(Tour t) {
        this.tours.add(t);
    }

    public Tour buscarTour(int codigo) {
        for (Tour tour : tours) {
            if (tour.getCodigo() == codigo) {
                return tour;
            }
        }
        return null;
    }
<<<<<<< HEAD
    
    public void aplicarAjusteATodos(){
        for (Tour tour : tours) {
           tour.disminuirBase();
        }
    }
    
    public void calcularDescuentoTotal(){
         
    }
    
    public boolean eliminarTour(int codigo){
=======

    public void aplicarAjusteATodos() {
>>>>>>> 744b2859d37e3af0ca57256e94aafcb5a0f36886
        for (Tour tour : tours) {
            tour.disminuirBase();
        }
    }

    public void calcularDescuentoTotal(Tour t) {
        int porecioFinal = 0;
        t.setPrecioBase(t.getPrecioBase() + t.calcularCostoAdicional(25));
        t.setPrecioBase(t.getPrecioBase() - (int) t.aplicarDescuento());
    }

    public boolean eliminarTour(int codigo) {
        for (Tour tour : tours) {
            if (tour.getCodigo() == codigo) {
                tours.remove(tour);
                return true;
            }
        }
        return false;
    }

}
