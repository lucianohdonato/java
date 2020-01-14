package com.collection_exception.servicoVenda;

import java.util.List;

import com.collection_exception.model.Produto;

public class ServicoVenda implements IServicoVenda{

	public void addLista(List<Produto> produtos, Produto produto) {
		produtos.add(produto);
		
	}

	public void deletelista(List<Produto> produtos, Produto produto) {
		produtos.remove(produto);
		
	}

	public void getAllLista(List<Produto> produtos) {
		for (Produto i : produtos) {
			System.out.println(i);
		}
		
	}

}
