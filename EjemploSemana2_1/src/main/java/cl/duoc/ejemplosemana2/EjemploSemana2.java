/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cl.duoc.ejemplosemana2;

/**
 *
 * @author Cetecom
 */
public class EjemploSemana2 {

    public static void main(String[] args) {
        Persona Ruth = new Persona("Ruth Honorio",20,18);
        Persona Daniel = new Persona();
        Persona Juan = new Persona();
        
        System.out.println(Ruth.toString());
        
        System.out.println("########################");
        System.out.println("Agregar 525 pasos");
        Ruth.agregarPasos(525);
        System.out.println(Ruth.toString());
        
        System.out.println("########################");
        System.out.println("Agregar 1000 pasos");
        Ruth.agregarPasos(1000);
        System.out.println(Ruth.toString());
        
        System.out.println("########################");
        System.out.println("Cambiar Dia");
        Ruth.cambiarDia();
        System.out.println(Ruth.getDia());
        
        System.out.println("########################");
        System.out.println("Cambiar Edad");
        System.out.println("La nueva edad es: " + Ruth.agregarEdad(10));
        
        System.out.println("########################");
        System.out.println("El nombre del usuario es: " + Ruth.getNombre() + ", Este usuario tiene: " + Ruth.getEdad() + "Años.");
    }
}
