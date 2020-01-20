package com.spring.perfumaria.model;

public class Perfume {
	private int id;
	private String nome;
	private int preco;
	
	public Perfume() {
		super();
	}

	public Perfume(String nome, int preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}
	
}
