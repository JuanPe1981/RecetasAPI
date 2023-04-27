package com.sanvalero.recetas.service;

import com.sanvalero.recetas.domain.Supermercado;
import com.sanvalero.recetas.repository.SupermercadoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupermercadoServiceImpl implements SupermercadoService {

    @Autowired
    private SupermercadoRepository supermercadoRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<Supermercado> verTodo() {
        return supermercadoRepository.findAll();
    }

    @Override
    public Supermercado verSupermercadoPorNombre(String nombre) {
        return supermercadoRepository.findByNombre(nombre);
    }

    @Override
    public Supermercado crearSupermercado(Supermercado supermercado) {
        return supermercadoRepository.save(supermercado);
    }

    @Override
    public void borrarSupermercado(String nombre) {
        Supermercado supermercado = supermercadoRepository.findByNombre(nombre);
        supermercadoRepository.delete(supermercado);
    }

    @Override
    public Supermercado modificarSupermercado(String nombre, Supermercado supermercadoModificado) {
        Supermercado supermercado = supermercadoRepository.findByNombre(nombre);
        supermercado.setNombre(supermercadoModificado.getNombre());
        supermercado.setCadena(supermercadoModificado.getCadena());
        supermercado.setDireccion(supermercadoModificado.getDireccion());
        supermercado.setCodigoPostal(supermercadoModificado.getCodigoPostal());
        supermercado.setLocalidad(supermercadoModificado.getLocalidad());
        supermercado.setLatitud(supermercadoModificado.getLatitud());
        supermercado.setLongitud(supermercadoModificado.getLongitud());
        return supermercadoRepository.save(supermercado);
    }
}
