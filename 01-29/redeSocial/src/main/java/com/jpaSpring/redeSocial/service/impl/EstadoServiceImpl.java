package com.jpaSpring.redeSocial.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpaSpring.redeSocial.entity.Estado;
import com.jpaSpring.redeSocial.repository.EstadoRepository;
import com.jpaSpring.redeSocial.service.EstadoService;

@Service
public class EstadoServiceImpl implements EstadoService{

	@Autowired
	private EstadoRepository repository;
	
	@Override
	public Estado insertOrUpdate(Estado entity) {
		return this.repository.save(entity);
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}

	@Override
	public List<Estado> getAll() {
		return (List<Estado>) this.repository.findAll();
	}

	@Override
	public Estado getById(int id) {
		return this.repository.findById(id).orElse(null);
	}

}
