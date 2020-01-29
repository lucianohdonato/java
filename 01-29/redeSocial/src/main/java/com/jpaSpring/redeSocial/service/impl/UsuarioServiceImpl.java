package com.jpaSpring.redeSocial.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpaSpring.redeSocial.entity.Usuario;
import com.jpaSpring.redeSocial.repository.UsuarioRepository;
import com.jpaSpring.redeSocial.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public Usuario insertOrUpdate(Usuario entity) {
		return this.repository.save(entity);
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
		
	}

	@Override
	public List<Usuario> getAll() {
		return (List<Usuario>) this.repository.findAll();
	}

	@Override
	public Usuario getById(int id) {
		return this.repository.findById(id).orElse(null);
	}

	@Override
	public List<Usuario> getAllByNome(String nome) {
		return this.repository.findAllByNome(nome);
	}

	@Override
	public List<Usuario> getAllByEstadoEstado(String estado) {
		return this.repository.findAllByEstadoEstado(estado);
	}

}
