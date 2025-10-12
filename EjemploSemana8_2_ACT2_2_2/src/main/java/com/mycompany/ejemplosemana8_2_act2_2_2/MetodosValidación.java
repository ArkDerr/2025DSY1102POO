/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosemana8_2_act2_2_2;

/**
 *
 * @author arkder
 */
import java.util.Scanner;

public class MetodosValidación {

    public static int ValidaInt(Scanner sc) {
        int capturaTeclado = 0;
        boolean valido = false;

        do {
            try {
                System.out.print("---->>>>");
                capturaTeclado = Integer.parseInt(sc.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Valor ingresado no permitido. Intente nuevamente.");
            }
        } while (!valido);

        return capturaTeclado;
    }

}
