package com.lojaInformatica.model;

import java.math.BigDecimal;

public class Headphone extends Periferico{
	private boolean microfoneIntegrado;
	private boolean bluetooth;
	private String tipo;
	
	public Headphone() {
		super();
	}

	public Headphone(BigDecimal preco, String nome, String marca, String modelo, int ano, boolean microfoneIntegrado,
			boolean bluetooth, String tipo) {
		super(preco, nome, marca, modelo, ano);
		this.microfoneIntegrado = microfoneIntegrado;
		this.bluetooth = bluetooth;
		this.tipo = tipo;
	}

	public boolean isMicrofoneIntegrado() {
		return microfoneIntegrado;
	}

	public void setMicrofoneIntegrado(boolean microfoneIntegrado) {
		this.microfoneIntegrado = microfoneIntegrado;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
