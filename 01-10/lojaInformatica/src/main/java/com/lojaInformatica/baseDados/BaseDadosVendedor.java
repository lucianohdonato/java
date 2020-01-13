package com.lojaInformatica.baseDados;

import com.lojaInformatica.modelVendedor.Vendedor;

public class BaseDadosVendedor {
	private Vendedor[] listaVendedores;
	
	public BaseDadosVendedor() {
		listaVendedores = new Vendedor[2];
		
		listaVendedores[0] = new Vendedor("Lucas", 123);
		listaVendedores[1] = new Vendedor("Ali", 321);
	}

	public Vendedor[] getListaVendedores() {
		return listaVendedores;
	}

	public void setListaVendedores(Vendedor[] listaVendedores) {
		this.listaVendedores = listaVendedores;
	}
	
}
