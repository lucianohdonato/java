package com.Concessionaria.model;

import java.math.BigDecimal;

public class Produto {
	
	public Produto() {
		super();
	}
	
	public Produto(BigDecimal preco, String nome) {
		super();
		this.preco = preco;
		this.nome = nome;
	}


	private BigDecimal preco;
	private String nome;
	
	public BigDecimal getPreco() {
		return preco;
	}
	public String getNome() {
		return nome;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

	
	
}
