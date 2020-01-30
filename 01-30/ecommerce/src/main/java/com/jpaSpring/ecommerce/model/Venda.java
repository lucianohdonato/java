package com.jpaSpring.ecommerce.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "venda")
public class Venda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private float valor;
	
	@ManyToOne
	@JsonIgnoreProperties("venda")
	private Produto produto;
	
	@ManyToOne
	@JsonIgnoreProperties("venda")
	private Cliente cliente;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
