package com.lojaInformatica.modelVendedor;

public class Vendedor {
	private String nome;
	private int id;
	
	public Vendedor(String nome, int id) {
		super();
		this.nome = nome;
		this.id = id;
	}
	public Vendedor() {
		super();
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
	
}
