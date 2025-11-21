package com.mycompany.ejemplosemana14_1.model.dao;

import com.mycompany.ejemplosemana14_1.model.bd.ConexionBD;
import com.mycompany.ejemplosemana14_1.model.dto.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    // ----------------------
    // 1. REGISTRAR USUARIO
    // ----------------------
    public void registrar(Usuario u) throws SQLException {

        String sql = "INSERT INTO usuario (rut, nombreCompleto, email, fono, direccion) "
                   + "VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConexionBD.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, u.getRut());
            ps.setString(2, u.getNombreCompleto());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getFono());
            ps.setString(5, u.getDireccion());

            ps.executeUpdate();
        }
    }

}

