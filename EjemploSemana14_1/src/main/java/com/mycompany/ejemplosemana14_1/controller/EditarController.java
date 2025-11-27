/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosemana14_1.controller;

import com.mycompany.ejemplosemana14_1.model.dto.Usuario;
import com.mycompany.ejemplosemana14_1.model.service.UsuarioService;
import com.mycompany.ejemplosemana14_1.view.Editar;
import com.mycompany.ejemplosemana14_1.view.Menu;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cetecom
 */
public class EditarController {

    private Editar vista;
    private UsuarioService us = new UsuarioService();

    public EditarController(Editar vista) {
        this.vista = vista;
        escucharEventos();
    }

    private void escucharEventos() {
        vista.btnVolver.addActionListener(e -> volver());
        vista.btnBuscar.addActionListener(e -> buscar());
        vista.btnEditar.addActionListener(e -> editar());
        vista.btnLimpiar.addActionListener(e -> limpiar());
    }

    private void volver() {
        Menu menu = new Menu();
        menu.setAlwaysOnTop(true);
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        MenuController menucontroller = new MenuController(menu);
        vista.dispose();
    }

    private void buscar() {
        String rut = vista.txtRut.getText().trim();

        if (rut.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Debe ingresar un rut para buscar");
            return;
        }

        try {
            Usuario u = us.buscarPorRut(rut);

            if (u != null) {
                vista.txtNombre.setText(u.getNombreCompleto());
                vista.txtEmail.setText(u.getEmail());
                vista.txtFono.setText(u.getFono());
                vista.txtDirecion.setText(u.getDireccion());
                vista.txtRut.setEditable(false);
                
            } else {
                JOptionPane.showMessageDialog(vista, "Usuario no encontrado");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(vista, "Usuario no encontrado" + e.getMessage());
        }
    }

    private void editar() {
        String rut = vista.txtRut.getText();
        String nombre = vista.txtNombre.getText();
        String email = vista.txtEmail.getText();
        String fono = vista.txtFono.getText();
        String direccion = vista.txtDirecion.getText();
        
        Usuario usuario =  new Usuario(rut, nombre, email, fono, direccion);
        
        try {
            UsuarioService us = new UsuarioService();
            us.editarUsuario(usuario);
            JOptionPane.showMessageDialog(vista, "Usuario Editado con Exito");
            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(vista, "Se produjo un error: " + e);
        }
    }

    private void limpiar() {
        vista.txtRut.setText(null);
        vista.txtNombre.setText(null);
        vista.txtEmail.setText(null);
        vista.txtFono.setText(null);
        vista.txtDirecion.setText(null);
        vista.txtRut.setEditable(true);
    }

}
