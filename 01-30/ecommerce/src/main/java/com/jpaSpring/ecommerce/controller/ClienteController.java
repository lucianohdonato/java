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

import com.jpaSpring.ecommerce.model.Cliente;
import com.jpaSpring.ecommerce.service.ClienteService;

@CrossOrigin("*")
@RestController
public class ClienteController {

	@Autowired
	private ClienteService service;
	
	@PostMapping("/cliente")
	public ResponseEntity<Cliente> post(@RequestBody Cliente entity){
		try {
			Cliente cliente = this.service.createOrUpdate(entity);
			return ResponseEntity.ok(cliente);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@PutMapping("/cliente")
	public ResponseEntity<Cliente> put(@RequestBody Cliente entity){
		try {
			Cliente cliente = this.service.createOrUpdate(entity);
			return ResponseEntity.ok(cliente);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@DeleteMapping("/cliente/{id}")
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
	
	@GetMapping("/cliente")
	public ResponseEntity<List<Cliente>> getAll(){
		return ResponseEntity.ok(this.service.getAll());
	}
	
	@GetMapping("/cliente/{id}")
	public ResponseEntity<Cliente> getById(@PathVariable int id){
		Cliente cliente = this.service.getById(id);
		if(cliente == null) 
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(cliente);
	}
}
