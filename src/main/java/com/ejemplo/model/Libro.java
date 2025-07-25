package com.ejemplo.model;

import java.util.Date;

public class Libro {

    private int id;
    private String titulo;
    private String isbn;
    private Date fechaPublicacion;
    private String genero;
    private int numeroPaginas;
    private Autor autor;

    public Libro() {

    }

    public Libro(int id, String titulo, String isbn, Date fechaPublicacion, String genero, int numeroPaginas, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.fechaPublicacion = fechaPublicacion;
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", fechaPublicacion=" + fechaPublicacion +
                ", genero='" + genero + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", autor=" + autor.getNombre() +
                '}';
    }
}
