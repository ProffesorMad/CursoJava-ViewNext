package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Curso;
import com.curso.service.CursoService;

@RestController
@RequestMapping("/cursos")
public class CursoController {
	
    @Autowired
    private CursoService cursoService;

    @PostMapping
    public ResponseEntity<List<Curso>> addCurso(@RequestBody Curso curso) {
        cursoService.saveCurso(curso);
        return ResponseEntity.ok(cursoService.getAllCursos());
    }

    @DeleteMapping("/{codCurso}")
    public ResponseEntity<List<Curso>> deleteCurso(@PathVariable String codCurso) {
        cursoService.deleteCurso(codCurso);
        return ResponseEntity.ok(cursoService.getAllCursos());
    }

    @PutMapping("/{codCurso}/duracion/{duracion}")
    public ResponseEntity<Void> updateDuracion(@PathVariable String codCurso, @PathVariable int duracion) {
        cursoService.updateDuracion(codCurso, duracion);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{codCurso}")
    public ResponseEntity<Curso> getCurso(@PathVariable String codCurso) {
        return cursoService.getCursoById(codCurso)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/precio")
    public ResponseEntity<List<Curso>> getCursosByPrecioRange(@RequestParam double precioMin, @RequestParam double precioMax) {
        return ResponseEntity.ok(cursoService.findCursosByPrecioRange(precioMin, precioMax));
    }
}
