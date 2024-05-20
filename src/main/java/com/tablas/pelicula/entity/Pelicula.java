package com.tablas.pelicula.entity;


import jakarta.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long peliculaID;
    private String titulo;
    private String director;
    private String genero;
    private Date fechaLanzamiento;
    private Double precio;
    private Integer stock;

    @OneToMany(mappedBy = "pelicula")
    private Set<DetalleVenta> detalleVentas;

    // Getters and setters
    public Long getPeliculaID() {
        return peliculaID;
    }

    public void setPeliculaID(Long peliculaID) {
        this.peliculaID = peliculaID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Set<DetalleVenta> getDetalleVentas() {
        return detalleVentas;
    }

    public void setDetalleVentas(Set<DetalleVenta> detalleVentas) {
        this.detalleVentas = detalleVentas;
    }
}
