package com.jpa.escola.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.escola.entity.Aluno;
import com.jpa.escola.repository.AlunoRepository;
import com.jpa.escola.service.AlunoService;

@Service
public class AlunoServiceImpl implements AlunoService{

	@Autowired
	private AlunoRepository repository;
	
	@Override
	public Aluno insertOrUpdate(Aluno entity) {
		return this.repository.save(entity);
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}

	@Override
	public List<Aluno> getAll() {
		return (List<Aluno>) this.repository.findAll();
	}

	@Override
	public Aluno getById(int id) {
		return this.repository.findById(id).orElse(null);
	}
}
