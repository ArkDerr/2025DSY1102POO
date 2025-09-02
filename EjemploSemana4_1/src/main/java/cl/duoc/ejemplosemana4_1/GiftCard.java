/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.ejemplosemana4_1;

import java.time.LocalDate;

/**
 *
 * @author Cetecom
 */
public class GiftCard {
    private int numeroTarjeta;
    private int saldoTarjeta;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;
    private String estadoTarjeta;

    public GiftCard() {
    }

    public GiftCard(int numeroTarjeta, int saldoTarjeta, LocalDate fechaEmision, LocalDate fechaVencimiento, String estadoTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
        this.saldoTarjeta = saldoTarjeta;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.estadoTarjeta = estadoTarjeta;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getSaldoTarjeta() {
        return saldoTarjeta;
    }

    public void setSaldoTarjeta(int saldoTarjeta) {
        this.saldoTarjeta = saldoTarjeta;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getEstadoTarjeta() {
        return estadoTarjeta;
    }

    public void setEstadoTarjeta(String estadoTarjeta) {
        this.estadoTarjeta = estadoTarjeta;
    }

    @Override
    public String toString() {
        return "GifCard{" + "numeroTarjeta=" + numeroTarjeta + ", saldoTarjeta=" + saldoTarjeta + ", fechaEmision=" + fechaEmision + ", fechaVencimiento=" + fechaVencimiento + ", estadoTarjeta=" + estadoTarjeta + '}';
    }
    
}
