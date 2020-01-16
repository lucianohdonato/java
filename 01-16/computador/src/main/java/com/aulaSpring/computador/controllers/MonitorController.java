package com.aulaSpring.computador.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.aulaSpring.computador.models.Monitor;

@CrossOrigin("*")
@RestController
public class MonitorController {
	
	@GetMapping("/monitor")
	public List<Monitor> buscarComputadores() {
		
			List<Monitor> listaMonitor = new ArrayList<Monitor>();
			listaMonitor.add(new Monitor("LG LED 29'", "LG", 950));
			listaMonitor.add(new Monitor("AOC HERO LED 24'", "AOC", 1100));
			listaMonitor.add(new Monitor("Samsung LED 23.8'", "Samsung", 699));
			
		return listaMonitor;
	}

}
