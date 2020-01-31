package com.id_a.api.service;

import java.util.List;

import com.id_a.api.entity.Usuario;


public interface UsuarioService {

	Usuario getById(int id);
	
	List<Usuario> getAll();
	
	Usuario createOrUpdate(Usuario entity);
	
	void delete(int id);
	
	List<Usuario> getAllByNome(String nome);
}
