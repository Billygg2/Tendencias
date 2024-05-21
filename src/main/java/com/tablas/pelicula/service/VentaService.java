package com.tablas.pelicula.service;


import com.tablas.pelicula.entity.Venta;
import com.tablas.pelicula.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    public List<Venta> getAllVentas() {
        return ventaRepository.findAll();
    }

    public Venta createVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    public Venta getVentaById(Long id) {
        return ventaRepository.findById(id).orElseThrow(() -> new RuntimeException("Venta no encontrado"));
    }

    public Venta updateVenta(Long id, Venta ventaDetails) {
        Venta venta = ventaRepository.findById(id).orElseThrow(() -> new RuntimeException("Venta no encontrado"));
        venta.setFechaVenta(ventaDetails.getFechaVenta());
        venta.setTotalVenta(ventaDetails.getTotalVenta());
        venta.setCliente(ventaDetails.getCliente());
        return ventaRepository.save(venta);
    }

    public void deleteVenta(Long id) {
        Venta venta = ventaRepository.findById(id).orElseThrow(() -> new RuntimeException("Venta no encontrado"));
        ventaRepository.delete(venta);
    }
}
