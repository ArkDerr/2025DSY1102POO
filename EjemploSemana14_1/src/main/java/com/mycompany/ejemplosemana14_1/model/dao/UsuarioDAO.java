/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosemana14_1.model.dao;

import java.sql.Connection;
import com.mycompany.ejemplosemana14_1.model.bd.ConexionBD;
import com.mycompany.ejemplosemana14_1.model.dto.Usuario;
import java.sql.PreparedStatement;

/**
 *
 * @author Cetecom
 */
public class UsuarioDAO {
    public void registro (Usuario u) throws Exception {
        
        String sql = "INSERT INTO usuario (rut,nombrecompleto,email,fono,direccion) "
                + "VALUES (?,?,?,?,?)";
        
        try (Connection conn = ConexionBD.getConnection();
               PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, u.getRut());
            ps.setString(2, u.getNombreCompleto());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getFono());
            ps.setString(5, u.getDireccion());
            
            ps.executeUpdate();
        }
             
    }
}
