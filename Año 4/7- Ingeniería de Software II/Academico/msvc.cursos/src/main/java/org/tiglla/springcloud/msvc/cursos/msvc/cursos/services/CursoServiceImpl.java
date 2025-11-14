package org.tiglla.springcloud.msvc.cursos.msvc.cursos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tiglla.springcloud.msvc.cursos.msvc.cursos.entity.Curso;
import org.tiglla.springcloud.msvc.cursos.msvc.cursos.repositories.CursoRepository;

import java.util.List;
import java.util.Optional;

@Service //Indicamos que es un servicio
public class CursoServiceImpl implements CursoService{

    @Autowired// Va a hacer uso del crud repository inyectamos la insterfaz de CursoRepository
    private CursoRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Curso> listar() {
        return (List<Curso>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Curso> porId(Long Id) {
        return repository.findById(Id);
    }

    @Override
    @Transactional
    public Curso guardar(Curso curso) {
        return repository.save(curso);
    }

    @Override
    @Transactional
    public void eliminar(Long Id) {
        repository.deleteById(Id);
    }
}
