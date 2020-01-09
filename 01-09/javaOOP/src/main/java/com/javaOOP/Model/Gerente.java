package com.javaOOP.Model;

public class Gerente extends Empregado{

	private String nomeSecretaria;
	
	public Gerente(String nome, double salario, String nomeSecretaria) {
		super(nome, salario);
		this.nomeSecretaria = nomeSecretaria;
	}

	public String getNomeSecretaria() {
		return nomeSecretaria;
	}

	public void setNomeSecretaria(String nomeSecretaria) {
		this.nomeSecretaria = nomeSecretaria;
	}
	

	public void aumentarSalario(double percentual) {
		double bonus= 20;
		super.aumentarSalario(percentual+ bonus);
	}
	
}
