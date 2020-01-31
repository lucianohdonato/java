package com.id_a.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.id_a.api.entity.Post;
import com.id_a.api.service.PostService;

@CrossOrigin("*")
@RestController
public class PostController {

	@Autowired
	private PostService service;
	

	@PostMapping("/post")
	public ResponseEntity<Post> post(@RequestBody Post entity){
		try {
			Post post = this.service.createOrUpdate(entity);
			return ResponseEntity.ok(post);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@PutMapping("/post")
	public ResponseEntity<Post> put(@RequestBody Post entity){
		try {
			Post post = this.service.createOrUpdate(entity);
			return ResponseEntity.ok(post);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@DeleteMapping("/post/{id}")
	public ResponseEntity<String> delete(@PathVariable int id){
		if(this.service.getById(id) == null) 
			return ResponseEntity.notFound().build();
		try {
			this.service.delete(id);
			return ResponseEntity.ok("Removido com sucesso.");
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@GetMapping("/post")
	public ResponseEntity<List<Post>> getAll(){
		return ResponseEntity.ok(this.service.getAll());
	}
	
	@GetMapping("/post/{id}")
	public ResponseEntity<Post> getById(@PathVariable int id){
		Post post = this.service.getById(id);
		if(post == null) 
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(post);
	}
	
	@GetMapping("/post/palavra/{palavra}")
	public ResponseEntity<List<Post>> getAllByPalavra(@PathVariable String palavra){
		return ResponseEntity.ok(this.service.findAllByTituloContaining(palavra));
	}
}
