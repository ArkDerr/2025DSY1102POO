/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package cl.daeriquelme.ejemplosemana6_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class EjemploSemana6_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Persona> listaPersonas = new ArrayList();

        int opcMenu = 0;

        do {
            System.out.println("##########################");
            System.out.println("##   Seleccione Opcion  ##");
            System.out.println("##########################");
            System.out.println("[1] Registar Persona");
            System.out.println("[2] Buscar una Persona");
            System.out.println("[3] Listar Todas las Personas");
            System.out.println("[4] Editar una Persona");
            System.out.println("[5] Eliminar una Persona");
            System.out.println("[6] Cerrar App");
            System.out.print("--->");

            opcMenu = Integer.parseInt(sc.nextLine());

            switch (opcMenu) {
                case 1:
                    System.out.print("Ingrese Rut de la Persona: ");
                    String rut = sc.nextLine();
                    System.out.print("Ingrese Nombre de la Persona: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese edad de la persona: ");
                    int edad = Integer.parseInt(sc.nextLine());
                    Persona persona = new Persona(rut,nombre,edad);
                    listaPersonas.add(persona);
                    break;
                case 2:
                    System.out.print("Ingrese el rut de la Persona: ");
                    String rutBuscado = sc.nextLine();
                    boolean encontrado = false;
                    for (Persona listaPersona : listaPersonas) {
                        if (listaPersona.getRutPersona().equals(rutBuscado)) {
                            System.out.println(listaPersona.toString());
                            encontrado = true;
                        }
                    }
                    if(!encontrado){
                        System.out.println("No encontre nada");
                    }
                    
                    break;
                case 3:
                    for (Persona personaListada : listaPersonas) {
                        System.out.println(personaListada.toString());
                    }
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Gracias por utilizar mi App!!!");
                    break;
                default:
                    System.out.println("Vuelva a ingresar una opcion valida!!!");
                    ;
            }

        } while (opcMenu != 6);

    }
}
