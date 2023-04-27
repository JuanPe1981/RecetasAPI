package com.sanvalero.recetas.service;

import com.sanvalero.recetas.domain.Usuario;

import java.util.List;

public interface UsuarioService {

    List<Usuario> verTodo();

    Usuario verUsuarioPorNombreUsuario (String nombreUsuario);

    Usuario crearUsuario (Usuario usuario);

    void borrarUsuario (String nombre_usuario);

    Usuario modificarUsuario (String nombre_usuario, Usuario usuarioModificado);
}
