package com.sanvalero.recetas.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "ingrediente")
public class Ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idIngrediente;
    @Column
    private String nombre;
    @Column
    private int cantidad;
    @Column
    private String tipoUnidad;
    @Column
    private boolean comprado;
    @Column
    private String tipoAlimento;
}
