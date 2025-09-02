/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package cl.duoc.ejemplosemana4_1;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class EjemploSemana4_1 {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GiftCard tarjeta1 = new GiftCard();
        GiftCard tarjeta2 = new GiftCard();
        GiftCard tarjeta3 = new GiftCard();

        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();
        Empleado empleado3 = new Empleado();

        int opcMenu = 0;

        do {
            menu();
            opcMenu = Integer.parseInt(sc.nextLine().trim());

            switch (opcMenu) {
                case 1:
                    if (tarjeta1.getNumeroTarjeta() == 0) {
                        tarjeta1.setNumeroTarjeta(1);
                        tarjeta1.setSaldoTarjeta(150000);
                        tarjeta1.setFechaEmision(LocalDate.now());
                        tarjeta1.setEstadoTarjeta("Activa");
                        do {     
                            System.out.println("Ingrese fecha de vencimiento posterior a " + tarjeta1.getFechaEmision());
                            LocalDate fechaIngresa = LocalDate.parse(sc.nextLine());
                            tarjeta1.setFechaVencimiento(fechaIngresa);
                        } while (tarjeta1.getFechaVencimiento().isBefore(tarjeta1.getFechaEmision()));
                        System.out.println(tarjeta1.toString());
                    } else if (tarjeta2.getNumeroTarjeta() == 0) {
                        tarjeta2.setNumeroTarjeta(2);
                        tarjeta2.setSaldoTarjeta(150000);
                        tarjeta2.setFechaEmision(LocalDate.now());
                        tarjeta2.setEstadoTarjeta("Activa");
                        do {     
                            System.out.println("Ingrese fecha de vencimiento posterior a " + tarjeta2.getFechaEmision());
                            LocalDate fechaIngresa = LocalDate.parse(sc.nextLine());
                            tarjeta2.setFechaVencimiento(fechaIngresa);
                        } while (tarjeta1.getFechaVencimiento().isBefore(tarjeta1.getFechaEmision()));
                        System.out.println(tarjeta2.toString());

                    } else if (tarjeta3.getNumeroTarjeta() == 0) {
                        tarjeta3.setNumeroTarjeta(3);
                        tarjeta3.setSaldoTarjeta(150000);
                        tarjeta3.setFechaEmision(LocalDate.now());
                        tarjeta3.setEstadoTarjeta("Activa");
                        do {     
                            System.out.println("Ingrese fecha de vencimiento posterior a " + tarjeta1.getFechaEmision());
                            LocalDate fechaIngresa = LocalDate.parse(sc.nextLine());
                            tarjeta3.setFechaVencimiento(fechaIngresa);
                        } while (tarjeta3.getFechaVencimiento().isBefore(tarjeta3.getFechaEmision()));
                        System.out.println(tarjeta3.toString());
                    } else {
                        System.out.println("Todas las tarjetas estan Activas");
                    }

                    break;
                case 2:
                    if (tarjeta1.getEstadoTarjeta().equals("Activa")) {
                        System.out.println("Ingrese rut");
                        empleado1.setRutEmpleado(Integer.parseInt(sc.nextLine()));
                        System.out.println("Ingrese DV:");
                        empleado1.setDvEmpleado('k');
                        System.out.println("Ingrese Nombre");
                        empleado1.setNombreEmpleado(sc.nextLine());
                        System.out.println("Ingrese Apellido");
                        empleado1.setApellidoEmpleado(sc.nextLine());
                        tarjeta1.setEstadoTarjeta("Asignada");
                        empleado1.setTarjetaAsignada(tarjeta1);
                        System.out.println(empleado1.toString());
                    } else {
                    }

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
                    throw new AssertionError();
            }
        } while (opcMenu != 6);

    }

    public static void menu() {
        System.out.println("Menu:");
        System.out.println("[1] Crear tarjeta");
        System.out.println("[2] Asignar tarjeta");
        System.out.println("[3] Descontar saldo");
        System.out.println("[4] Abonar saldo");
        System.out.println("[5] Consultar saldo");
        System.out.println("[6] Salir");
        System.out.println("Ingres su opcion:");
    }

}
