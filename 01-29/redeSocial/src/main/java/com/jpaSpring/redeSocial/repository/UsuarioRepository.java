package com.jpaSpring.redeSocial.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpaSpring.redeSocial.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
	List<Usuario> findAllByNome(String nome);
	List<Usuario> findAllByEstadoEstado(String estado);
}