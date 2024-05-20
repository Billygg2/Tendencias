package com.tablas.pelicula.controller;


import com.tablas.pelicula.entity.DetalleVenta;
import com.tablas.pelicula.service.DetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detalleventas")
public class DetalleVentaController {

    @Autowired
    private DetalleVentaService detalleVentaService;

    @GetMapping
    public List<DetalleVenta> getAllDetalleVentas() {
        return detalleVentaService.getAllDetalleVentas();
    }

    @PostMapping
    public DetalleVenta createDetalleVenta(@RequestBody DetalleVenta detalleVenta) {
        return detalleVentaService.createDetalleVenta(detalleVenta);
    }

    @GetMapping("/{id}")
    public DetalleVenta getDetalleVentaById(@PathVariable Long id) {
        return detalleVentaService.getDetalleVentaById(id);
    }

    @PutMapping("/{id}")
    public DetalleVenta updateDetalleVenta(@PathVariable Long id, @RequestBody DetalleVenta detalleVentaDetails) {
        return detalleVentaService.updateDetalleVenta(id, detalleVentaDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDetalleVenta(@PathVariable Long id) {
        detalleVentaService.deleteDetalleVenta(id);
        return ResponseEntity.noContent().build();
    }
}
