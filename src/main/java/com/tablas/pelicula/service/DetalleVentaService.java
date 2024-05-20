package com.tablas.pelicula.service;


import com.tablas.pelicula.entity.DetalleVenta;
import com.tablas.pelicula.repository.DetalleVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleVentaService {

    @Autowired
    private DetalleVentaRepository detalleVentaRepository;

    public List<DetalleVenta> getAllDetalleVentas() {
        return detalleVentaRepository.findAll();
    }

    public DetalleVenta createDetalleVenta(DetalleVenta detalleVenta) {
        return detalleVentaRepository.save(detalleVenta);
    }

    public DetalleVenta getDetalleVentaById(Long id) {
        return detalleVentaRepository.findById(id).orElseThrow(() -> new RuntimeException("DetalleVenta not found"));
    }

    public DetalleVenta updateDetalleVenta(Long id, DetalleVenta detalleVentaDetails) {
        DetalleVenta detalleVenta = detalleVentaRepository.findById(id).orElseThrow(() -> new RuntimeException("DetalleVenta not found"));
        detalleVenta.setCantidad(detalleVentaDetails.getCantidad());
        detalleVenta.setPrecioUnitario(detalleVentaDetails.getPrecioUnitario());
        detalleVenta.setVenta(detalleVentaDetails.getVenta());
        detalleVenta.setPelicula(detalleVentaDetails.getPelicula());
        return detalleVentaRepository.save(detalleVenta);
    }

    public void deleteDetalleVenta(Long id) {
        DetalleVenta detalleVenta = detalleVentaRepository.findById(id).orElseThrow(() -> new RuntimeException("DetalleVenta not found"));
        detalleVentaRepository.delete(detalleVenta);
    }
}