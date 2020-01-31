package com.id_a.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.id_a.api.entity.Comentario;
import com.id_a.api.repository.ComentarioRepository;
import com.id_a.api.service.ComentarioService;

@Service
public class ComentarioServiceImpl implements ComentarioService{

	@Autowired
	private ComentarioRepository repository;

	@Override
	public Comentario getById(int id) {
		return this.repository.findById(id).orElse(null);
	}

	@Override
	public List<Comentario> getAll() {
		return (List<Comentario>) this.repository.findAll();
	}

	@Override
	public Comentario createOrUpdate(Comentario entity) {
		return this.repository.save(entity);
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}
}
