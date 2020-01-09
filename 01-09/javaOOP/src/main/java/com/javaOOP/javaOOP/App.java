package com.javaOOP.javaOOP;

import java.util.Date;

import com.javaOOP.Model.Empregado;
import com.javaOOP.Model.Gerente;
import com.javaOOP.Model.RhImpl;


public class App 
{
    public static void main( String[] args )
    {
    	Gerente valmir= new Gerente("Valmir", 15000.00, "Paulo");
    	Empregado[] lista = new Empregado[5];
    	lista[0]= new Empregado("Raul",4000.00);
    	lista[1]= new Empregado("Clara",6000.00);
    	lista[2]= new Empregado("Guilherme",4500.00);
    	lista[3]= new Empregado("Paulo",450.00);
    	lista[4]= valmir;
    	
    	System.out.println("secretario: "+valmir.getNomeSecretaria());
    	for(Empregado batatinha: lista) {
    		batatinha.imprimir();
    		System.out.println("---------------------"); 	
    	}
    	for (Empregado em: lista) {
			em.aumentarSalario(10);
			em.imprimir();
		} 	
    	RhImpl rhImpl= new RhImpl();
    	
    	System.out.println(rhImpl.contratar(lista[1]));
    	System.out.println(rhImpl.desligar(lista[2]));
    }
}
