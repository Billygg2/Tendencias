package com.tablas.pelicula.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
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

    // Getters and setters
    public Long getVentaID() {
        return ventaID;
    }

    public void setVentaID(Long ventaID) {
        this.ventaID = ventaID;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(Double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Set<DetalleVenta> getDetalleVentas() {
        return detalleVentas;
    }

    public void setDetalleVentas(Set<DetalleVenta> detalleVentas) {
        this.detalleVentas = detalleVentas;
    }
}
