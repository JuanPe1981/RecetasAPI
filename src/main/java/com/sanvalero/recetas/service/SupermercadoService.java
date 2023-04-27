package com.sanvalero.recetas.service;

import com.sanvalero.recetas.domain.Supermercado;

import java.util.List;

public interface SupermercadoService {

    List<Supermercado> verTodo();

    Supermercado verSupermercadoPorNombre(String nombre);

    Supermercado crearSupermercado (Supermercado supermercado);

    void borrarSupermercado (String nombre);

    Supermercado modificarSupermercado(String nombre, Supermercado supermercadoModificado);
}
