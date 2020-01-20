package com.spring.perfumaria.service;

import java.util.List;

import com.spring.perfumaria.model.Perfume;

public interface PerfumeService {
	 List<Perfume> getAll();
	
	 Perfume getById(int id);
	
	 Perfume insert(Perfume perfume);
	
	 Perfume update(Perfume perfume);
	
	 void delete(int id);
}
