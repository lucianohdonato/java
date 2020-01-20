package com.spring.informatica.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.informatica.model.Celular;
import com.spring.informatica.service.CelularService;
import com.spring.informatica.service.impl.CelularServiceImpl;

@CrossOrigin("*")
@RestController
public class CelularController {
	CelularService celularService = new CelularServiceImpl();
	
	@GetMapping("/celular")
	public List<Celular> getAll(){
		return celularService.getAll();
	}
	
	@GetMapping("/celular/{id}")
	public ResponseEntity<Celular> getById(@PathVariable int id){
		Celular celular = celularService.getById(id);
		if (celular == null) {
			ResponseEntity.notFound();
		}
		return ResponseEntity.ok(celular);
	}
	
	@PostMapping("/celular")
	public ResponseEntity<Celular> insert(@RequestBody Celular celular) {
		if (celular.getId() != 0) {
			return ResponseEntity.badRequest().body(null);
		}
		celularService.insert(celular);
		return ResponseEntity.ok(celular);
	}
	
	@PutMapping("/celular")
	public Celular update(@RequestBody Celular celular) {
		celularService.update(celular);
		return celular;
	}
	
	@DeleteMapping("/celular/{id}")
	public void delete(@PathVariable int id) {
		celularService.delete(id);
	}
}
