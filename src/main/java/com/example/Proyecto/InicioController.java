package com.example.Proyecto;

import com.example.Proyecto.Repository.PeliculasRepository;
import com.example.Proyecto.Repository.SeriesRepository;
import com.example.Proyecto.entity.Peliculas;
import com.example.Proyecto.entity.Series;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class InicioController {
    @Autowired
    private PeliculasRepository peliculasRepository;
    @Autowired
    private SeriesRepository seriesRepository;

    @GetMapping("/")
    public String inicio(Model model) {
        List<Peliculas> peliculas = getPeliculas();
        List<Series> series=getSeries();
        model.addAttribute("series",series);
        model.addAttribute("peliculas", peliculas);
        return "index";
    }

    private List<Series> getSeries() {
        return seriesRepository.findAll();
    }

    public List<Peliculas> getPeliculas() {
        return peliculasRepository.findAll();
    }


}
