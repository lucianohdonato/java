package com.id_a.api.service;

import java.util.List;

import com.id_a.api.entity.Comunidade;


public interface ComunidadeService {

	Comunidade getById(int id);
	
	List<Comunidade> getAll();
	
	Comunidade createOrUpdate(Comunidade entity);
	
	void delete(int id);
}
