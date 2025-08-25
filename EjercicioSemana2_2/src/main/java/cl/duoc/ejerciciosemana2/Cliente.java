/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.ejerciciosemana2;

/**
 *
 * @author Cetecom
 */
public class Cliente {
    
    private String numeroCliente;
    private String nombreCliente;
    private String medicamentoAdquirido;

    public Cliente() {
    }

    public Cliente(String numeroCliente, String nombreCliente, String medicamentoAdquirido) {
        this.numeroCliente = numeroCliente;
        this.nombreCliente = nombreCliente;
        this.medicamentoAdquirido = medicamentoAdquirido;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getMedicamentoAdquirido() {
        return medicamentoAdquirido;
    }

    public void setMedicamentoAdquirido(String medicamentoAdquirido) {
        this.medicamentoAdquirido = medicamentoAdquirido;
    }
    
    public void realizarVenta(String codigo, String nombreMedicamento, String tipo, int stock, String caducidad, Medicamento medicamentoVendido){
        medicamentoVendido.setCodigo(codigo);
        medicamentoVendido.setStock(stock);
        medicamentoVendido.setTipo(tipo);
        medicamentoVendido.setNombre(nombreMedicamento);
        medicamentoVendido.setCaducidad(caducidad);
    }
    
    
}
