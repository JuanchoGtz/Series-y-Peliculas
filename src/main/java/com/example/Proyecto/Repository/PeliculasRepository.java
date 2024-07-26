package com.example.Proyecto.Repository;

import com.example.Proyecto.entity.Peliculas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculasRepository extends JpaRepository<Peliculas,Long> {
}
