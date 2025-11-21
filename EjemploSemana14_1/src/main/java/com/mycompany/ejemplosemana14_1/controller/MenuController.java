/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosemana14_1.controller;

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
}
