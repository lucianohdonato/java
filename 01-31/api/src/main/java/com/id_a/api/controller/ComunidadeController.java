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

import com.id_a.api.entity.Comunidade;
import com.id_a.api.service.ComunidadeService;

@CrossOrigin("*")
@RestController
public class ComunidadeController {

	@Autowired
	private ComunidadeService service;
	

	@PostMapping("/comunidade")
	public ResponseEntity<Comunidade> post(@RequestBody Comunidade entity){
		try {
			Comunidade comunidade = this.service.createOrUpdate(entity);
			return ResponseEntity.ok(comunidade);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@PutMapping("/comunidade")
	public ResponseEntity<Comunidade> put(@RequestBody Comunidade entity){
		try {
			Comunidade comunidade = this.service.createOrUpdate(entity);
			return ResponseEntity.ok(comunidade);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@DeleteMapping("/comunidade/{id}")
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
	
	@GetMapping("/comunidade")
	public ResponseEntity<List<Comunidade>> getAll(){
		return ResponseEntity.ok(this.service.getAll());
	}
	
	@GetMapping("/comunidade/{id}")
	public ResponseEntity<Comunidade> getById(@PathVariable int id){
		Comunidade comunidade = this.service.getById(id);
		if(comunidade == null) 
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(comunidade);
	}
}
