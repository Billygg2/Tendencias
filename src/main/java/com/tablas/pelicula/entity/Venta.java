package com.tablas.pelicula.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Data
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ventaID;
    private Date fechaVenta;
    private Double totalVenta;

    @ManyToOne
    @JoinColumn(name = "clienteID")
    private Cliente cliente;

    @OneToMany(mappedBy = "venta")
    private Set<DetalleVenta> detalleVentas;
    
}
