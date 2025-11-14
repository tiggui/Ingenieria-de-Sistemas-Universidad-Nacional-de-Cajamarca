package org.tiglla.springcloud.msvc.usuarios.controllers;

import org.tiglla.springcloud.msvc.usuarios.models.entity.Usuario;
import org.tiglla.springcloud.msvc.usuarios.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
    //inyectamos como dependencia assent
    @Autowired
    private UsuarioService service;
    //para acceder a lista se usa:
    @GetMapping
    public List<Usuario> lista(){
        return service.listar();
    }

    @GetMapping("/{id}") //cuando el metodo resive variables se indica asi
    public ResponseEntity<?> detalle(@PathVariable Long id){
        //se va a recoger sin formato definido osea de la base de datos que es diferente a java por eso se usa "Optional<>"
        Optional<Usuario> usuOp = service.porId(id);
        if(usuOp.isPresent())
            return ResponseEntity.ok(usuOp.get());

        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody Usuario usuario){
        return ResponseEntity.status(HttpStatus.CREATED).body((service.guardar(usuario)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> editar(@RequestBody Usuario usuario, @PathVariable Long id){
        Optional<Usuario> usuOP = service.porId(id);
        if(usuOP.isPresent()){

            Usuario usuarioDB = usuOP.get();//damos formato para lo que trar optional (solo esta linea)
            usuarioDB.setNombre(usuario.getNombre());
            usuarioDB.setEmail(usuario.getNombre());
            usuarioDB.setPassword(usuario.getPassword());
            return ResponseEntity.status(HttpStatus.CREATED).body(service.guardar((usuarioDB)));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id){
        Optional<Usuario> usuOp = service.porId(id);
        if(usuOp.isPresent()){
            service.eliminar(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}

