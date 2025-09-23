/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package cl.daeriquelme.ejemploseman6_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arkder
 */
public class EjemploSeman6_1 {

    public static void main(String[] args) {

        //Arreglo
        String[] nombres = new String[3];
        int[] edades = new int[4];
        int[] notas = {5, 6, 7, 4, 6};

        nombres[0] = "Juan";
        nombres[1] = "Maria";

        System.out.println(nombres);

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " ");
        }

        for (String nom : nombres) {
            System.out.println(nom + " ");
        }

        int suma = 0;
        for (int n : notas) {
            suma += n;
        }

        //Colecciones
        List<String> miLista = new ArrayList();

        miLista.add("Juan");
        miLista.add("David");
        miLista.add("Maria");
        miLista.add("Susana");
        miLista.add("Rosa");

        System.out.println("Lista inicial: " + miLista);

        // remove (por índice)
        miLista.remove(1); // elimina "David"
        System.out.println("Después de eliminar índice 1: " + miLista);

        // remove (por objeto)
        miLista.remove("Rosa"); // elimina "Rosa" directamente
        System.out.println("Después de eliminar 'Rosa': " + miLista);

        // contains
        System.out.println("¿La lista contiene 'Maria'? " + miLista.contains("Maria"));
        System.out.println("¿La lista contiene 'Pedro'? " + miLista.contains("Pedro"));

        // isEmpty
        System.out.println("¿La lista está vacía? " + miLista.isEmpty());

        // size
        System.out.println("Cantidad de elementos: " + miLista.size());

        // equals (compara listas completas)
        List<String> otraLista = new ArrayList<>();
        otraLista.add("Juan");
        otraLista.add("Maria");
        otraLista.add("Susana");
        System.out.println("¿Las listas son iguales? " + miLista.equals(otraLista));

        // clear (borra todos los elementos)
        miLista.clear();
        System.out.println("Lista después de clear(): " + miLista);
        System.out.println("¿Está vacía ahora? " + miLista.isEmpty());

        int index = 0;
        for (String persona : miLista) {
            String nombre = persona;
            System.out.println("El nombre en la posición " + String.valueOf(index) + ", es: " + nombre);
            index++;
        }

    }
}
