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

import com.jpaSpring.ecommerce.model.Departamento;
import com.jpaSpring.ecommerce.service.DepartamentoService;

@CrossOrigin("*")
@RestController
public class DepartamentoController {

	@Autowired
	private DepartamentoService service;
	
	@PostMapping("/departamento")
	public ResponseEntity<Departamento> post(@RequestBody Departamento entity){
		try {
			Departamento departamento = this.service.createOrUpdate(entity);
			return ResponseEntity.ok(departamento);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@PutMapping("/departamento")
	public ResponseEntity<Departamento> put(@RequestBody Departamento entity){
		try {
			Departamento departamento = this.service.createOrUpdate(entity);
			return ResponseEntity.ok(departamento);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@DeleteMapping("/departamento/{id}")
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
	
	@GetMapping("/departamento")
	public ResponseEntity<List<Departamento>> getAll(){
		return ResponseEntity.ok(this.service.getAll());
	}
	
	@GetMapping("/departamento/{id}")
	public ResponseEntity<Departamento> getById(@PathVariable int id){
		Departamento departamento = this.service.getById(id);
		if(departamento == null) 
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(departamento);
	}
}
