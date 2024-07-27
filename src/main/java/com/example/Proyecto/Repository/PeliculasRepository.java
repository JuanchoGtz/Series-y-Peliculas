package com.example.Proyecto.Repository;

import com.example.Proyecto.entity.Peliculas;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculasRepository extends JpaRepository<Peliculas,Long> {
   List<Peliculas> findByPeliculaId(Long peliculaId);
    List<Peliculas> findAllByOrderByReproduccionesDesc();
    List<Peliculas> findByTituloContainingIgnoreCaseOrGeneroContainingIgnoreCase(String titulo, String genero);
}
