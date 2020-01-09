package com.javaHeP.Model;

import com.javaHeP.Interface.Veiculo;

public class Carro extends Produto implements Veiculo {
	private String cor;
	private String placa;
	private String statusVenda;
	private int rodas = 4;
	
	public Carro(String nome, int id, double valor, int quantidade, String cor, String placa, String statusVenda) {
		super(nome, id, valor, quantidade);
		this.cor = cor;
		this.placa = placa;
		this.statusVenda = statusVenda;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getStatusVenda() {
		return statusVenda;
	}
	public void setStatusVenda(String statusVenda) {
		this.statusVenda = statusVenda;
	}
	public int getRodas() {
		return rodas;
	}
	public void setRodas(int rodas) {
		this.rodas = rodas;
	}

	public String vender(String status) {
		this.statusVenda = status;
		return "Carro vendido";
	}
	public int alterarQuantidade(int numeroVendido) {
		super.quantidade -= numeroVendido;
		return super.quantidade;
	}
}
