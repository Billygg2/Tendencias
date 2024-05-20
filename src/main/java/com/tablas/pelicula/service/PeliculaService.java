package com.tablas.pelicula.service;


import com.tablas.pelicula.entity.Pelicula;
import com.tablas.pelicula.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaService {

    @Autowired
    private PeliculaRepository peliculaRepository;

    public List<Pelicula> getAllPeliculas() {
        return peliculaRepository.findAll();
    }

    public Pelicula createPelicula(Pelicula pelicula) {
        return peliculaRepository.save(pelicula);
    }

    public Pelicula getPeliculaById(Long id) {
        return peliculaRepository.findById(id).orElseThrow(() -> new RuntimeException("Pelicula not found"));
    }

    public Pelicula updatePelicula(Long id, Pelicula peliculaDetails) {
        Pelicula pelicula = peliculaRepository.findById(id).orElseThrow(() -> new RuntimeException("Pelicula not found"));
        pelicula.setTitulo(peliculaDetails.getTitulo());
        pelicula.setDirector(peliculaDetails.getDirector());
        pelicula.setGenero(peliculaDetails.getGenero());
        pelicula.setFechaLanzamiento(peliculaDetails.getFechaLanzamiento());
        pelicula.setPrecio(peliculaDetails.getPrecio());
        pelicula.setStock(peliculaDetails.getStock());
        return peliculaRepository.save(pelicula);
    }

    public void deletePelicula(Long id) {
        Pelicula pelicula = peliculaRepository.findById(id).orElseThrow(() -> new RuntimeException("Pelicula not found"));
        peliculaRepository.delete(pelicula);
    }
}
