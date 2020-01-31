package com.id_a.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.id_a.api.entity.Comunidade;
import com.id_a.api.repository.ComunidadeRepository;
import com.id_a.api.service.ComunidadeService;

@Service
public class ComunidadeServiceImpl implements ComunidadeService{

	@Autowired
	private ComunidadeRepository repository;

	@Override
	public Comunidade getById(int id) {
		return this.repository.findById(id).orElse(null);
	}

	@Override
	public List<Comunidade> getAll() {
		return (List<Comunidade>) this.repository.findAll();
	}

	@Override
	public Comunidade createOrUpdate(Comunidade entity) {
		return this.repository.save(entity);
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}
}
