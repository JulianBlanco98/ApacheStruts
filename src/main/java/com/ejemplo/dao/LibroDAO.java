package com.ejemplo.dao;

import com.ejemplo.model.Autor;
import com.ejemplo.model.Libro;
import org.apache.commons.dbcp2.BasicDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LibroDAO {

    private static final Logger logger = LoggerFactory.getLogger(LibroDAO.class);
    private static final BasicDataSource dataSource = new BasicDataSource();

    static {
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3307/biblioteca_db?useSSL=false&serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("JULI10messi");
    }

    public List<Libro> getLibros() {

        List<Libro> libros = new ArrayList<>();

        String sql = "SELECT l.*, a.nombre AS nombre_autor " +
                "FROM libro l " +
                "JOIN autor a ON l.autor_id = a.id";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet rs = statement.executeQuery()) {

            logger.info("Se conecta a la BD");
            logger.info("Se ejecuta la consulta");

            while (rs.next()){
                libros.add(buildLibro(rs));
            }

        } catch (SQLException e) {
            logger.error("Error en la consulta sql de getLibros: {}", e.getMessage());
            e.printStackTrace();
        }

        //logger.info("Libros recuperados: {}", libros);
        showLibros(libros);
        return libros;

    }

    private Libro buildLibro(ResultSet rs) throws SQLException {
        Autor autor = new Autor(rs.getInt("autor_id"), rs.getString("nombre_autor"));
        return new Libro(
                rs.getInt("id"),
                rs.getString("titulo"),
                rs.getString("isbn"),
                rs.getDate("fecha_publicacion"),
                rs.getString("genero"),
                rs.getInt("numero_paginas"),
                autor);

    }

    private void showLibros(List<Libro> libros) {

        for (Libro l: libros) {
            logger.info("Libro: {} \n", l);
        }

    }

}
