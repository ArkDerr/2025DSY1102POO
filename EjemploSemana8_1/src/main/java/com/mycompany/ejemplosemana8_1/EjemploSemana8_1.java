/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplosemana8_1;

/**
 *
 * @author Cetecom
 */
public class EjemploSemana8_1 {

    public static void main(String[] args) {
        
        Camion camion1 = new Camion(1500, 2000, "bb3344", "Rojo", 4);
        Auto auto1 = new Auto("aa1122","Blanco",5);
        
        System.out.println(camion1.toString());
        System.out.println(auto1.toString());
        
        camion1.setCantidadPasajeros(2);
        
        System.out.println(camion1.toString());
        
    }
}
