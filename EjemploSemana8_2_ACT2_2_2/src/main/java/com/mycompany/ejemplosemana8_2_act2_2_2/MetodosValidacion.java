/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosemana8_2_act2_2_2;

import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class MetodosValidacion {

    public static int validaInt(Scanner sc) {
        int capturaTeclado = 0;
        boolean valorValido = false;

        do {
            try {
                System.out.print("---->>>>");
                capturaTeclado = Integer.parseInt(sc.nextLine());
                valorValido = true;
            } catch (Exception e) {
                System.out.println("El valor ingresado no es valido!!!");
            }
        } while (!valorValido);
        return capturaTeclado;
    }

}
