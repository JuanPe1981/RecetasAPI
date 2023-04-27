package com.sanvalero.recetas.service;

import com.sanvalero.recetas.domain.Usuario;
import com.sanvalero.recetas.repository.UsuarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<Usuario> verTodo() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario verUsuarioPorNombreUsuario(String nombreUsuario) {
        return usuarioRepository.findByNombreUsuario(nombreUsuario);
    }

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void borrarUsuario(String nombreUsuario) {
        Usuario usuario = usuarioRepository.findByNombreUsuario(nombreUsuario);
        usuarioRepository.delete(usuario);
    }

    @Override
    public Usuario modificarUsuario(String nombreUsuario, Usuario usuarioModificado) {
        Usuario usuario = usuarioRepository.findByNombreUsuario(nombreUsuario);
        usuario.setNombre(usuarioModificado.getNombre());
        usuario.setApellido(usuarioModificado.getApellido());
        usuario.setDireccion(usuarioModificado.getDireccion());
        usuario.setTelefono(usuarioModificado.getTelefono());
        usuario.setNombreUsuario(usuarioModificado.getNombreUsuario());
        usuario.setPassword(usuarioModificado.getPassword());
        usuario.setPoliticaPrivacidad(usuarioModificado.getPoliticaPrivacidad());
        return usuarioRepository.save(usuario);
    }
}
