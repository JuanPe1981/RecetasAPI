package com.sanvalero.recetas.repository;

import com.sanvalero.recetas.domain.Receta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecetaRepository extends CrudRepository<Receta, Long> {

    List<Receta> findAll();

    Receta findByTitulo(String titulo);
}
