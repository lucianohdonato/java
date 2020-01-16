package com.aulaSpring.hello.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World! Primeiro projeto Spring Boot";
	}
	
	@GetMapping("/hello/nome/{nome}")
	public String sayHelloNome(@PathVariable String nome) {
		return "Hello World! Seja bem vindo " + nome + "";
	}
	
	@GetMapping("/hello/turma")
	@ResponseBody
	public String sayHelloNome(@RequestParam Optional<String> turma) {
		return "Turma " + turma.orElseGet(() -> "não fornecida");
	}
}
