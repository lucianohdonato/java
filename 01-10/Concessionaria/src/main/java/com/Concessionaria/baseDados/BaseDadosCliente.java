package com.Concessionaria.baseDados;

import com.Concessionaria.modelCliente.Cliente;

public class BaseDadosCliente {
	private Cliente[] listaClientes;

	public BaseDadosCliente() {
		listaClientes= new Cliente[2];
		
		listaClientes[0]= new Cliente("Lucas", "421");
		listaClientes[1]= new Cliente("Ali", "431");			
		
	}

	public Cliente[] getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(Cliente[] listaClientes) {
		this.listaClientes = listaClientes;
	}
	
	

}
