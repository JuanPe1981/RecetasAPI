package com.sanvalero.recetas.repository;

import com.sanvalero.recetas.domain.Supermercado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupermercadoRepository extends CrudRepository<Supermercado, Long> {

    List<Supermercado> findAll();

    Supermercado findByNombre (String nombre);
}
