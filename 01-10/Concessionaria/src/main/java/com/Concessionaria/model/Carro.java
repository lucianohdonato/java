package com.Concessionaria.model;

import java.math.BigDecimal;

public class Carro extends Veiculo{
	private String tipoCombustivel;
	private String tipoCambio;
	private int quantidadePorta;
	
	
	
	public Carro() {
		super();
	}
	
	public Carro(BigDecimal preco, String nome, String marca, String modelo, int ano, String tipoCombustivel,
			String tipoCambio, int quantidadePorta) {
		super(preco, nome, marca, modelo, ano);
		this.tipoCombustivel = tipoCombustivel;
		this.tipoCambio = tipoCambio;
		this.quantidadePorta = quantidadePorta;
	}



	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public String getTipoCambio() {
		return tipoCambio;
	}
	public int getQuantidadePorta() {
		return quantidadePorta;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public void setTipoCambio(String tipoCambio) {
		this.tipoCambio = tipoCambio;
	}
	public void setQuantidadePorta(int quantidadePorta) {
		this.quantidadePorta = quantidadePorta;
	}

	
}
