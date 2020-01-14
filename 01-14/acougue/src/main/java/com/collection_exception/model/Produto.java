package com.collection_exception.model;

public class Produto {
	private int preco;
	private String nome;
	private int quantidade;
	
	public Produto() {
		super();
	}
	public Produto(int preco, String nome, int quantidade) {
		super();
		this.preco = preco;
		this.nome = nome;
		this.quantidade = quantidade;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return "Produto: nome = " + nome + ", preço = R$" + preco + ", quantidade = " + quantidade + "Kg.";
	}
	
	
	
}
