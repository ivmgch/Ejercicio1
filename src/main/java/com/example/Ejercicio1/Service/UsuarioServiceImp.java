package com.example.Ejercicio1.Service;

import com.example.Ejercicio1.Entity.Usuario;
import com.example.Ejercicio1.Repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UsuarioServiceImp implements UsuarioService{

    private final UsuarioRepository usuarioRepository;

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> obtenerUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> obtenerPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public void eliminarUsuario(Long id) {
        if(!usuarioRepository.existsById(id)){
            throw new RuntimeException("Usuario no existe");
        }
        usuarioRepository.deleteById(id);
    }


}
