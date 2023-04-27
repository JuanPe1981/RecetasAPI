package com.sanvalero.recetas.controller;

import com.sanvalero.recetas.domain.Ingrediente;
import com.sanvalero.recetas.domain.Usuario;
import com.sanvalero.recetas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public ResponseEntity<List<Usuario>> verTodo () {
        return ResponseEntity.ok(usuarioService.verTodo());
    }

    @GetMapping("/usuario/{nombreUsuario}")
    public ResponseEntity<Usuario> verUsuarioPorNombreUsuario (@PathVariable String nombreUsuario) {
        Usuario usuario = usuarioService.verUsuarioPorNombreUsuario(nombreUsuario);
        return ResponseEntity.ok(usuario);
    }

    @PostMapping("/usuarios")
    public ResponseEntity<Usuario> crearUsuario (@RequestBody Usuario usuario) {
        Usuario nuevoUsuario = usuarioService.crearUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoUsuario);
    }

    @DeleteMapping("/usuario/{nombreUsuario}")
    public ResponseEntity<Void> borrarUsuario (@PathVariable String nombreUsuario) {
        usuarioService.borrarUsuario(nombreUsuario);
        return ResponseEntity.noContent().build();
    }


    @PutMapping("/usuario/{nombreUsuario}")
    public ResponseEntity<Usuario> modificarUsuario (@PathVariable String nombreUsuario, @RequestBody Usuario usuario) {
        Usuario usuarioModificado = usuarioService.modificarUsuario(nombreUsuario, usuario);
        return ResponseEntity.status(HttpStatus.OK).body(usuarioModificado);
    }
}
