package com.jpaSpring.redeSocial.controller;

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

import com.jpaSpring.redeSocial.entity.Estado;
import com.jpaSpring.redeSocial.service.EstadoService;

@CrossOrigin("*")
@RestController
public class EstadoController {

	@Autowired
	EstadoService service;
	
	@PostMapping("/estado")
	public ResponseEntity<Estado> post(@RequestBody Estado entity){
		try {
			Estado estado = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(estado);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@PutMapping("/estado")
	public ResponseEntity<Estado> put(@RequestBody Estado entity){
		try {
			Estado estado = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(estado);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@DeleteMapping("/estado/{id}")
	public ResponseEntity<String> delete(@PathVariable int id) {
		if(this.service.getById(id) == null) 
			return ResponseEntity.notFound().build();
		try {
			this.service.delete(id);
			return ResponseEntity.ok("Removido com sucesso.");
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@GetMapping("/estado")
	public ResponseEntity<List<Estado>> getAll(){
		return ResponseEntity.ok(this.service.getAll());
	}
	
	@GetMapping("/estado/{id}")
	public ResponseEntity<Estado> getById(@PathVariable int id){
		Estado estado = this.service.getById(id);
		if(estado == null) 
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(estado);
	}
	

}
