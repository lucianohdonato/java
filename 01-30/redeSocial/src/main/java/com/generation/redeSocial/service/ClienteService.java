package com.generation.redeSocial.service;

import java.util.List;

import com.generation.redeSocial.model.Cliente;

public interface ClienteService {

	Cliente getById(int id);
	
	List<Cliente> getAll();
	
	Cliente createOrUpdate(Cliente cliente);
	
	void delete(int id);
		
	List<Cliente> createOrUpdateAll (List<Cliente> clientes);
}
