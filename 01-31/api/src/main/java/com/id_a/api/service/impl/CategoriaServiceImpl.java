package com.id_a.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.id_a.api.entity.Categoria;
import com.id_a.api.repository.CategoriaRepository;
import com.id_a.api.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	private CategoriaRepository repository;

	@Override
	public Categoria getById(int id) {
		return this.repository.findById(id).orElse(null);
	}

	@Override
	public List<Categoria> getAll() {
		return (List<Categoria>) this.repository.findAll();
	}

	@Override
	public Categoria createOrUpdate(Categoria entity) {
		return this.repository.save(entity);
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}
}
