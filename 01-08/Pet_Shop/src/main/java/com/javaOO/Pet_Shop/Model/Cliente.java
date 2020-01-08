package com.javaOO.Pet_Shop.Model;

public class Cliente {
	private int id;
	private String nome;
	private int idAnimal;
	private String endereco;
	private int telefone;
	
	public Cliente(int id, String nome, int idAnimal, String endereco, int telefone) {
		this.id = id;
		this.nome = nome;
		this.idAnimal = idAnimal;
		this.endereco = endereco;
		this.telefone = telefone;
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
	public int getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public void confirmarDados() {
		System.out.println("id: " + this.id + "\n" +
		"nome: " + this.nome + "\n" +
		"idAnimal: " + this.idAnimal + "\n" +
		"endereço: " + this.endereco + "\n" +
		"telefone: " + this.telefone);
	}
	public void atualizarCadastro() {
		
	}
}
