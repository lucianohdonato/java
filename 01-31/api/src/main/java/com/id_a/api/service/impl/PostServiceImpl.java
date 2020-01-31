package com.id_a.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.id_a.api.entity.Post;
import com.id_a.api.repository.PostRepository;
import com.id_a.api.service.PostService;

@Service
public class PostServiceImpl implements PostService{

	@Autowired
	private PostRepository repository;

	@Override
	public Post getById(int id) {
		return this.repository.findById(id).orElse(null);
	}

	@Override
	public List<Post> getAll() {
		return (List<Post>) this.repository.findAll();
	}

	@Override
	public Post createOrUpdate(Post entity) {
		return this.repository.save(entity);
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}

	@Override
	public List<Post> findAllByTituloContaining(String palavra) {
		return this.repository.findAllByTituloContaining(palavra);
	}
}
