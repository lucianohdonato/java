package com.jpaSpring.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpaSpring.ecommerce.model.Venda;
import com.jpaSpring.ecommerce.repository.VendaRepository;
import com.jpaSpring.ecommerce.service.VendaService;

@Service
public class VendaServiceImpl implements VendaService{

	@Autowired
	private VendaRepository repository;

	@Override
	public Venda getById(int id) {
		return this.repository.findById(id).orElse(null);
	}

	@Override
	public List<Venda> getAll() {
		return (List<Venda>) this.repository.findAll();
	}

	@Override
	public Venda createOrUpdate(Venda entity) {
		return this.repository.save(entity);
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}
}
