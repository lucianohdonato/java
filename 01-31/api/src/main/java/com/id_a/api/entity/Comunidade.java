package com.id_a.api.entity;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Comunidade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idComunidade;
	
	@Column(length = 255)
	private String nome;
	
	@ManyToOne
	@JsonIgnoreProperties(value = {"post", "senha", "comentario", "comunidade", "telefone", "email"})
	private Usuario usuario;
	
	@OneToMany(mappedBy = "comunidade", cascade = CascadeType.ALL)
	@JsonIgnoreProperties(value = {"texto", "linkimg", "dataInclusao", "usuario", "comentario", "comunidade", "comentario"})
	private List<Post> post;
	

	@ManyToOne
	@JsonIgnoreProperties("comunidade")
	private Categoria categoria;

	public int getIdComunidade() {
		return idComunidade;
	}

	public void setIdComunidade(int idComunidade) {
		this.idComunidade = idComunidade;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Post> getPost() {
		return post;
	}

	public void setPost(List<Post> post) {
		this.post = post;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
