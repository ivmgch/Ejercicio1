package com.example.Ejercicio1.Service;

import com.example.Ejercicio1.Entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    Usuario crearUsuario(Usuario usuario);
    List<Usuario> obtenerUsuarios();
    Optional<Usuario> obtenerPorId(Long id);
    void eliminarUsuario(Long id);
}
