package com.lojaInformatica.model;

import java.math.BigDecimal;

public class Periferico extends Produto{

	public Periferico() {
		super();
	}	
	
	public Periferico(BigDecimal preco, String nome, String marca, String modelo, int ano) {
		super(preco, nome);
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}


	private String marca;
	private String modelo;
	private int ano;
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
}
