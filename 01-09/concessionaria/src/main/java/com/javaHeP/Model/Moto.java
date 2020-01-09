package com.javaHeP.Model;

import com.javaHeP.Interface.Veiculo;

public class Moto extends Produto implements Veiculo{

	public Moto(String nome, int id, double valor, int quantidade) {
		super(nome, id, valor, quantidade);
		// TODO Auto-generated constructor stub
	}

	public String vender(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	public int alterarQuantidade(int numeroVendido) {
		// TODO Auto-generated method stub
		return 0;
	}

}
