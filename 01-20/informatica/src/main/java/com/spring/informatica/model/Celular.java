package com.spring.informatica.model;

public class Celular {
	private int id;
	private String nome;
	private String modelo;
	
	public Celular(int id, String nome, String modelo) {
		super();
		this.id = id;
		this.nome = nome;
		this.modelo = modelo;
	}
	public Celular() {
		super();
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
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
