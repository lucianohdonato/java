package com.Concessionaria.servicoVenda;

import com.Concessionaria.model.Veiculo;
import com.Concessionaria.modelCliente.Cliente;

public interface IServicoVenda {
	
	String venda(Veiculo produto, Cliente cliente);
	
	String cancelarVenda(Veiculo produto,Cliente cliente);
}
