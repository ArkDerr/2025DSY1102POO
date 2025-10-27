/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package cl.daeriquelme.ejemploev2_1;

import java.util.Scanner;

/**
 *
 * @author arkder
 */
public class EjemploEV2_1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Catalogo ca = new Catalogo();
        int opcMenu = 0, opcTipoTour = 0;
        
        do {
            System.out.println("Último Viaje S.A – Cementerio General\n"
                    + "1. Ingresar Tour: permite agregar un Tour Histórico o Cultural.\n"
                    + "2. Mostrar Información: mostrar toda la información de un tour.\n"
                    + "3. Aplicar Ajuste de Precio: ejecuta aplicarAjusteATodos().\n"
                    + "4. Eliminar Tour.\n"
                    + "5. Salir.");
            System.out.println("Ingrese Opción: ");
            opcMenu = Integer.parseInt(sc.nextLine());
            
            switch (opcMenu) {
                case 1:
                    int codigo = 0,
                     precioBase = 0,
                     duracionHoras = 0;
                    
                    String nombre,
                     dificultad,
                     tematicaprincipal,
                     equipamiento,
                     tipoRecorrido,
                     sectorPatrimonial,
                     idiomaGuia;
                    
                    System.out.println("Creando un Tour, ingrese datos");
                    System.out.println("Codigo: ");
                    codigo = Integer.parseInt(sc.nextLine());
                    ;
                    System.out.println("Nombre: ");
                    nombre = sc.nextLine();
                    do {
                        System.out.println("Dificultad baja/media/alta: ");
                        dificultad = sc.nextLine();
                    } while (dificultad.compareToIgnoreCase("baja") != 0
                            && dificultad.compareToIgnoreCase("media") != 0
                            && dificultad.compareToIgnoreCase("alta") != 0);
                    System.out.print("Horas que dura el Tour: ");
                    duracionHoras = Integer.parseInt(sc.nextLine());
                    System.out.println("Precio base: ");
                    precioBase = Integer.parseInt(sc.nextLine());
                    
                    do {
                        System.out.println("Que Tour ingresará");
                        System.out.println("[1]Historico");
                        System.out.println("[2]Cultural\n");
                        opcTipoTour = Integer.parseInt(sc.nextLine());
                    } while (opcTipoTour != 1 && opcTipoTour != 2);
                    if (opcTipoTour == 1) {
                        System.out.println("Ingrese tipo de tematica: ");
                        tematicaprincipal = sc.nextLine();
                        System.out.println("Equipamiento: ");
                        equipamiento = sc.nextLine();
                        do {
                            System.out.println("Tipo Recorrido (Diurno/Nocturno): ");
                            tipoRecorrido = sc.nextLine();
                        } while (tipoRecorrido.compareToIgnoreCase("diurno") != 0
                                && tipoRecorrido.compareToIgnoreCase("nocturno") != 0);
                        Historico his = new Historico(tematicaprincipal, equipamiento, tipoRecorrido, codigo, precioBase, duracionHoras, nombre, dificultad);
<<<<<<< HEAD
                        System.out.println(his.calcularCostoAdicional(25));
                        his.setPrecioBase(precioBase+his.calcularCostoAdicional(25));
                        System.out.println(his.getPrecioBase());
                        his.setPrecioBase((int)his.aplicarDescuento());
                        System.out.println(his.getPrecioBase());
=======
                        ca.calcularDescuentoTotal(his);
>>>>>>> 744b2859d37e3af0ca57256e94aafcb5a0f36886
                        ca.agregarTour(his);
                    } else {
                        System.out.println("Sector Patrimonial: ");
                        sectorPatrimonial = sc.nextLine();
                        System.out.println("Idioma del guia: ");
                        idiomaGuia = sc.nextLine();
                        Cultural cul = new Cultural(sectorPatrimonial, idiomaGuia, codigo, precioBase, duracionHoras, nombre, dificultad);
<<<<<<< HEAD
                        cul.calcularCostoAdicional(25);
                        cul.setPrecioBase((int)cul.aplicarDescuento());
=======
                        ca.calcularDescuentoTotal(cul);
>>>>>>> 744b2859d37e3af0ca57256e94aafcb5a0f36886
                        ca.agregarTour(cul);
                    }
                    
                    break;
                case 2:
                    System.out.println("Ingrese Codigo a buscar: ");
                    codigo = Integer.parseInt(sc.nextLine());
                    Tour tourBuscado = ca.buscarTour(codigo);
                    if (tourBuscado != null) {
                        System.out.println(tourBuscado.toString());
                    } else {
                        System.out.println("No se encontro tour");
                    }
                    break;
                case 3:
<<<<<<< HEAD
                    ca.aplicarAjusteATodos();

=======
                    
>>>>>>> 744b2859d37e3af0ca57256e94aafcb5a0f36886
                    break;
                case 4:
                    System.out.println("Ingrese Codigo a buscar: ");
                    codigo = Integer.parseInt(sc.nextLine());
                    boolean eliminado = ca.eliminarTour(codigo);
                    if (eliminado) {
                        System.out.println("Tour Eliminado");
                    } else {
                        System.out.println("No se encontro tour");
                    }
                    break;
                case 5:
                    System.out.println("Cerrando APP!!!!");
                    break;
                default:
                    System.out.println("Opcion ingresada no es valida");
            }
<<<<<<< HEAD
=======
            
>>>>>>> 744b2859d37e3af0ca57256e94aafcb5a0f36886
        } while (opcMenu != 5);
        
    }
    
}
