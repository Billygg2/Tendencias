package com.tablas.pelicula.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long detalleID;
    private Integer cantidad;
    private Double precioUnitario;

    @ManyToOne
    @JoinColumn(name = "ventaID")
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "peliculaID")
    private Pelicula pelicula;
}
