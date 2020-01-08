package com.javaOO.classSocio;

import java.util.Date;

public class Socio {
	private String nome;
	private String cpf;
	private String rg;
	private Date nascimento;
	private Integer telefone;
	private String endereco;
	
	public Socio(String nome, String cpf, String rg, Date nascimento, Integer telefone, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.nascimento = nascimento;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public Socio() {
		
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void cadastrar(String nome, String rg) {
		this.setNome(nome);
		this.setRg(rg);
		System.out.println("Usuario: " + this.getNome() + " rg: " + this.getRg() + " cadastrado");
	}
	public void confirmarCadstro() {
		if (this.getNome ()!=null && this.getRg ()!=null) {
			System.out.println("cadastro confirmado");
		} else {
			System.out.println("cadastro não efetuado corretamente");
		}
	}
	public void validarSocio(String nome, String rg) {
		if (this.getNome().equals(nome) && this.getRg().equals(rg)) {
			System.out.println("Socio confirmado");
		} else {
			System.out.println("Socio não presente no banco de dados");
		}
	}
	public void alterar() {
		
	}
	
}
