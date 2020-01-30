package com.jpaSpring.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpaSpring.ecommerce.model.Departamento;
import com.jpaSpring.ecommerce.repository.DepartamentoRepository;
import com.jpaSpring.ecommerce.service.DepartamentoService;

@Service
public class DepartamentoServiceImpl implements DepartamentoService{

	@Autowired
	private DepartamentoRepository repository;

	@Override
	public Departamento getById(int id) {
		return this.repository.findById(id).orElse(null);
	}

	@Override
	public List<Departamento> getAll() {
		return (List<Departamento>) this.repository.findAll();
	}

	@Override
	public Departamento createOrUpdate(Departamento entity) {
		return this.repository.save(entity);
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}
	
	
}
