package com.sanvalero.recetas.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUsuario;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String direccion;
    @Column
    private int telefono;
    @Column
    private String nombreUsuario;
    @Column
    private String password;
    @Column
    @NonNull
    private Boolean politicaPrivacidad;
}
