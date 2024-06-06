package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.curso.model.Vuelo;

public interface VuelosDao extends JpaRepository<Vuelo, Integer> {

	List<Vuelo> findByPlazasDisponiblesGreaterThanEqual(int plazas);

	@Transactional
	@Modifying
	@Query(value = "UPDATE Vuelo v SET v.plazasDisponibles = v.plazasDisponibles - ?1 WHERE v.idVuelo = ?2")
	void actualizaPlazasDisponibles(int reservadas, int idVuelo);
}
