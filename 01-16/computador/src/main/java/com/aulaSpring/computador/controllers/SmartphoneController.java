package com.aulaSpring.computador.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.aulaSpring.computador.models.Smartphone;

@CrossOrigin("*")
@RestController
public class SmartphoneController {
	
	@GetMapping("/smartphone")
	public List<Smartphone> buscarSmartphone() {
		
			List<Smartphone> listaSmartphone = new ArrayList<Smartphone>();
			listaSmartphone.add(new Smartphone("Mi A2", "Xiaomi", 900));
			listaSmartphone.add(new Smartphone("Moto One", "Motorola", 1200));
			listaSmartphone.add(new Smartphone("Iphone XR", "Iphone", 3200));
			
		return listaSmartphone;
	}
	
}