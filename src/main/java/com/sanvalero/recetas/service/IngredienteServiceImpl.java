package com.sanvalero.recetas.service;

import com.sanvalero.recetas.domain.Ingrediente;
import com.sanvalero.recetas.repository.IngredienteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredienteServiceImpl implements IngredienteService {

    @Autowired
    private IngredienteRepository ingredienteRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<Ingrediente> verTodo() {
        return ingredienteRepository.findAll();
    }

    @Override
    public Ingrediente verIngredientePorNombre(String nombre) {
        return ingredienteRepository.findByNombre(nombre);
    }

    @Override
    public Ingrediente crearIngrediente(Ingrediente ingrediente) {
        return ingredienteRepository.save(ingrediente);
    }

    @Override
    public void borrarIngrediente(String nombre) {
        Ingrediente ingrediente = ingredienteRepository.findByNombre(nombre);
        ingredienteRepository.delete(ingrediente);
    }

    @Override
    public Ingrediente modificarIngrediente(String nombre, Ingrediente ingredienteModificado) {
        Ingrediente ingrediente = ingredienteRepository.findByNombre(nombre);
        ingrediente.setNombre(ingredienteModificado.getNombre());
        ingrediente.setCantidad(ingredienteModificado.getCantidad());
        ingrediente.setTipoUnidad(ingredienteModificado.getTipoUnidad());
        ingrediente.setComprado(ingredienteModificado.getComprado());
        ingrediente.setTipoAlimento(ingredienteModificado.getTipoAlimento());
        return ingredienteRepository.save(ingrediente);
    }
}
