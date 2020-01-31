package com.id_a.api.service;

import java.util.List;

import com.id_a.api.entity.Categoria;

public interface CategoriaService {
	
	Categoria getById(int id);
	
	List<Categoria> getAll();
	
	Categoria createOrUpdate(Categoria entity);
	
	void delete(int id);
}
