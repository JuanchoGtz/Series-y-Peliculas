package com.example.Proyecto.Repository;

import com.example.Proyecto.entity.Series;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesRepository extends JpaRepository<Series,Long> {
}
