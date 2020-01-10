package com.Concessionaria.baseDados;

import java.math.BigDecimal;

import com.Concessionaria.model.Moto;

public class BaseDadosMoto {
	private Moto[] listaMotos;

	public BaseDadosMoto() {
		listaMotos= new Moto[2];
		
		listaMotos[0]= new Moto(new BigDecimal(6000), "Moto", "Yamaha", "Fazer 250", 2017, "Grande", 200, "grande");
		listaMotos[1]= new Moto(new BigDecimal(6000), "Moto", "Yamaha", "Xj", 2018, "pequeno", 200, "pequeno");
	}

	public Moto[] getListaMotos() {
		return listaMotos;
	}

	public void setListaMotos(Moto[] listaMotos) {
		this.listaMotos = listaMotos;
	}
	
	

}
