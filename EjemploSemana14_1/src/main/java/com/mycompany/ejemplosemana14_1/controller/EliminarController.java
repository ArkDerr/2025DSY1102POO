/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosemana14_1.controller;

import com.mycompany.ejemplosemana14_1.model.dto.Usuario;
import com.mycompany.ejemplosemana14_1.model.service.UsuarioService;
import com.mycompany.ejemplosemana14_1.view.Eliminar;
import com.mycompany.ejemplosemana14_1.view.Menu;
import javax.swing.JOptionPane;

/**
 *
 * @author Cetecom
 */
public class EliminarController {
    private Eliminar vista;
    private UsuarioService us = new UsuarioService();

    public EliminarController(Eliminar vista) {
        this.vista = vista;
        escucharEventos();
    }
    
    private void escucharEventos() {
        vista.btnVolver.addActionListener(e -> volver());
        vista.btnBuscar.addActionListener(e -> buscar());
        vista.btnElimnar.addActionListener(e -> eliminar());
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
                //vista.txtRut.setEditable(false);
                
            } else {
                JOptionPane.showMessageDialog(vista, "Usuario no encontrado");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(vista, "Usuario no encontrado" + e.getMessage());
        }
    }

    private void eliminar() {
        String rut = vista.txtRut.getText().trim();

        if (rut.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Debe ingresar un rut para buscar");
            return;
        }
        
        int option = JOptionPane.showConfirmDialog(
                vista, 
                "Esta seguro de eliminar el usuario con rut " + rut,
                "¿Esta Seguro?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        
        if (option == JOptionPane.YES_OPTION) {
            try {
                us.eliminarUsuario(rut);
                JOptionPane.showMessageDialog(vista, "Usuario Eliminado");
                limpiar();
            } catch (Exception e) {
               JOptionPane.showMessageDialog(vista, "No fue posible eliminar el usuario"); 
            }
            
        } else {
            JOptionPane.showMessageDialog(vista, "Operacion cancelada"); 
             limpiar();
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
