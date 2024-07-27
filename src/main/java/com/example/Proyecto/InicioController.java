package com.example.Proyecto;

import com.example.Proyecto.Repository.PeliculasRepository;
import com.example.Proyecto.Repository.SeriesRepository;
import com.example.Proyecto.entity.Peliculas;
import com.example.Proyecto.entity.Series;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class InicioController {
    @Autowired
    private PeliculasRepository peliculasRepository;
    @Autowired
    private SeriesRepository seriesRepository;

    
    @GetMapping("/")
    public String inicio(@RequestParam(value = "search", required = false) String search, Model model) {
        List<Peliculas> peliculas;
        List<Series> series;

        if (search != null && !search.isEmpty()) {
            peliculas = peliculasRepository.findByTituloContainingIgnoreCaseOrGeneroContainingIgnoreCase(search, search);
            series = seriesRepository.findByTituloContainingIgnoreCaseOrGeneroContainingIgnoreCase(search, search);
        } else {
            peliculas = peliculasRepository.findAllByOrderByReproduccionesDesc();
            series = seriesRepository.findAllByOrderByReproduccionesDesc();
        }

        model.addAttribute("series", series);
        model.addAttribute("peliculas", peliculas);
        return "index";
    }
    @GetMapping("/Peliculas")
    public String peliculas(@RequestParam(value = "search", required = false) String search, Model model) {
        List<Peliculas> peliculas;
        

        if (search != null && !search.isEmpty()) {
            peliculas = peliculasRepository.findByTituloContainingIgnoreCaseOrGeneroContainingIgnoreCase(search, search); 
        } else {
            peliculas = peliculasRepository.findAll();
        }

       
        model.addAttribute("peliculas", peliculas);
        return "peliculas";
    }
    @GetMapping("/Series")
    public String series(@RequestParam(value = "search", required = false) String search, Model model) {
        List<Series> series;
        if (search != null && !search.isEmpty()) {
            series = seriesRepository.findByTituloContainingIgnoreCaseOrGeneroContainingIgnoreCase(search, search); 
        } else {
            series = seriesRepository.findAll();
        }
        model.addAttribute("series", series);
        return "series";
    }

    @GetMapping("/Individualpeliculas/{id}")
    public String individualPeliculas(@PathVariable("id") Long id, Model model) {
        List<Peliculas> peliculas = peliculasRepository.findByPeliculaId(id);
        if (!peliculas.isEmpty()) {
            Peliculas pelicula = peliculas.get(0);
            model.addAttribute("pelicula", pelicula);
            return "individualpeliculas";
        }
        return "redirect:/";
    }
    
    @GetMapping("/Individualseries/{id}")
    public String individualSeries(@PathVariable("id") Long id, Model model) {
        List<Series> series = seriesRepository.findBySerieId(id);
        if (!series.isEmpty()) {
            Series serie = series.get(0);
            model.addAttribute("serie", serie);
            return "individualseries";
        }
        return "redirect:/";
    }
       
 


}
