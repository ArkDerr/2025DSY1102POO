/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosemana14_1.controller;

import com.mycompany.ejemplosemana14_1.model.dto.Usuario;
import com.mycompany.ejemplosemana14_1.model.service.UsuarioService;
import com.mycompany.ejemplosemana14_1.view.Menu;
import com.mycompany.ejemplosemana14_1.view.Registro;
import javax.swing.JOptionPane;

/**
 *
 * @author Cetecom
 */
public class RegistraController {
    private Registro vista;

    public RegistraController(Registro vista) {
        this.vista = vista;
        escucharEventos();
    }
    
    private void escucharEventos(){
        vista.btnVolver.addActionListener(e -> volver());
        vista.btnGuardar.addActionListener(e -> guardar());
    }
    
    private void volver(){
        Menu menu = new Menu();
        menu.setAlwaysOnTop(true);
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        MenuController menucontroller = new MenuController(menu);
        vista.dispose();
    }
    
    private void guardar(){
        String rut = vista.txtRut.getText();
        String nombre = vista.txtNombre.getText();
        String email = vista.txtEmail.getText();
        String fono = vista.txtFono.getText();
        String direccion = vista.txtDirecion.getText();
        
        Usuario usuario =  new Usuario(rut, nombre, email, fono, direccion);
        
        try {
            UsuarioService us = new UsuarioService();
            us.registarUsuario(usuario);
            JOptionPane.showMessageDialog(vista, "Usuario Registrado con Exito");
            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(vista, "Se produjo un error: " + e);
        }
    }
    
    public void limpiar(){
        vista.txtRut.setText(null);
        vista.txtNombre.setText(null);
        vista.txtEmail.setText(null);
        vista.txtFono.setText(null);
        vista.txtDirecion.setText(null);
    }
}
