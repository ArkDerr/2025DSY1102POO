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

        Ropa ropa1 = new Ropa("XL", "Negro", "A004", "Polera", 5.5);
        Ropa ropa2 = new Ropa("S", "Roja", "A005", "Pantalon", 10.5);
        Ropa ropa3 = new Ropa("L", "Azul", "A006", "Camisa", 3.5);

        List<Electronico> electronicos = new ArrayList();
        List<Ropa> Ropas = new ArrayList();
        List<Pedido> Pedidos = new ArrayList();

        electronicos.add(electronico1);
        electronicos.add(electronico2);
        electronicos.add(electronico3);

        Ropas.add(ropa1);
        Ropas.add(ropa2);
        Ropas.add(ropa3);

        int opcMenu = 0;
        int numeroPedido = 1;
        int pedidoBuscado;
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

            opcMenu = MetodosPrograma.ValidaInt(sc);

            switch (opcMenu) {
                case 1:

                    int opcCategoria = 0;
                    List<Producto> detallePedido = new ArrayList();

                    do {

                        System.out.println("##############################################");
                        System.out.println("Seleccione una categoria:");
                        System.out.println("[1] Electronico");
                        System.out.println("[2] Ropa");
                        System.out.println("[3] Guardar Pedido");
                        System.out.println("[4] Volver");

                        opcCategoria = MetodosPrograma.ValidaInt(sc);

                        switch (opcCategoria) {
                            case 1:
                                int opcDetalleElec = 0;

                                do {
                                    int index = 1;

                                    System.out.println("##############################################");
                                    System.out.println("Seleccione un Producto:");
                                    System.out.println("[1] " + electronico1.getNombre() + " | Precio: " + electronico1.getPrecio());
                                    System.out.println("[2] " + electronico2.getNombre() + " | Precio: " + electronico2.getPrecio());
                                    System.out.println("[3] " + electronico3.getNombre() + " | Precio: " + electronico3.getPrecio());
                                    System.out.println("[4] Volver");

                                    opcDetalleElec = MetodosPrograma.ValidaInt(sc);

                                    switch (opcDetalleElec) {
                                        case 1:
                                            detallePedido.add(electronico1);
                                            break;
                                        case 2:
                                            detallePedido.add(electronico2);
                                            break;
                                        case 3:
                                            detallePedido.add(electronico3);
                                            break;
                                        case 4:
                                            for (Object objPedido : detallePedido) {
                                                System.out.println(objPedido);
                                            }
                                            break;
                                        default:
                                            System.out.println("Opcion ingresada fuera de rango!!!!!!");
                                    }

                                } while (opcDetalleElec != 4);

                                break;
                            case 2:
                                int opcDetalleRop = 0;

                                do {
                                    int index = 1;

                                    System.out.println("##############################################");
                                    System.out.println("Seleccione un Producto:");
                                    System.out.println("[1] " + ropa1.getNombre() + " | Precio: " + ropa1.getPrecio());
                                    System.out.println("[2] " + ropa2.getNombre() + " | Precio: " + ropa2.getPrecio());
                                    System.out.println("[3] " + ropa3.getNombre() + " | Precio: " + ropa3.getPrecio());
                                    System.out.println("[4] Volver");

                                    opcDetalleRop = MetodosPrograma.ValidaInt(sc);

                                    switch (opcDetalleRop) {
                                        case 1:
                                            detallePedido.add(ropa1);
                                            break;
                                        case 2:
                                            detallePedido.add(ropa2);
                                            break;
                                        case 3:
                                            detallePedido.add(ropa3);
                                            break;
                                        case 4:
                                            for (Object objPedido : detallePedido) {
                                                System.out.println(objPedido);
                                            }
                                            break;
                                        default:
                                            System.out.println("Opcion ingresada fuera de rango!!!!!!");
                                    }

                                } while (opcDetalleRop != 4);

                                break;
                            case 3:

                                if (detallePedido.isEmpty()) {
                                    System.out.println("Debe Agregar productos para agregar un pedido!!!");
                                } else {
                                    int opcGuardarPedido = 0;

                                    do {
                                        System.out.println("Presione 1 para Guardar el Pedido o 2 Para seguir Agregando articulos");

                                        opcGuardarPedido = MetodosPrograma.ValidaInt(sc);

                                        switch (opcGuardarPedido) {
                                            case 1:
                                                String nombreCliente;
                                                String rutCliente;

                                                System.out.println("Ingrese Nombre Cliente");
                                                nombreCliente = MetodosPrograma.ValidaString(sc);

                                                System.out.println("Ingrese Rut Cliente");
                                                rutCliente = MetodosPrograma.ValidaString(sc);

                                                Cliente cliente = new Cliente(nombreCliente, rutCliente);
                                                                          
                                                Pedido pedido = new Pedido(numeroPedido, cliente, detallePedido, MetodosPrograma.TotalPedido(detallePedido));
                                                Pedidos.add(pedido);
                                                numeroPedido++;
                                                opcGuardarPedido=2;
                                                detallePedido = new ArrayList<>();

                                                break;

                                            case 2:
                                                for (Object objPedido : detallePedido) {
                                                    System.out.println(objPedido);
                                                }
                                                break;
                                            default:
                                                System.out.println("Opcion ingresada fuera de rango!!!!!!");
                                        }

                                    } while (opcGuardarPedido != 2);
                                }

                                break;
                            case 4:
                                System.out.println("Volviendo al menu anterior!!!!!!");
                                break;
                            default:

                                System.out.println("Opcion ingresada fuera de rango!!!!!!");

                        }

                    } while (opcCategoria != 4);

                    break;
                case 2:
                    System.out.println("Ingrese el Numero para buscar pedido: ");
                    pedidoBuscado = MetodosPrograma.ValidaInt(sc);
                    for (Pedido pedido : Pedidos) {
                        if (pedido.getNumeroPedido() == pedidoBuscado) {
                            System.out.println(pedido.toString());
                        }
                    }
                    break;
                case 3:
                    for (Pedido pedido : Pedidos) {
                        System.out.println(pedido.toString());
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el Numero para buscar pedido: ");
                    pedidoBuscado = MetodosPrograma.ValidaInt(sc);
                    for (Pedido pedido : Pedidos) {
                        if (pedido.getNumeroPedido() == pedidoBuscado) {
                            Pedidos.remove(pedido);
                        }
                    }
                    break;
                case 5:

                    break;
                case 6:
                       System.out.println("Cerrando la APP!!!!!!");
                    break;
                default:

                    System.out.println("Opcion ingresada fuera de rango!!!!!!");

            }

        } while (opcMenu != 6);

    }
}
