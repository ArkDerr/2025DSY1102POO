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
    public void registro(Usuario u) throws SQLException {

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

    // ----------------------
    // 2. LISTAR TODOS LOS USUARIOS
    // ----------------------
    public List<Usuario> listar() throws SQLException {
        List<Usuario> lista = new ArrayList<>();

        String sql = "SELECT * FROM usuario";

        try (Connection conn = ConexionBD.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Usuario u = new Usuario();
                u.setRut(rs.getString("rut"));
                u.setNombreCompleto(rs.getString("nombreCompleto"));
                u.setEmail(rs.getString("email"));
                u.setFono(rs.getString("fono"));
                u.setDireccion(rs.getString("direccion"));

                lista.add(u);
            }
        }
        return lista;
    }

    // ----------------------
    // 3. BUSCAR POR RUT
    // ----------------------
    public Usuario buscarPorRut(String rut) throws SQLException {
        String sql = "SELECT * FROM usuario WHERE rut = ?";

        try (Connection conn = ConexionBD.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, rut);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Usuario u = new Usuario();
                u.setRut(rs.getString("rut"));
                u.setNombreCompleto(rs.getString("nombreCompleto"));
                u.setEmail(rs.getString("email"));
                u.setFono(rs.getString("fono"));
                u.setDireccion(rs.getString("direccion"));
                return u;
            }
        }
        return null;
    }

    // ----------------------
    // 4. ACTUALIZAR USUARIO
    // ----------------------
    public void actualizar(Usuario u) throws SQLException {
        String sql = "UPDATE usuario SET nombreCompleto = ?, email = ?, fono = ?, direccion = ? "
                   + "WHERE rut = ?";

        try (Connection conn = ConexionBD.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, u.getNombreCompleto());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getFono());
            ps.setString(4, u.getDireccion());
            ps.setString(5, u.getRut());

            ps.executeUpdate();
        }
    }

    // ----------------------
    // 5. ELIMINAR USUARIO
    // ----------------------
    public void eliminar(String rut) throws SQLException {
        String sql = "DELETE FROM usuario WHERE rut = ?";

        try (Connection conn = ConexionBD.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, rut);
            ps.executeUpdate();
        }
    }
}

