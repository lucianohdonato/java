package com.jpaSpring.ecommerce.service;

import java.util.List;

import com.jpaSpring.ecommerce.model.Venda;

public interface VendaService {

	Venda getById(int id);
	
	List<Venda> getAll();
	
	Venda createOrUpdate(Venda entity);
	
	void delete(int id);
	
}
