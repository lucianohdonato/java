package com.generation.primeiroPrograma;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Comentarios // ou /**/
    	
    	//Declaração de Variaveis
    	int teste;
    	
    	//Tipos de Variaveis
    	int a = 0; // Numeros Inteiros. Exemplo: 1, 100, -5, 0
    	float b = 0; // Numeros Inteiros e Quebrados. Exemplo: 1.5, 0
    	double c = 0; // Numeros Inteiros e Quebrados com maior capacidade. Exemplo: 1.5, 0
    	boolean d = false; //Verdadeiro ou Falso
    	char e = 'a'; // 1 Caractere
    	String f = "Texto"; // Texto
    	int g, h;
    	int i = 0, j = 1;
    	Date jj ; //Tipo Data
    	Calendar dd; // Evolução do tipo Date
    	
    	//Atribuir Valor a Variavel
    	a = 123;
    	
    	//Incremento e Decremento de Valores em variveis
    	i++; // i = i + 1
    	i+=10; // i = i + 10; 
    	i--; // i = i - 1
    	
    	//if/else (se/Senão)
    	if(i < 10) {
    		
    	} else if(i > 10) {
    		
    	} else {
    		
    	}
    	
    	// Swith case
    	switch (i) {
		case 1: 
			System.out.println("Valor é 1");
			System.out.println("Valor não é 0");
			break;
			
		case 2:
		case 3:
			System.out.println("Valor é 1");
			System.out.println("Valor não é 0");
			//Comando
		break;

		default:
			System.out.println("Quando não atender nenhum dos case");
			break;
		}
    	
    	//Laços de Repetição
    	//for
    	for (int k = 0; k < 100; k++) {
			String string = args[k];
			
			//instruções
			if(k == 3)
				continue; //Passa para o proximo indice do loop
			
			//Não faça para o 3
			
			if(k == 5)
				break; //Interrompe o loop no 5
			
		}
    	
    	//While (Verifica a condição primeiro. depois executa)
    	a = 123;
    	while (a != 123) { 
			//Nunca entrará
		}
    	
    	//do while (executa, depois Verifica a condição)
    	do {
			//Entrar 1 vez
		} while (a != 123);
    	
    	//foreach
    	for (String item : args) { //Usa quando quer varrer todos os elementos do Array
			
		}
    	
    	//Comparação
    	// == igualdade
    	// != Diferença
    	// > Maior
    	// >= Maior ou Igual
    	// < Menor
    	// <= Menor ou Igual
    	
    	// &&	e  (a > 0) e (a < 3)
    	// ||	ou 	(a > 0) ou (a < 3)
    	
    	//Array ou Vetor
    	int[] ar;
    	
    	
    	
    	//Comandos
    	System.out.print(b); //Escrever na console
    	System.out.println(b); //Escrever na console e pula o cursor na linha seguinte

    	
    	Scanner sn = new Scanner(System.in); //Ler da console
    	f = sn.nextLine(); //Ler texto digitado
    	i = sn.nextInt(); //Ler valor do tipo inteiro
    	c = sn.nextDouble(); //Ler valor do tipo double
    	
    }
    
}










