package com.tablas.pelicula.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clienteID;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;
    private Date fechaRegistro;

    @OneToMany(mappedBy = "cliente")
    private Set<Venta> ventas;

    
}
