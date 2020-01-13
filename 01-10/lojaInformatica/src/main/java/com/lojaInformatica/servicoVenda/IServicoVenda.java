package com.lojaInformatica.servicoVenda;

import com.lojaInformatica.model.Periferico;
import com.lojaInformatica.modelCliente.Cliente;
import com.lojaInformatica.modelVendedor.Vendedor;

public interface IServicoVenda {
	
	String venda(Periferico produto, Cliente cliente, Vendedor vendedor);
	
	String cancelarVenda(Periferico produto,Cliente cliente, Vendedor vendedor);
}