package com.sanvalero.recetas.repository;

import com.sanvalero.recetas.domain.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    List<Usuario> findAll();

    Usuario findByNombreUsuario(String nombre_usuario);
}
