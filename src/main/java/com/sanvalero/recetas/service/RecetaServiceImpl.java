package com.sanvalero.recetas.service;

import com.sanvalero.recetas.domain.Receta;
import com.sanvalero.recetas.repository.RecetaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecetaServiceImpl implements RecetaService {

    @Autowired
    private RecetaRepository recetaRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<Receta> verTodo() {
        return recetaRepository.findAll();
    }

    @Override
    public Receta verRecetaPorTitulo(String titulo) {
        return recetaRepository.findByTitulo(titulo);
    }

    @Override
    public Receta crearReceta(Receta receta) {
        return recetaRepository.save(receta);
    }

    @Override
    public void borrarReceta(String titulo) {
        Receta receta = recetaRepository.findByTitulo(titulo);
        recetaRepository.delete(receta);
    }

    @Override
    public Receta modificarReceta(String titulo, Receta recetaModificada) {
        Receta receta = recetaRepository.findByTitulo(titulo);
        receta.setTitulo(recetaModificada.getTitulo());
        receta.setDescripcion(recetaModificada.getDescripcion());
        receta.setIngredientes(recetaModificada.getIngredientes());
        return recetaRepository.save(receta);
    }
}
