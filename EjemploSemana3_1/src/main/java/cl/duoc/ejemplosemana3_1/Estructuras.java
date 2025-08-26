/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.ejemplosemana3_1;

/**
 *
 * @author Cetecom
 */
public class Estructuras {

    //IF-ELSE
    public void ejemploIfElse(int numero) {
        //int numero = 10;

        if (numero < 10) {
            System.out.println("El numero evaluado es menor a 10");
        } else if (numero > 10) {
            System.out.println("El numero evaluado es mayor a 10");
        } else {
            System.out.println("El numero evaluado es igual a 10");
        }
    }

    //SWITCH
    public void ejemploSwitch() {
        int dia = 4;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
    }
    
    //FOR
    public void ejemploFor(){
        for (int i = 1; i <= 50; i++){
            System.out.println("Numero i es igual a: " + i);
        }
    }
    
    //WHILE
    public void ejemploWhile(){
        int variableWhile = 11;
        
        while (variableWhile <= 10){
            System.out.println("Numero variableWhile es igual a: " + variableWhile);
            variableWhile++;
        }
    }
    
    //DO-WHILE
    
   public void ejemploDoWhile(){
       int variableDoWhile = 11;
       do {
           System.out.println("Numero variableDoWhile es igual a: " + variableDoWhile);
           variableDoWhile++;
       } while (variableDoWhile <= 10);
   }

}
