package com.example.Proyecto.service;

import com.example.Proyecto.Repository.SeriesRepository;
import com.example.Proyecto.entity.Series;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeriesService {
    @Autowired
    SeriesRepository seriesRepository;
    public List<Series> getSeries(){
        return seriesRepository.findAll();
    }
}
