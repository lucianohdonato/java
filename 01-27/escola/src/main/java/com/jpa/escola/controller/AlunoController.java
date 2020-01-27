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

import com.jpa.escola.entity.Aluno;
import com.jpa.escola.service.AlunoService;
import com.jpa.escola.service.TurmaService;

@RestController
@CrossOrigin("*")
public class AlunoController {

	@Autowired
	private AlunoService service;
	@Autowired
	private TurmaService serviceTurma;
	
	@PostMapping("/aluno")
	public ResponseEntity<Aluno> post(@RequestBody Aluno entity){
		try {
			entity.setTurma(this.serviceTurma.getById(entity.getTurma().getIdTurma()));
			Aluno alunoInserido = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(alunoInserido);
		}
		catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@PutMapping("/aluno")
	public ResponseEntity<Aluno> put(@RequestBody Aluno entity){
		try {
			Aluno alunoAlterado = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(alunoAlterado);
		}
		catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@GetMapping("/aluno")
	public ResponseEntity<List<Aluno>> geAll(){
		return ResponseEntity.ok(this.service.getAll());
	}
	
	@GetMapping("/aluno/{id}")
	public ResponseEntity<Aluno> getById(@PathVariable int id){
		Aluno aluno = this.service.getById(id);
		if (aluno == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(aluno);
	}
}
