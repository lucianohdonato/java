package com.aulaSpring.computador.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.aulaSpring.computador.models.Computador;

@CrossOrigin("*")
@RestController
public class ComputadorController {
	
	@GetMapping("/computador")
	public List<Computador> buscarComputadores() {
		
			List<Computador> listaComputadores = new ArrayList<Computador>();
			listaComputadores.add(new Computador("Note de casa", "Dell", 1500));
			listaComputadores.add(new Computador("PC Generation", "Dell", 2000));
			listaComputadores.add(new Computador("PC Sei La", "Positivo", 1000));
			
		return listaComputadores;
	}
	
}
