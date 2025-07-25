package com.ejemplo.action;

import com.ejemplo.dao.LibroDAO;
import com.ejemplo.model.Libro;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class LibroAction {

    private static final Logger logger = LoggerFactory.getLogger(LibroAction.class);
    private List<Libro> libros;

    public LibroAction() {
        logger.info("LibroAction creado");
    }

    public String execute() {
        logger.info("Entrando a LibroAction...");
        libros = new LibroDAO().getLibros();
        logger.info("Libros recuperados: {}", libros);
        return "success";
    }

    public List<Libro> getLibros() {
        return libros;
    }
}
