/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejempoev2_1;

import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class EjempoEV2_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Catalogo ca = new Catalogo();
        int opcMenu = 0, opcTipoTour = 0;

        do {
            System.out.println("Último Viaje S.A – Cementerio General\n"
                    + "1.	Ingresar Tour: permite agregar un Tour Histórico o Cultural.\n"
                    + "2.	Mostrar Información: mostrar toda la información de un tour.\n"
                    + "3.	Aplicar Ajuste de Precio: ejecuta aplicarAjusteATodos().\n"
                    + "4.	Eliminar Tour.\n"
                    + "5.	Salir.");
            System.out.println("Ingrese opcion: ");
            opcMenu = Integer.parseInt(sc.nextLine());

            switch (opcMenu) {
                case 1:
                    int codigo = 0,
                     precioBase = 0,
                     duracionHoras = 0;

                    String nombre,
                     dificultad,
                     tematicaPrincipal,
                     equipamiento,
                     tipoRecorrido,
                     idiomaGuia,
                     sectorPatrimonial;

                    System.out.println("Ingrese los datos solicitados: ");
                    System.out.println("Codigo: ");
                    codigo = Integer.parseInt(sc.nextLine());
                    System.out.println("Nombre: ");
                    nombre = sc.nextLine();
                    do {
                        System.out.println("Nivel Dificultad (baja/media/alta): ");
                        dificultad = sc.nextLine();
                    } while (!dificultad.equalsIgnoreCase("baja") && !dificultad.equalsIgnoreCase("media") && !dificultad.equalsIgnoreCase("alta"));
                    System.out.println("Duracion en horas: ");
                    duracionHoras = Integer.parseInt(sc.nextLine());
                    System.out.println("Precio Base: ");
                    precioBase = Integer.parseInt(sc.nextLine());
                    do {
                        System.out.println("Ingrese el tipo de tour: ");
                        System.out.println("1. Historico.");
                        System.out.println("2. Cultural.");
                        opcTipoTour = Integer.parseInt(sc.nextLine());
                    } while (opcTipoTour != 1 && opcTipoTour != 2);
                    if (opcTipoTour == 1) {
                        System.out.println("Tipo de tematica: ");
                        tematicaPrincipal = sc.nextLine();
                        System.out.println("Tipo de equipamiento: ");
                        equipamiento = sc.nextLine();
                        do {
                            System.out.println("Tipo de recorrido (diurno/nocturno): ");
                            tipoRecorrido =sc.nextLine();
                        } while (!tipoRecorrido.equalsIgnoreCase("diurno") && !tipoRecorrido.equalsIgnoreCase("nocturno"));
                        Historico hist =  new Historico(tematicaPrincipal, equipamiento, tipoRecorrido, codigo, precioBase, duracionHoras, nombre, dificultad);
                        ca.agregarTour(hist);
                    }else{
                        System.out.println("Sector: ");
                        sectorPatrimonial = sc.nextLine();
                        System.out.println("Idioma: ");
                        idiomaGuia = sc.nextLine();
                        Cultural cul = new Cultural(idiomaGuia, sectorPatrimonial, codigo, precioBase, duracionHoras, nombre, dificultad);
                        ca.agregarTour(cul);
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el codigo del Tour que busca: ");
                    int codigoBuscado = Integer.parseInt(sc.nextLine());
                    ca.buscarTour(codigoBuscado);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Cerrando APP!!!");
                    break;
                default:
                    System.out.println("Opcion fuera de rango");
            }
        } while (opcMenu != 5);

    }
}
