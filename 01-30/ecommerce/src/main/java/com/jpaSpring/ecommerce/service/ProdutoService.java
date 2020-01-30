package com.jpaSpring.ecommerce.service;

import java.util.List;

import com.jpaSpring.ecommerce.model.Produto;


public interface ProdutoService {

	Produto getById(int id);
	
	List<Produto> getAll();
	
	Produto createOrUpdate(Produto entity);
	
	void delete(int id);
}
