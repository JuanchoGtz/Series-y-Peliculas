package com.example.Proyecto.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_peliculas")
public class Peliculas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long peliculaId;
    private String titulo;
    private long ano_estreno;
    private String  duracion_texto;
    private String  protagonistas;
    private String   genero;
    private String    video_url;
    private long    reproducciones;
    private String     imagen_url ;



}
