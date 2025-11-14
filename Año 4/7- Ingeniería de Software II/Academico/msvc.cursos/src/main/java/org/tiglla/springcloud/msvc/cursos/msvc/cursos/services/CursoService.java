package org.tiglla.springcloud.msvc.cursos.msvc.cursos.services;

import org.tiglla.springcloud.msvc.cursos.msvc.cursos.entity.Curso;

import java.util.List;
import java.util.Optional;

public interface CursoService{

    List<Curso> listar();
    Optional<Curso> porId(Long Id);
    Curso guardar(Curso curso);
    void eliminar(Long Id);

}
