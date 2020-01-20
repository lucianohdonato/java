package com.spring.informatica.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.spring.informatica.model.Celular;
import com.spring.informatica.service.CelularService;

public class CelularServiceImpl implements CelularService{

	static List<Celular> celulares = new ArrayList<Celular>();
	private static int incr = 0;
	
	@Override
	public Celular insert(Celular celular) {
		for (Celular item : celulares) {
			if (item.getNome().equals(celular.getNome()) & item.getModelo().equals(celular.getModelo())) {
				return null;
			}
		}
		
		incr++;
		celular.setId(incr);
		this.celulares.add(celular);
		return celular;
	}

	@Override
	public Celular update(Celular celular) {
		Celular aux = getById(celular.getId());
		if (aux != null) {
			aux.setNome(celular.getNome());
			aux.setModelo(celular.getModelo());
		}
		
		return null;
	}

	@Override
	public void delete(int id) {
		int posicao = -1;
		for (int i = 0; i < celulares.size(); i++) {
			if (this.celulares.get(i).getId() == id ) {
				posicao = i;
				break;
			}
		}
		celulares.remove(posicao);
		
	}

	@Override
	public Celular getById(int id) {
		for (Celular celular : celulares) {
			if (celular.getId() == id) {
				return celular;
			}
		}
		return null;
	}

	@Override
	public List<Celular> getAll() {
		return celulares;
	}

}
