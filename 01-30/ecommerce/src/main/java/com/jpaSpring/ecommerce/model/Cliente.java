package com.jpaSpring.ecommerce.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "usuario")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 100)
	private String nome;
	
	@Column(length = 100)
	private String email;
	
	@Column(length = 30)
	private String senha;

	private float carteira;
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("cliente")
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public float getCarteira() {
		return carteira;
	}

	public void setCarteira(float carteira) {
		this.carteira = carteira;
	}

	public List<Venda> getVenda() {
		return venda;
	}

	public void setVenda(List<Venda> venda) {
		this.venda = venda;
	}
	
	
}
