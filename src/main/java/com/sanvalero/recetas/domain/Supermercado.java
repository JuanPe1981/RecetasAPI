package com.sanvalero.recetas.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "supermercados")
public class Supermercado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSupermercado;
    @Column
    private String nombre;
    @Column
    private String cadena;
    @Column
    private String direccion;
    @Column
    private int codigoPostal;
    @Column
    private String localidad;
    @Column
    private double latitud;
    @Column
    private double longitud;

}
