/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosemana8_2_act2_2_2;

/**
 *
 * @author arkder
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MetodosPrograma {

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
    
    public static String ValidaString(Scanner sc) {
        String capturaTeclado = "";
        boolean valido = false;

        do {
            try {
                System.out.print("---->>>>");
                capturaTeclado = sc.nextLine();
                if (capturaTeclado.equals("") || capturaTeclado.length() < 3) {
                    System.out.println("Dato en blanco o sin el numero minimo de caracteres");
                } else {
                    valido = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Valor ingresado no permitido. Intente nuevamente.");
            }
        } while (!valido);

        return capturaTeclado;
    }
    
    public static double TotalPedido (List<Producto> detallePedido){
        double totalPedido = 0;
        for (Producto producto : detallePedido) {
            totalPedido =  totalPedido + producto.getPrecio();
        }
        return totalPedido;
    }

}
