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

import com.jpa.escola.entity.Turno;
import com.jpa.escola.service.TurnoService;

@RestController
@CrossOrigin("*")
public class TurnoController {

	@Autowired
	private TurnoService service;
	
	@PostMapping("/turno")
	public ResponseEntity<Turno> post(@RequestBody Turno entity){
		try {
			Turno turnoInserido = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(turnoInserido);
		}
		catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@PutMapping("/turno")
	public ResponseEntity<Turno> put(@RequestBody Turno entity){
		try {
			Turno turnoAlterado = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(turnoAlterado);
		}
		catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@GetMapping("/turno")
	public ResponseEntity<List<Turno>> geAll(){
		return ResponseEntity.ok(this.service.getAll());
	}
	
	@GetMapping("/turno/{id}")
	public ResponseEntity<Turno> getById(@PathVariable int id){
		Turno turno = this.service.getById(id);
		if (turno == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(turno);
	}
}
