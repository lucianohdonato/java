package com.lojaInformatica.model;

import java.math.BigDecimal;

public class Produto {

	private BigDecimal preco;
	private String nome;
	
	public Produto() {
		super();
	}
	
	public Produto(BigDecimal preco, String nome) {
		super();
		this.preco = preco;
		this.nome = nome;
	}

	
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
