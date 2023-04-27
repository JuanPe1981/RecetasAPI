package com.sanvalero.recetas.service;

import com.sanvalero.recetas.domain.Receta;

import java.util.List;

public interface RecetaService {

    List<Receta> verTodo();

    Receta verRecetaPorTitulo(String titulo);

    Receta crearReceta (Receta receta);

    void borrarReceta (String titulo);

    Receta modificarReceta (String titulo, Receta recetaModificada);
}
