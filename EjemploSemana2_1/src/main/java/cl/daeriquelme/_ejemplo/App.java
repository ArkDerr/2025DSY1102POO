/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cl.daeriquelme._ejemplo;

/**
 *
 * @author arkder
 */
public class App {

    public static void main(String[] args) {
        Persona Daniel = new Persona("Daniel Riquelme", 45, 18);
        
        System.out.println(Daniel.toString());
        
        System.out.println("______________________________");
        System.out.println("Agregar pasos 100");
        Daniel.agregarPasos(100);
        System.out.println(Daniel.toString());
        
        System.out.println("______________________________");
        System.out.println("Agregar pasos 50");
        Daniel.agregarPasos(50);
        System.out.println(Daniel.toString());
        
        System.out.println("______________________________");
        System.out.println("Agregar un año");
        System.out.println("La nueva edad de Daniel es: " + Daniel.agregarEdad(1));
        
        System.out.println("______________________________");
        System.out.println("Agregar un dia");
        Daniel.cambiarDia();
        System.out.println("Hoy es: " + Daniel.getDiaMes());
        
    }
}
