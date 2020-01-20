package com.spring.informatica.service;

import java.util.List;

import com.spring.informatica.model.Celular;

public interface CelularService {
	
	Celular insert(Celular celular);
	
	Celular update(Celular celular);
	
	void delete(int id);
	
	Celular getById(int id);
	
	List<Celular> getAll();
	
}
