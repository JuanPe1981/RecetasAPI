package com.sanvalero.recetas.controller;

import com.sanvalero.recetas.domain.Ingrediente;
import com.sanvalero.recetas.service.IngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IngredienteController {

    @Autowired
    private IngredienteService ingredienteService;

    @GetMapping("/ingredientes")
    public ResponseEntity<List<Ingrediente>> verTodo () {
        return ResponseEntity.ok(ingredienteService.verTodo());
    }

    @GetMapping("/ingrediente/{nombre}")
    public ResponseEntity<Ingrediente> verIngredientePorNombre (@PathVariable String nombre) {
        Ingrediente ingrediente = ingredienteService.verIngredientePorNombre(nombre);
        return ResponseEntity.ok(ingrediente);
    }

    @PostMapping("/ingredientes")
    public ResponseEntity<Ingrediente> crearIngrediente (@RequestBody Ingrediente ingrediente) {
        Ingrediente nuevoIngrediente = ingredienteService.crearIngrediente(ingrediente);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoIngrediente);
    }

    @DeleteMapping("/ingrediente/{nombre}")
    public ResponseEntity<Void> borrarIngrediente (@PathVariable String nombre) {
        ingredienteService.borrarIngrediente(nombre);
        return ResponseEntity.noContent().build();
    }


    @PutMapping("/ingrediente/{nombre}")
    public ResponseEntity<Ingrediente> modificarIngrediente (@PathVariable String nombre, @RequestBody Ingrediente ingrediente) {
        Ingrediente ingredienteModificado = ingredienteService.modificarIngrediente(nombre, ingrediente);
        return ResponseEntity.status(HttpStatus.OK).body(ingredienteModificado);
    }
}
