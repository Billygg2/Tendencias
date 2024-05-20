package com.tablas.pelicula.repository;


import com.tablas.pelicula.entity.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Long> {
}
