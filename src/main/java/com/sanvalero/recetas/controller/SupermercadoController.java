package com.sanvalero.recetas.controller;

import com.sanvalero.recetas.domain.Ingrediente;
import com.sanvalero.recetas.domain.Supermercado;
import com.sanvalero.recetas.service.SupermercadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SupermercadoController {

    @Autowired
    private SupermercadoService supermercadoService;

    @GetMapping("/supermercados")
    public ResponseEntity<List<Supermercado>> verTodo () {
        return ResponseEntity.ok(supermercadoService.verTodo());
    }

    @GetMapping("/supermercado/{nombre}")
    public ResponseEntity<Supermercado> verSupermercadoPorNombre (@PathVariable String nombre) {
        Supermercado supermercado = supermercadoService.verSupermercadoPorNombre(nombre);
        return ResponseEntity.ok(supermercado);
    }

    @PostMapping("/supermercados")
    public ResponseEntity<Supermercado> crearIngrediente (@RequestBody Supermercado supermercado) {
        Supermercado nuevoSupermercado = supermercadoService.crearSupermercado(supermercado);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoSupermercado);
    }

    @DeleteMapping("/supermercado/{nombre}")
    public ResponseEntity<Void> borrarSupermercado (@PathVariable String nombre) {
        supermercadoService.borrarSupermercado(nombre);
        return ResponseEntity.noContent().build();
    }


    @PutMapping("/supermercado/{nombre}")
    public ResponseEntity<Supermercado> modificarSupermercado (@PathVariable String nombre, @RequestBody Supermercado supermercado) {
        Supermercado supermercadoModificado = supermercadoService.modificarSupermercado(nombre, supermercado);
        return ResponseEntity.status(HttpStatus.OK).body(supermercadoModificado);
    }
}
