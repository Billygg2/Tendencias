package com.tablas.pelicula.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Data
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

}
