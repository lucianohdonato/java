package com.spring.perfumaria.controller;

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

import com.spring.perfumaria.model.Perfume;
import com.spring.perfumaria.service.PerfumeService;
import com.spring.perfumaria.service.impl.PerfumeServiceImpl;

@CrossOrigin("*")
@RestController
public class PerfumeController {
	PerfumeService perfumeService = new PerfumeServiceImpl();
	
	@GetMapping("/perfume")
	public List<Perfume> getAll() {
		return perfumeService.getAll();
	}
	
	@GetMapping("/perfume/{id}")
	public ResponseEntity<Perfume> getById(@PathVariable int id) {
		Perfume perfume = perfumeService.getById(id);
		if (perfume == null)
			ResponseEntity.notFound();
		return ResponseEntity.ok(perfume);
	}
	
	@PostMapping("/perfume")
	public ResponseEntity<Perfume> insert(@RequestBody Perfume perfume) {
		if (perfume.getId() != 0) {
			return ResponseEntity.badRequest().body(null);
		}
		perfumeService.insert(perfume);
		return ResponseEntity.ok(perfume);
	}
	
	@PutMapping("/perfume")
	public Perfume update(@RequestBody Perfume perfume) {
		perfumeService.update(perfume);
		return perfume;
	}
	
	@DeleteMapping("/perfume/{id}")
	public void delete(@PathVariable int id) {
		perfumeService.delete(id);
	}
}
