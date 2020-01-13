package com.lojaInformatica.modelCliente;

public class Cliente {
	private String nome;
	private String cpf;
	
	
	
	public Cliente() {
		super();
	}

	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
