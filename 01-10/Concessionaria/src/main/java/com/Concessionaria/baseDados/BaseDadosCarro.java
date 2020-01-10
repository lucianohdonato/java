package com.Concessionaria.baseDados;

import java.math.BigDecimal;

import com.Concessionaria.model.Carro;

public class BaseDadosCarro {
	private Carro[] listaCarros;

	public BaseDadosCarro() {
		listaCarros= new Carro[3];
		
		listaCarros[0]= new Carro(new BigDecimal(200000), "Carro", "Bmw", "bmw", 2019, "Fusao nuclear", "automatico", 4);
		listaCarros[1]= new Carro(new BigDecimal(4000), "Carro", "fiat", "uno", 2006, "gasolina", "manual", 2);
		listaCarros[2]= new Carro(new BigDecimal(10000), "Carro", "Gm", "celta", 2002, "gasolina", "manual", 2);
	}

	public Carro[] getListaCarros() {
		return listaCarros;
	}

	public void setListaCarros(Carro[] listaCarros) {
		this.listaCarros = listaCarros;
	}
	
	
	
	
	
	
	
}
