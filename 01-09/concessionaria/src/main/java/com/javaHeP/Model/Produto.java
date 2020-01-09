package com.javaHeP.Model;

public abstract class Produto {
	private String nome;
	private int id;
	private double valor;
	protected int quantidade;
	
	
	public Produto(String nome, int id, double valor, int quantidade) {
		super();
		this.nome = nome;
		this.id = id;
		this.valor = valor;
		this.quantidade = quantidade;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public void alterarPreco(double novoValor) {
		this.valor = novoValor;
		System.out.println("Valor do produto alterado para :" + this.valor);
	}
}
