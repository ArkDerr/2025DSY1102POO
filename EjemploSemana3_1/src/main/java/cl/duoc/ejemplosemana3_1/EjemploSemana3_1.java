/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package cl.duoc.ejemplosemana3_1;

import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class EjemploSemana3_1 {

    public static void main(String[] args) {
        Estructuras ejemplos = new Estructuras(); //Crea instancia donde estan los metodos ejemplo
        Scanner sc = new Scanner(System.in); //Crea instancia scanner para capturar datos por teclado
        //ejemplos.ejemploIfElse();
        //ejemplos.ejemploSwitch();
        //ejemplos.ejemploFor();
        //ejemplos.ejemploWhile();
        //ejemplos.ejemploDoWhile();
        int opcion = 0; //Variable para iterear entre opciones

        //Estructura que permite iterar con el menu
        do {
            menu(); //Llama al metodo menu() para imprimir en pantalla
            System.out.println("Ingrese opcion: ");
            opcion = Integer.parseInt(sc.nextLine()); //Captura datos por teclado y lo asigan a la variable opcion

            //IF-ELSE valida que la opcion no este fuera de rango
            //IF: en este caso IF indica fuera de rango
            //ELSE: opcion valida
            if (opcion <= 0 || opcion >= 7) {
                System.out.println("Seleccione una opcion correcta.");
            } else {

                //Evalua la opcion y ejecuta según esta
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese un valor para evaluar si es menor, igual o mayor a 10: ");
                        int opcionIfElse = Integer.parseInt(sc.nextLine());
                        System.out.println("La estructura del ejemplo es la siguiente: ");
                        System.out.println("\n"
                                + "        if (numero < 10) {\n"
                                + "            System.out.println(\"El numero evaluado es menor a 10\");\n"
                                + "        } else if (numero > 10) {\n"
                                + "            System.out.println(\"El numero evaluado es mayor a 10\");\n"
                                + "        } else {\n"
                                + "            System.out.println(\"El numero evaluado es igual a 10\");\n"
                                + "        }");

                        System.out.println("El resultad de la ejecucion es: ");
                        ejemplos.ejemploIfElse(opcionIfElse);
                        break;
                    case 6:
                        System.out.println("Gracias por usar esta APP!!!");
                        break;
                }
            }
        } while (opcion != 6);
    }

    public static void menu() {
        System.out.println("##################################");
        System.out.println("############## Menu ##############");
        System.out.println("##################################");
        System.out.println("SELECCIONE UNA OPCION:");
        System.out.println("[1] Ejemplo de ejecucion IfElse()");
        System.out.println("[2] Ejemplo de ejecucion Switch()");
        System.out.println("[3] Ejemplo de ejecucion For()");
        System.out.println("[4] Ejemplo de ejecucion While()");
        System.out.println("[5] Ejemplo de ejecucion DoWhile()");
        System.out.println("[6] Salir");
        System.out.println("##################################");
    }
}
