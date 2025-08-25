
package cl.duoc.miprimerproyecto;


public class Auto {
    
    //Atributos
   private String color;
   private int numeroPuertas;

    public Auto(String color, int numeroPuertas) {
        this.color = color;
        this.numeroPuertas = numeroPuertas;
    }

    public Auto() {
    }   

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
   
   
   
}
