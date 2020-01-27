package com.jpa.escola.entity;

import javax.persistence.*;

@Entity
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAluno;
	
	private String nome;
	
	@ManyToOne
	private Turma turma;

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idProduto) {
		this.idAluno = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
}
