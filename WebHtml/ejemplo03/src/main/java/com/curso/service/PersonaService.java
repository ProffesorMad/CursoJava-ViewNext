package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.model.Persona;

@Service
public class PersonaService {
	
	static List<Persona> lista= new ArrayList<Persona>();
	
	static {
		Persona p1 = new Persona("Pablo","Gracia",21);
		Persona p2 = new Persona("Beniamin","Rumano",19);
		Persona p3= new Persona("Youssef","Nose",22);
		Persona p4 = new Persona("Alejandro","Barracil",23);
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
	}
	
	public List<Persona> buscarTodas(){
		return lista;
	}

}
