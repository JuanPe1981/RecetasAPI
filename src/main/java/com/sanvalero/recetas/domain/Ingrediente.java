package com.sanvalero.recetas.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "ingredientes")
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
    @NonNull
    private Boolean comprado;
    @Column
    private String tipoAlimento;
}
