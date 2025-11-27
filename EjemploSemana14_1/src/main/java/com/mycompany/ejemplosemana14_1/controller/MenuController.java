/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosemana14_1.controller;

import com.mycompany.ejemplosemana14_1.view.Editar;
import com.mycompany.ejemplosemana14_1.view.Eliminar;
import com.mycompany.ejemplosemana14_1.view.Listar;
import com.mycompany.ejemplosemana14_1.view.Menu;
import com.mycompany.ejemplosemana14_1.view.Registro;

/**
 *
 * @author Cetecom
 */
public class MenuController {
    private Menu vista;

    public MenuController(Menu vista) {
        this.vista = vista;
        escucharEventos();
    }
    
    private void escucharEventos(){
        vista.btnRegistrar.addActionListener(e -> abrirRegistro());
        vista.btnListar.addActionListener(e -> abrirBusqueda());
        vista.btnEditar.addActionListener(e -> abrirEditar());
        vista.btnEleminar.addActionListener(e -> abrirEliminar());
    }
    
    private void abrirRegistro(){
        Registro registro = new Registro();
        registro.setAlwaysOnTop(true);
        registro.setLocationRelativeTo(null);
        registro.setVisible(true);
        RegistraController rc = new RegistraController(registro);
        vista.dispose();
    }
    
    private void abrirBusqueda(){
        Listar listar = new Listar();
        listar.setAlwaysOnTop(true);
        listar.setLocationRelativeTo(null);
        listar.setVisible(true);
        ListarController lc = new ListarController(listar);
        vista.dispose();
    }    

    private void abrirEditar() {
        Editar editar = new Editar();
        editar.setAlwaysOnTop(true);
        editar.setLocationRelativeTo(null);
        editar.setVisible(true);
        EditarController ec = new EditarController(editar);
        vista.dispose();
    }

    private void abrirEliminar() {
        Eliminar eliminar = new Eliminar();
        eliminar.setAlwaysOnTop(true);
        eliminar.setLocationRelativeTo(null);
        eliminar.setVisible(true);
        EliminarController ec = new EliminarController(eliminar);
        vista.dispose();
    }
}
