/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosemana14_1.model.service;

import com.mycompany.ejemplosemana14_1.model.dao.UsuarioDAO;
import com.mycompany.ejemplosemana14_1.model.dto.Usuario;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class UsuarioService {
    
    private final UsuarioDAO usuariodao = new UsuarioDAO();
    
    public void registarUsuario(Usuario u) throws Exception {
        if (u.getRut() == null || u.getRut().isBlank()) {
            throw new Exception("El RUT es Obligatorio");
        }
        
        usuariodao.registro(u);
    }
    
    public List<Usuario> ListarUsuario() throws Exception {
        return usuariodao.listar();
    }
    
    public Usuario buscarPorRut(String rut) throws Exception{
        if (rut == null || rut.isBlank()) {
            throw new Exception("El RUT es Obligatorio");
        }
        
        return usuariodao.buscarPorRut(rut);
    }
    
    public void editarUsuario(Usuario u) throws Exception{
        if (u.getNombreCompleto()== null || u.getNombreCompleto().isBlank()) {
            throw new Exception("El nombre es Obligatorio");
        }
        
        usuariodao.actualizar(u);
    }
    
    public void eliminarUsuario(String rut) throws Exception{
        usuariodao.eliminar(rut);
    }
    
}
