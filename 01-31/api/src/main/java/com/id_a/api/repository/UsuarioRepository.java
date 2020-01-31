package com.id_a.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.id_a.api.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

	List<Usuario> findAllByNome(String nome);
}
