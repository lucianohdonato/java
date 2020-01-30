package com.jpaSpring.ecommerce.service;

import java.util.List;

import com.jpaSpring.ecommerce.model.Cliente;

public interface ClienteService {

	Cliente getById(int id);
	
	List<Cliente> getAll();
	
	Cliente createOrUpdate(Cliente entity);
	
	void delete(int id);
		
}
