package com.example.Proyecto.Repository;


import com.example.Proyecto.entity.Series;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesRepository extends JpaRepository<Series,Long> {
    List<Series> findBySerieId(Long serieId);
    List<Series> findAllByOrderByReproduccionesDesc();
    List<Series> findByTituloContainingIgnoreCaseOrGeneroContainingIgnoreCase(String titulo, String genero);
}
