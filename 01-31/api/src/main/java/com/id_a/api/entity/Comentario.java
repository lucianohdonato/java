package com.id_a.api.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Comentario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idComentario;
	
	@Column(length = 1000)
	private String texto;
	
	@ManyToOne
	@JsonIgnoreProperties(value = {"post", "senha", "comentario", "comunidade", "telefone", "email"})
	private Usuario usuario;
	
	@ManyToOne
	@JsonIgnoreProperties(value = {"texto", "linkimg", "dataInclusao", "usuario", "comentario", "comunidade", "comentario"})
	private Post post;

	public int getIdComentario() {
		return idComentario;
	}

	public void setIdComentario(int idComentario) {
		this.idComentario = idComentario;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}
	
}
