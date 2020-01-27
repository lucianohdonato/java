package com.jpa.escola.entity;

import javax.persistence.*;

@Entity
public class Turma {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTurma;
	
	private String nome;
	
	private String descricao;
	
	@ManyToOne
	private Turno turno;
	
	public int getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(int idProduto) {
		this.idTurma = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}
}
