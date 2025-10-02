/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejemplosemana8_2_act2_2_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class EjemploSemana8_2_ACT2_2_2 {

    public static void main(String[] args) {

        Electronico electronico1 = new Electronico("LG", 12, "A001", "Pantalla Plana", 300.0);
        Electronico electronico2 = new Electronico("ASUS", 24, "A002", "Rog", 900.0);
        Electronico electronico3 = new Electronico("Nokia", 0, "A003", "Ladrillo", 100.0);
        Electronico electronico4 = new Electronico("Huawei", 0, "A007", "Poco 10", 50.0);
        
        Ropa ropa1 = new Ropa("XL", "Negro", "A004", "Polera", 5.5);
        Ropa ropa2 = new Ropa("S", "Roja", "A005", "Pantalon", 10.5);
        Ropa ropa3 = new Ropa("L", "Azul", "A006", "Camisa", 3.5);

        List<Electronico> electronicos = new ArrayList();
        List<Ropa> Ropas = new ArrayList();

        electronicos.add(electronico1);
        electronicos.add(electronico2);
        electronicos.add(electronico3);
        electronicos.add(electronico4);

        Ropas.add(ropa1);
        Ropas.add(ropa2);
        Ropas.add(ropa3);

        int opcMenu = 0;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("##############################################");
            System.out.println("Seleccione una Opcion:");
            System.out.println("[1] Crear Pedido");
            System.out.println("[2] Buscar Pedido");
            System.out.println("[3] Listar Todos Pedidos");
            System.out.println("[4] Editar Pedido");
            System.out.println("[5] Eliminar Pedido");
            System.out.println("[6] Salir");
            System.out.print("---->>>>");

            opcMenu = Integer.parseInt(sc.nextLine());

            switch (opcMenu) {
                case 1:

                    int opcCategoria = 0;

                    System.out.println("##############################################");
                    System.out.println("Seleccione una categoria:");
                    System.out.println("[1] Electronico");
                    System.out.println("[2] Ropa");
                    System.out.println("[3] Terminar Pedido");
                    System.out.println("[4] Volver");
                    System.out.print("---->>>>");
                    
                    opcCategoria = Integer.parseInt(sc.nextLine());

                    switch (opcCategoria) {
                        case 1:
                            int index = 1;
                            int opcDetalle = 0;
                            System.out.println("##############################################");
                            System.out.println("Seleccione un Producto:");
                            for (Electronico electronico : electronicos) {
                                System.out.println("[ " + index + "] " + electronico.getNombre() + " Precio: " + electronico.getPrecio());
                                index++;
                            }
                            System.out.println("[ " + index + "] Volver");
                            System.out.print("---->>>>");
                            opcDetalle= Integer.parseInt(sc.nextLine());
                            
                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                        default:
                            System.out.println(opcMenu);
                            System.out.println("Opcion ingresada no valida!!!!!!");
                    }

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                default:
                    System.out.println("opcion ingresada no valida!!!!!!");
                    
            }

        } while (opcMenu != 6);

    }
}
