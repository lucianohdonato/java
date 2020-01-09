package com.javaHeP.Model;

public class CarroEsportivo extends Carro{
	private int velocicdadeMaxima;
	private String motor;
	
	public CarroEsportivo(String nome, int id, double valor, int quantidade, String cor, String placa,
			String statusVenda, int rodas, int velocicdadeMaxima, String motor) {
		super(nome, id, valor, quantidade, cor, placa, statusVenda);
		this.velocicdadeMaxima = velocicdadeMaxima;
		this.motor = motor;
	}

	public int getVelocicdadeMaxima() {
		return velocicdadeMaxima;
	}
	public void setVelocicdadeMaxima(int velocicdadeMaxima) {
		this.velocicdadeMaxima = velocicdadeMaxima;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	public int alterarQuantidade(int numeroVendido) {
		super.quantidade -= numeroVendido;
		System.out.println("Conseguimos vender 1 esportivo");
		return super.quantidade;
	}
}
