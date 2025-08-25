package cl.duoc.miprimerproyecto;

public class Libro {
    
    //Atributos
    private String titulo;
    private String autor;
    private String genero;
    private String estado;
    private int codigo;
    private int anioPublicacion;
    
    //Metodos
    public void prestar(){
        
    }
    
    public String devolver(){
        String estadoDeDevolucion = "Se devolvio OK";
        return estadoDeDevolucion;
    }
    
    public int Suma(int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }
}
