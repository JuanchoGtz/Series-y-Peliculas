package com.example.Proyecto.service;

import com.example.Proyecto.Repository.PeliculasRepository;
import com.example.Proyecto.entity.Peliculas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculasService {
    @Autowired
    PeliculasRepository peliculasRepository;
    public List<Peliculas> getPeliculas(){
        return peliculasRepository.findAll();
    }
}
