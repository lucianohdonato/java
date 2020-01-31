package com.id_a.api.service;

import java.util.List;

import com.id_a.api.entity.Post;


public interface PostService {

	Post getById(int id);
	
	List<Post> getAll();
	
	Post createOrUpdate(Post entity);
	
	void delete(int id);
	
	List<Post> findAllByTituloContaining(String palavra);
}
