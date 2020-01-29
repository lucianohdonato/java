package com.jpaSpring.redeSocial.service;

import java.util.List;

import com.jpaSpring.redeSocial.entity.Usuario;

public interface UsuarioService {
	Usuario insertOrUpdate(Usuario entity);
	
	void delete(int id);
	
	List<Usuario> getAll();
	
	Usuario getById(int id);
	
	List<Usuario> getAllByNome(String nome);
	
	List<Usuario> getAllByEstadoEstado(String estado);
}
