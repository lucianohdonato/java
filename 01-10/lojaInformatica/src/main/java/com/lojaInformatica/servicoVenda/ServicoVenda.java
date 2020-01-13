package com.lojaInformatica.servicoVenda;

import com.lojaInformatica.model.Periferico;
import com.lojaInformatica.modelCliente.Cliente;
import com.lojaInformatica.modelVendedor.Vendedor;

public class ServicoVenda implements IServicoVenda{
	public String venda(Periferico produto, Cliente cliente, Vendedor vendedor) {
		String mensagem = "Cliente: " + cliente.getNome() + " comprando periferico " + produto.getNome() + " marca: " + produto.getMarca() + " modelo: " + produto.getModelo() + " do vendedor: " + vendedor.getNome() + " de id: " + vendedor.getId();
		return mensagem;
	}

	public String cancelarVenda(Periferico produto, Cliente cliente, Vendedor vendedor) {
		String mensagem = "Cliente: " + cliente.getNome() + " cancelando a compra do produto: " + produto.getNome() + " marca: " + produto.getMarca() + ". Cancelamente recebido pelo vendedor: " + vendedor.getNome() ;
		return mensagem;
	}

}
