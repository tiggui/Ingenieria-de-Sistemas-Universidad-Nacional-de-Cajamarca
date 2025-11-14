package org.tiglla.springcloud.msvc.usuarios.services;

import org.tiglla.springcloud.msvc.usuarios.models.entity.Usuario;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.tiglla.springcloud.msvc.usuarios.repositories.UsuarioRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public List<Usuario> listar() {
        return (List<Usuario>) (repository.findAll());
    }

    @Override
    @Transactional (readOnly = true)
    public Optional<Usuario> porId(long Id) {
        return repository.findById(Id);
    }

    @Override
    @Transactional
    public Usuario guardar(Usuario usuario) {
        return repository.save(usuario);
    }

    @Override
    public void eliminar(Long Id) {
        repository.deleteById(Id);
    }
}
