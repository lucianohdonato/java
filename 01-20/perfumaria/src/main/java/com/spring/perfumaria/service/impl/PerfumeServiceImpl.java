package com.spring.perfumaria.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.spring.perfumaria.model.Perfume;
import com.spring.perfumaria.service.PerfumeService;

public class PerfumeServiceImpl implements PerfumeService{

	static List<Perfume> perfumes = new ArrayList<Perfume>();
	private static int incr = 0;
	
	@Override
	public List<Perfume> getAll() {
		return perfumes;
	}

	@Override
	public Perfume getById(int id) {
		for (Perfume perfume : perfumes) {
			if (perfume.getId() == id) {
				return perfume;
			}
		}
		return null;
	}

	@Override
	public Perfume insert(Perfume perfume) {
		incr ++;
		perfume.setId(incr);
		perfumes.add(perfume);
		return perfume;
	}

	@Override
	public Perfume update(Perfume perfume) {
		Perfume aux = getById(perfume.getId());
		if (aux != null) {
			aux.setNome(perfume.getNome());
			aux.setPreco(perfume.getPreco());
		}
		return aux;
	}

	@Override
	public void delete(int id) {
		int posicao = -1;
			for (int i = 0; i < perfumes.size(); i++) {
				if (perfumes.get(i).getId() == id) {
					posicao = i;
					break;
				}
			}
		if(posicao >= 0)	
			perfumes.remove(posicao);
		
	}

}
