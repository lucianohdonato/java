package com.javaOO.Pet_Shop.Model;

public class Animal {
	private String nome;
	private String animal;
	private String raca;
	private int idade;
	private String sexo;
	private int id;
	
	public Animal(String nome, String animal, String raca, int idade, String sexo, int id) {
		this.nome = nome;
		this.animal = animal;
		this.raca = raca;
		this.idade = idade;
		this.sexo = sexo;
		this.id = id;
	}
	public Animal() {
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void banhar() {
		System.out.println("banho no " + this.nome);
	}
	public void tosar() {
		System.out.println(this.nome + " tosado");
	}
	public void operar() {
		System.out.println(this.nome + " operado");
	}
	public void vacinar() {
		System.out.println(this.nome + " vacinado");
	}
}
