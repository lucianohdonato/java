package com.jpaSpring.redeSocial.service;

import java.util.List;

import com.jpaSpring.redeSocial.entity.Estado;

public interface EstadoService {
	Estado insertOrUpdate(Estado entity);
	
	void delete(int id);
	
	List<Estado> getAll();
	
	Estado getById(int id);
	
}
