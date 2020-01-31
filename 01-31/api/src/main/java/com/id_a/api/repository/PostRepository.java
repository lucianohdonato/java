package com.id_a.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.id_a.api.entity.Post;

public interface PostRepository extends CrudRepository<Post, Integer>{

	List<Post> findAllByTituloContaining(String palavra);
}
