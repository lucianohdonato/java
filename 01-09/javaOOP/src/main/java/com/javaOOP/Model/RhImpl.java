package com.javaOOP.Model;

import com.javaOOP.Interface.ServicoRh;

public class RhImpl implements ServicoRh {

	public String contratar(Empregado contrato) {
		String mensagem= contrato.getNome()+" contratado.";
		return mensagem;
	}

	public String desligar(Empregado contrato) {
		String mensagem= contrato.getNome()+ " desligado.";
		return mensagem;
	}

}
