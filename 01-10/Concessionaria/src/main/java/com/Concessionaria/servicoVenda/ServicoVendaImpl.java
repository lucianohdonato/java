package com.Concessionaria.servicoVenda;

import com.Concessionaria.model.Veiculo;
import com.Concessionaria.modelCliente.Cliente;

public class ServicoVendaImpl implements IServicoVenda {
	
	
	public String venda(Veiculo produto, Cliente cliente) {
		String mensagem= "Cliente: "+cliente.getNome()+" comprando veiculo "+produto.getNome()+" marca: "+produto.getMarca()+" modelo: "+produto.getModelo();
		return mensagem;
	}

	public String cancelarVenda(Veiculo produto, Cliente cliente) {
		String mensagem="Cliente: "+cliente.getNome()+" cancelando a compra de um produto tipo"+produto.getNome()+" veiculo: marca "+produto.getMarca();
		return mensagem;
	}

}
