package com.sanvalero.recetas.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "receta")
public class Receta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReceta;
    @Column
    private String titulo;
    @Column
    private String description;
    @Column
    private String ingredientes;
}
