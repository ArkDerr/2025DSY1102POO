/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repaso_ev2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class ClaseDeLosMetodos {
    
    public List<Vehiculo> coleccionDeVehiculos = new ArrayList();

    public ClaseDeLosMetodos() {
    }

    public List<Vehiculo> getColeccionDeVehiculos() {
        return coleccionDeVehiculos;
    }

    public void setColeccionDeVehiculos(List<Vehiculo> coleccionDeVehiculos) {
        this.coleccionDeVehiculos = coleccionDeVehiculos;
    }
    
    
    public void Agregar(){
        
    }
    
    public void Eliminar(){
        
    }   
    
    public Vehiculo Buscar(){
         automovil auto = new automovil();
         return auto;
    }
    
    public int otroCalculo(){
        return 1;
    }
}
