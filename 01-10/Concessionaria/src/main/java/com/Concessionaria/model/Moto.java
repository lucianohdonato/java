package com.Concessionaria.model;

import java.math.BigDecimal;

public class Moto extends Veiculo{
	private String tamanhoBau;
	private int cilindrada;
	private String capacidadeTanque;
	
	public Moto() {
		super();
	}
	
	public Moto(BigDecimal preco, String nome, String marca, String modelo, int ano, String tamanhoBau, int cilindrada,
			String capacidadeTanque) {
		super(preco, nome, marca, modelo, ano);
		this.tamanhoBau = tamanhoBau;
		this.cilindrada = cilindrada;
		this.capacidadeTanque = capacidadeTanque;
	}




	public String getTamanhoBau() {
		return tamanhoBau;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public String getCapacidadeTanque() {
		return capacidadeTanque;
	}
	public void setTamanhoBau(String tamanhoBau) {
		this.tamanhoBau = tamanhoBau;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public void setCapacidadeTanque(String capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	
}
