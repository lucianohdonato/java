package com.javaOO.Pet_Shop.Model;

public class Produto {
	private String nome;
	private String marca;
	private String animal;
	private double preco;
	private int quantidade;
	private String local;
	private int id;
	
	public Produto(String nome, String marca, String animal, double preco, int quantidade, String local, int id) {
		this.nome = nome;
		this.marca = marca;
		this.animal = animal;
		this.preco = preco;
		this.quantidade = quantidade;
		this.local = local;
		this.id = id;
	}
	
	public Produto() {
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

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void cadastrarProduto() {
		System.out.println("Alocado no banco de dados");
	}
	public void trocarlugar(String lugar) {
		System.out.println("Trocando " + this.nome + " do lugar '" + this.local + "' para '" + lugar + "'");
		this.local = lugar;
	}
	public void adicionarQuantidade(int quantidadeComprada) {
		this.quantidade += quantidadeComprada;
	}
	public void retirarUnidades(int quantidadeVendida) {
		this.quantidade -= quantidadeVendida;
	}
}
