/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosemana14_1.controller;

import com.mycompany.ejemplosemana14_1.model.dto.Usuario;
import com.mycompany.ejemplosemana14_1.model.service.UsuarioService;
import com.mycompany.ejemplosemana14_1.view.Listar;
import com.mycompany.ejemplosemana14_1.view.Menu;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cetecom
 */
public class ListarController {
    private Listar vista;
    private UsuarioService us = new UsuarioService();

    public ListarController(Listar vista) {
        this.vista = vista;
        escucharEventos();
        cargarTabla();
    }
    
    private void escucharEventos(){
        vista.btnVolver.addActionListener(e -> volver());
        vista.btnRefrescar.addActionListener(e -> refrescar());
        vista.btnBuscar.addActionListener(e -> buscar());
        vista.btnBuscar.addActionListener(e -> buscar());
    }
    
    private void volver(){
        Menu menu = new Menu();
        menu.setAlwaysOnTop(true);
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        MenuController menucontroller = new MenuController(menu);
        vista.dispose();
    }
    
    private void cargarTabla(){
        String[] columnas = {"rut","nombre","email","fono","direccion"};
        DefaultTableModel modelo = new DefaultTableModel(columnas,0);
        try {
            List<Usuario> listaUsuarios = us.ListarUsuario();
            for (Usuario u : listaUsuarios) {
                Object[] fila = {
                    u.getRut(),
                    u.getNombreCompleto(),
                    u.getEmail(),
                    u.getFono(),
                    u.getDireccion()
                };
                modelo.addRow(fila);
                vista.jtbLista.setModel(modelo);
            }
        } catch (Exception e) {
        }
    }    

    private void refrescar() {
        cargarTabla();
    }

    private void buscar() {
        String rut = vista.txtRut.getText().trim();
        
        if (rut.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Debe ingresar un rut para buscar");
            return;
        }
        
        try {
            Usuario u = us.buscarPorRut(rut);
            String[] columnas = {"rut","nombre","email","fono","direccion"};
            DefaultTableModel modelo = new DefaultTableModel(columnas,0);
            
            if (u != null) {
                modelo.addRow(new Object[]{
                    u.getRut(),
                    u.getNombreCompleto(),
                    u.getEmail(),
                    u.getFono(),
                    u.getDireccion() 
                });
                vista.jtbLista.setModel(modelo);
            } else {
                JOptionPane.showMessageDialog(vista, "Usuario no encontrado");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(vista, "Usuario no encontrado" + e.getMessage());
        }
        
        
        
    }
}
