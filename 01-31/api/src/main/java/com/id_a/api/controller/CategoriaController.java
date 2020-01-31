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

import com.id_a.api.entity.Categoria;
import com.id_a.api.service.CategoriaService;

@CrossOrigin("*")
@RestController
public class CategoriaController {

	@Autowired
	private CategoriaService service;
	
	@PostMapping("/categoria")
	public ResponseEntity<Categoria> post(@RequestBody Categoria entity){
		try {
			Categoria categoria = this.service.createOrUpdate(entity);
			return ResponseEntity.ok(categoria);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@PutMapping("/categoria")
	public ResponseEntity<Categoria> put(@RequestBody Categoria entity){
		try {
			Categoria categoria = this.service.createOrUpdate(entity);
			return ResponseEntity.ok(categoria);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@DeleteMapping("/categoria/{id}")
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
	
	@GetMapping("/categoria")
	public ResponseEntity<List<Categoria>> getAll(){
		return ResponseEntity.ok(this.service.getAll());
	}
	
	@GetMapping("/categoria/{id}")
	public ResponseEntity<Categoria> getById(@PathVariable int id){
		Categoria categoria = this.service.getById(id);
		if(categoria == null) 
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(categoria);
	}
}
