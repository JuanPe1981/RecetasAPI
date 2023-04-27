package com.sanvalero.recetas.controller;

import com.sanvalero.recetas.domain.Receta;
import com.sanvalero.recetas.service.RecetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecetaController {

    @Autowired
    private RecetaService recetaService;

    @GetMapping("/recetas")
    public ResponseEntity<List<Receta>> verTodo () {
        return ResponseEntity.ok(recetaService.verTodo());
    }

    @GetMapping("/receta/{titulo}")
    public ResponseEntity<Receta> verIngredientePorTitulo (@PathVariable String titulo) {
        Receta receta = recetaService.verRecetaPorTitulo(titulo);
        return ResponseEntity.ok(receta);
    }

    @PostMapping("/recetas")
    public ResponseEntity<Receta> crearReceta (@RequestBody Receta receta) {
        Receta nuevaReceta = recetaService.crearReceta(receta);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevaReceta);
    }

    @DeleteMapping("/receta/{titulo}")
    public ResponseEntity<Void> borrarReceta (@PathVariable String titulo) {
        recetaService.borrarReceta(titulo);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/receta/{titulo}")
    public ResponseEntity<Receta> modificarReceta (@PathVariable String titulo, @RequestBody Receta receta) {
        Receta ingredienteModificado = recetaService.modificarReceta(titulo, receta);
        return ResponseEntity.status(HttpStatus.OK).body(ingredienteModificado);
    }
}
