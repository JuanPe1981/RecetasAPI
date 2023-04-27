package com.sanvalero.recetas.repository;

import com.sanvalero.recetas.domain.Ingrediente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredienteRepository extends CrudRepository<Ingrediente, Long> {

    List<Ingrediente> findAll();
    Ingrediente findByNombre(String nombre);

}
