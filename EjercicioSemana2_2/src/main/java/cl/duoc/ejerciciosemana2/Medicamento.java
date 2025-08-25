/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.ejerciciosemana2;

/**
 *
 * @author Cetecom
 */
public class Medicamento {
    
    private String codigo;
    private String nombreMedicamento;
    private String tipo;
    private int stock;
    private String caducidad;

    public Medicamento() {
    }
    
    public Medicamento(String codigo, String nombre, String tipo, int stock, String caducidad) {
        this.codigo = codigo;
        this.nombreMedicamento = nombre;
        this.tipo = tipo;
        this.stock = stock;
        this.caducidad = caducidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombreMedicamento;
    }

    public void setNombre(String nombre) {
        this.nombreMedicamento = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    
    
    
}
