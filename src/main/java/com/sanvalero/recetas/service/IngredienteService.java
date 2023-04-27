package com.sanvalero.recetas.service;

import com.sanvalero.recetas.domain.Ingrediente;

import java.util.List;

public interface IngredienteService {

    List<Ingrediente> verTodo();

    Ingrediente verIngredientePorNombre(String nombre);

    Ingrediente crearIngrediente (Ingrediente ingrediente);

    void borrarIngrediente (String nombre);

    Ingrediente modificarIngrediente(String nombre, Ingrediente ingredienteModificado);

}
