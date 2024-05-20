package com.tablas.pelicula.repository;


import com.tablas.pelicula.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
