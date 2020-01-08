package com.javaOO.classProduto;

import java.util.Date;

public class Produto {
	private int codigo;
	private String nome;
	private String descricao;
	private double preco_compra;
	private double preco_venda;
	private int quantidade_estoque;
	private boolean ativo;
	private Date data_cadastro;
	
	public Produto(int codigo, String nome, String descrecao, double preco_compra, double preco_venda,
			int quantidade_estoque, boolean ativo, Date data_cadastro) {
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descrecao;
		this.preco_compra = preco_compra;
		this.preco_venda = preco_venda;
		this.quantidade_estoque = quantidade_estoque;
		this.ativo = ativo;
		this.data_cadastro = data_cadastro;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrecao() {
		return descricao;
	}
	public void setDescrecao(String descrecao) {
		this.descricao = descrecao;
	}
	public double getPreco_compra() {
		return preco_compra;
	}
	public void setPreco_compra(float preco_compra) {
		this.preco_compra = preco_compra;
	}
	public double getPreco_venda() {
		return preco_venda;
	}
	public void setPreco_venda(float preco_venda) {
		this.preco_venda = preco_venda;
	}
	public int getQuantidade_estoque() {
		return quantidade_estoque;
	}
	public void setQuantidade_estoque(int quantidade_estoque) {
		this.quantidade_estoque = quantidade_estoque;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public Date getData_cadastro() {
		return data_cadastro;
	}
	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}
	
	public void inserir() {
		
	}
	
	public void alterar(String campo, int valor) {
		if (campo == "codigo") {
			this.codigo = valor;
		} else if (campo == "quantidade de estoque"){
			this.quantidade_estoque = valor;
		}
	}
	public void alterar(String campo, String valor) {
		if (campo == "nome") {
			this.nome = valor;
		} else if (campo == "descrição") {
			this.descricao = valor;
		}
	}
	public void alterar(String campo, double valor) {
		if (campo == "preço de compra") {
			this.preco_compra = valor;
		} else if (campo == "preço de venda") {
			this.preco_venda = valor;
		}
	}
	public void alterar(String campo, boolean valor) {
		if (campo == "ativo") {
			this.ativo = valor;
		}
	}
	public void alterar(String campo, Date valor) {
		if (campo == "data de cadastro") {
			this.data_cadastro = valor;
		}
	}
	
	public void excluir() {
		
	}
	public void pesquisar() {
		
	}
}
