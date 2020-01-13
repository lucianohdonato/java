package com.lojaInformatica.baseDados;

import com.lojaInformatica.modelCliente.Cliente;

public class BaseDadosCliente {
	private Cliente[] listaClientes;

	public BaseDadosCliente() {
		listaClientes = new Cliente[2];
		
		listaClientes[0] = new Cliente("Luciano", "123.456");
		listaClientes[1] = new Cliente("Henrique", "456.789");			
		
	}

	public Cliente[] getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(Cliente[] listaClientes) {
		this.listaClientes = listaClientes;
	}
}
