package com.id_a.api.service;

import java.util.List;

import com.id_a.api.entity.Comentario;


public interface ComentarioService {

	Comentario getById(int id);
	
	List<Comentario> getAll();
	
	Comentario createOrUpdate(Comentario entity);
	
	void delete(int id);
}
