package com.jpaSpring.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpaSpring.ecommerce.model.Cliente;
import com.jpaSpring.ecommerce.repository.ClienteRepository;
import com.jpaSpring.ecommerce.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository repository;

	@Override
	public Cliente getById(int id) {
		return this.repository.findById(id).orElse(null);
	}

	@Override
	public List<Cliente> getAll() {
		return (List<Cliente>) this.repository.findAll();
	}

	@Override
	public Cliente createOrUpdate(Cliente entity) {
		return this.repository.save(entity);
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}
}
