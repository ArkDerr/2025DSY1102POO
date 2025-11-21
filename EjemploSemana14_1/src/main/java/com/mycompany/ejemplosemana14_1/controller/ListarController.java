/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosemana14_1.controller;

import com.mycompany.ejemplosemana14_1.view.Listar;
import com.mycompany.ejemplosemana14_1.view.Menu;

/**
 *
 * @author Cetecom
 */
public class ListarController {
    private Listar vista;

    public ListarController(Listar vista) {
        this.vista = vista;
        escucharEventos();
    }
    
    private void escucharEventos(){
        vista.btnVolver.addActionListener(e -> volver());
    }
    
    private void volver(){
        Menu menu = new Menu();
        menu.setAlwaysOnTop(true);
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        MenuController menucontroller = new MenuController(menu);
        vista.dispose();
    }
    
}
