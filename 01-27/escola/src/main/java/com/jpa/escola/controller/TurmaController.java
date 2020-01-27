package com.jpa.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.escola.entity.Turma;
import com.jpa.escola.service.TurmaService;

@RestController
@CrossOrigin("*")
public class TurmaController {

	@Autowired
	private TurmaService service;
	
	@PostMapping("/turma")
	public ResponseEntity<Turma> post(@RequestBody Turma entity){
		try {
			Turma turmaInserida = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(turmaInserida);
		}
		catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@PutMapping("/turma")
	public ResponseEntity<Turma> put(@RequestBody Turma entity){
		try {
			Turma turmaAlterada = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(turmaAlterada);
		}
		catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@GetMapping("/turma")
	public ResponseEntity<List<Turma>> geAll(){
		return ResponseEntity.ok(this.service.getAll());
	}
	
	@GetMapping("/turma/{id}")
	public ResponseEntity<Turma> getById(@PathVariable int id){
		Turma turma = this.service.getById(id);
		if (turma == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(turma);
	}
}
