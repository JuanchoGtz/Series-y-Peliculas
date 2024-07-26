package com.example.Proyecto.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Tbl_series")
public class Series {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long serieId;
    private String titulo;
    private long ano_estreno;
    private long  episodios ;
    private String  protagonistas;
    private String   genero;
    private String    video_url;
    private long    reproducciones;
    private String     imagen_url ;
}
