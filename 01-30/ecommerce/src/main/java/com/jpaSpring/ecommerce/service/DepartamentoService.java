package com.jpaSpring.ecommerce.service;

import java.util.List;

import com.jpaSpring.ecommerce.model.Departamento;

public interface DepartamentoService {

	Departamento getById(int id);
	
	List<Departamento> getAll();
	
	Departamento createOrUpdate(Departamento entity);
	
	void delete(int id);
}
