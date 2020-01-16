package com.aulaSpring.computador.models;

public class Monitor {
	private String nome;
	private String marca;
	private int preco;
	
	public Monitor(String nome, String marca, int preco) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}
	
}
