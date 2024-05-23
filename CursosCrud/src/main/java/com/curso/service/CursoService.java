package com.curso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.model.Curso;
import com.cursos.repository.CursoRepository;

@Service
public class CursoService {
	
    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> getAllCursos() {
        return cursoRepository.findAll();
    }

    public Optional<Curso> getCursoById(String codCurso) {
        return cursoRepository.findById(codCurso);
    }

    public Curso saveCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public void deleteCurso(String codCurso) {
        cursoRepository.deleteById(codCurso);
    }

    public void updateDuracion(String codCurso, int duracion) {
        Optional<Curso> cursoOptional = cursoRepository.findById(codCurso);
        if (cursoOptional.isPresent()) {
            Curso curso = cursoOptional.get();
            curso.setDuracion(duracion);
            cursoRepository.save(curso);
        }
    }

    public List<Curso> findCursosByPrecioRange(double precioMin, double precioMax) {
        return cursoRepository.findByPrecioBetween(precioMin, precioMax);
    }
}
