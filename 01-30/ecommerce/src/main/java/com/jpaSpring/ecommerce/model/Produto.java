package com.jpaSpring.ecommerce.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 100)
	private String nome;
	
	private int quantidade;
	private float preco;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Departamento departamento;
	
	@OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("produto")
	private List<Venda> venda;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Venda> getVenda() {
		return venda;
	}

	public void setVenda(List<Venda> venda) {
		this.venda = venda;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
