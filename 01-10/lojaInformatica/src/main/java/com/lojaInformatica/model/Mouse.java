package com.lojaInformatica.model;

import java.math.BigDecimal;

public class Mouse extends Periferico{
	private int dpi;
	private boolean botaoLateral;
	private boolean bluetooth;
	
	public Mouse() {
		super();
	}
	public Mouse(BigDecimal preco, String nome, String marca, String modelo, int ano, int dpi, boolean botaoLateral,
			boolean bluetooth) {
		super(preco, nome, marca, modelo, ano);
		this.dpi = dpi;
		this.botaoLateral = botaoLateral;
		this.bluetooth = bluetooth;
	}
	
	public int getDpi() {
		return dpi;
	}
	public void setDpi(int dpi) {
		this.dpi = dpi;
	}
	public boolean isBotaoLateral() {
		return botaoLateral;
	}
	public void setBotaoLateral(boolean botaoLateral) {
		this.botaoLateral = botaoLateral;
	}
	public boolean isBluetooth() {
		return bluetooth;
	}
	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}
}
