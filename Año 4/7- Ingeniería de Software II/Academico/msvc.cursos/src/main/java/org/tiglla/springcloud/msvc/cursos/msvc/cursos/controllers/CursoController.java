package org.tiglla.springcloud.msvc.cursos.msvc.cursos.controllers;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.tiglla.springcloud.msvc.cursos.msvc.cursos.entity.Curso;
import org.tiglla.springcloud.msvc.cursos.msvc.cursos.services.CursoService;
import org.tiglla.springcloud.msvc.cursos.msvc.cursos.services.CursoServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/curso")
public class CursoController {

    @Autowired
    private CursoService service;

    @GetMapping
    public ResponseEntity<List<Curso>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> detalle(@PathVariable long id) {
        Optional <Curso> oc = service.porId(id);
        if(oc.isPresent())
            return ResponseEntity.ok(oc.get());

        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody Curso curso){
        Curso cursoDB = service.guardar(curso);
        return ResponseEntity.status(HttpStatus.CREATED).body(cursoDB);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> editar(@RequestBody Curso curso, @PathVariable long id) {
        Optional <Curso> oc = service.porId(id);
        if(oc.isPresent()) {
            Curso curDB = oc.get();
            curDB.setNombre(curso.getNombre());
            return ResponseEntity.status(HttpStatus.CREATED).body(service.guardar(curDB));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable long id) {
        Optional <Curso> oc = service.porId(id);
        if(oc.isPresent()) {
            service.eliminar(oc.get().getId());
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

}
