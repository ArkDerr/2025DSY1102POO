/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cl.duoc.ejemplosemana3_2;

/**
 *
 * @author Cetecom
 */
public class EjemploSemana3_2 {

    public static void main(String[] args) {
        

    String variable = "Daniel";
    int anio = 2025;
    
    Persona personaAlumno1 = new Persona("Alan Brito", 25, "Informatica");
    Persona personaAlumno2 = new Persona("Maria Dolores", 30, "Informatica");
    Persona personaAlumno3 = new Persona("Juan Cea", 20, "Mecanica");
    Persona personaAlumno4 = new Persona("Cecilia Ramirez", 19, "Informatica");
    Persona personaAlumno5 = new Persona("Armando Casas", 25, "Turismo");
    
    personaAlumno5.setNombreCompleto("Armando Iglesias");
     
        System.out.println(personaAlumno1.toString());
        System.out.println(personaAlumno2.toString());
        System.out.println(personaAlumno3.toString());
        System.out.println(personaAlumno4.toString());
        System.out.println(personaAlumno5.toString());
        
    System.out.println(personaAlumno1.getNombreCompleto().length());
    
    System.out.println(personaAlumno1.getNombreCompleto().charAt(7));
    
    String Variable1 = personaAlumno1.getCarrera().toUpperCase();
    String Variable2 = personaAlumno1.getCarrera().toLowerCase();
    
    System.out.println(Variable1);
    System.out.println(Variable2);
            
        if (personaAlumno1.getCarrera().toUpperCase().equals("INFORMATICA")) {
            System.out.println("Si la persona pertenece a informatica");
        } else {
            System.out.println("Si la persona NO pertenece a informatica");
        }
    
        if (personaAlumno1.getCarrera().equalsIgnoreCase("INFORMATICA")) {
            System.out.println("Si la persona pertenece a informatica");
        } else {
            System.out.println("Si la persona NO pertenece a informatica");
        }
    
        if (personaAlumno1.getCarrera().startsWith("I")) {
            System.out.println("Si parte con I");
        } else {
            System.out.println("No parte con I");
        }
    
        if (personaAlumno1.getCarrera().endsWith("A")) {
            System.out.println("Si termina con A");
        } else {
            System.out.println("No termina con A");
        }
        
        System.out.println(personaAlumno1.getNombreCompleto().substring(2, 8));
    
        String conEspacio = "       Esto es una prueba";
        String conEspacio1 = "       Esto es una prueba2      ";
        
        System.out.println(conEspacio);
        System.out.println(conEspacio.trim());
        System.out.println(conEspacio1+conEspacio.trim());
        System.out.println(conEspacio1.trim()+conEspacio.trim());
                
        
    }
}
