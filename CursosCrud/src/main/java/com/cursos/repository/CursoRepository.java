package com.cursos.repository;

import com.curso.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CursoRepository extends JpaRepository<Curso, String> {
	
    List<Curso> findByPrecioBetween(double precioMin, double precioMax);
    
}