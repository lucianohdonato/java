package com.collection_exception.servicoVenda;

import java.util.List;

import com.collection_exception.model.Produto;

public interface IServicoVenda {
	void addLista (List<Produto> produtos, Produto produto);
	void deletelista(List<Produto> produtos, Produto produto);
	void getAllLista(List<Produto> produtos);
}
