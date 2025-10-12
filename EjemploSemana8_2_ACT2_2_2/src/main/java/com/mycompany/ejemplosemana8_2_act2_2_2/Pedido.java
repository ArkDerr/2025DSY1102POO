/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosemana8_2_act2_2_2;

import java.util.List;

/**
 *
 * @author arkder
 */
public class Pedido {
    private int numeroPedido;
    private Cliente cliente;
    private List detallePedido;
    private double totalPedido;

    public Pedido(int numeroPedido, Cliente cliente, List detallePedido, double totalPedido) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.detallePedido = detallePedido;
        this.totalPedido = totalPedido;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List getDetallePedido() {
        return detallePedido;
    }

    public void setDetallePedido(List detallePedido) {
        this.detallePedido = detallePedido;
    }

    public double getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(double totalPedido) {
        this.totalPedido = totalPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" + "numeroPedido=" + numeroPedido + ", cliente=" + cliente + ", detallePedido=" + detallePedido + ", totalPedido=" + totalPedido + '}';
    }
    
}
