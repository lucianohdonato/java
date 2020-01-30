package com.jpaSpring.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpaSpring.ecommerce.model.Produto;
import com.jpaSpring.ecommerce.repository.ProdutoRepository;
import com.jpaSpring.ecommerce.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService{

	@Autowired
	private ProdutoRepository repository;

	@Override
	public Produto getById(int id) {
		return this.repository.findById(id).orElse(null);
	}

	@Override
	public List<Produto> getAll() {
		return (List<Produto>) this.repository.findAll();
	}

	@Override
	public Produto createOrUpdate(Produto entity) {
		return this.repository.save(entity);
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}
}
