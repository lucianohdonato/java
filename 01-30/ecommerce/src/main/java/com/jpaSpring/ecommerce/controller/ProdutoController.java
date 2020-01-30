package com.jpaSpring.ecommerce.controller;

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

import com.jpaSpring.ecommerce.model.Produto;
import com.jpaSpring.ecommerce.service.ProdutoService;

@CrossOrigin("*")
@RestController
public class ProdutoController {

	@Autowired
	private ProdutoService service;
	
	@PostMapping("/produto")
	public ResponseEntity<Produto> post(@RequestBody Produto entity){
		try {
			Produto produto = this.service.createOrUpdate(entity);
			return ResponseEntity.ok(produto);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@PutMapping("/produto")
	public ResponseEntity<Produto> put(@RequestBody Produto entity){
		try {
			Produto produto = this.service.createOrUpdate(entity);
			return ResponseEntity.ok(produto);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@DeleteMapping("/produto/{id}")
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
	
	@GetMapping("/produto")
	public ResponseEntity<List<Produto>> getAll(){
		return ResponseEntity.ok(this.service.getAll());
	}
	
	@GetMapping("/produto/{id}")
	public ResponseEntity<Produto> getById(@PathVariable int id){
		Produto produto = this.service.getById(id);
		if(produto == null) 
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(produto);
	}
}
