package com.generation.redeSocial.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.generation.redeSocial.model.Cliente;
import com.generation.redeSocial.service.ClienteService;

@RestController
@CrossOrigin("*")
public class ClienteController {

	@Autowired
	private ClienteService service;
	
	@GetMapping("/cliente")
	public ResponseEntity<List<Cliente>> getAll() {
		return ResponseEntity.ok(service.getAll());
	}

	@GetMapping("/cliente/{id}") 
	public ResponseEntity<Cliente> getById(@Valid @PathVariable int id) {
		return ResponseEntity.ok(service.getById(id));
	}

	@PostMapping("/cliente")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente postCliente(@Valid @RequestBody Cliente entity) {
		Cliente cliente = service.createOrUpdate(entity);
		if (cliente == null)
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Deu Ruim");
		return cliente;
	}
	
	@PutMapping("/cliente")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente putCliente(@Valid @RequestBody Cliente entity) {
		Cliente cliente = service.createOrUpdate(entity);
		if (cliente == null)
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Deu Ruim");
		return cliente;
	}
	
	@DeleteMapping("cliente/{id}")
	public ResponseEntity<String> delete(@PathVariable int id){
		service.delete(id);
		return ResponseEntity.ok("Deletado");
	}
	
	@PostMapping("/cliente/list")
	@ResponseStatus(HttpStatus.CREATED)
	public List<Cliente> postClienteList(@Valid @RequestBody List<Cliente> entity){
		List<Cliente> clientes = service.createOrUpdateAll(entity);
		if (clientes.size() == 0)
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Deu Ruim");
		return clientes;
	}
}
