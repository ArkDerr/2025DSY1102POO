/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cl.duoc.miprimerproyecto;

/**
 *
 * @author Cetecom
 */
public class MiPrimerProyecto {

public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        Auto auto1 = new Auto();
        Auto auto2 = new Auto("Rojo", 5);
        
        //System.out.println(auto1.getColor());
        System.out.println(auto2.getColor());
        
        auto1.setColor("verde");
        
        System.out.println(auto1.getColor());
        
    }
}
