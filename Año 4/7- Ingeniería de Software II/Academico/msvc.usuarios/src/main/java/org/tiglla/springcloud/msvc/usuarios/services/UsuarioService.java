package org.tiglla.springcloud.msvc.usuarios.services;

import org.tiglla.springcloud.msvc.usuarios.models.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<Usuario> listar();
    Optional<Usuario> porId(long Id);
    Usuario guardar(Usuario usuario);
    void eliminar( Long Id);
}
