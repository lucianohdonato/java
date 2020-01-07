package com.aula2Java.exercicio5;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sn = new Scanner(System.in);
    	
    	float numero1, numero2, vereficacao = -1;
    	while (vereficacao != 4) {
    		System.out.print("\nEntre com o valor do primeiro número: ");
    		numero1 = sn.nextFloat();
    		System.out.print("Entre com o valor do segundo número: ");
    		numero2 = sn.nextFloat();
    		
    		System.out.println("Entre com o tipo de verificação:\n" +
    				"1 – Verificar se um dos números lidos é ou não múltiplo do outro\r\n" + 
    				"2 – Verificar se os dois números lidos são pares\r\n" + 
    				"3 – Verificar se a média dos dois números é maior ou igual a 7\r\n" + 
    				"4 – Sair");
    		vereficacao = sn.nextInt();
    		
    		if (vereficacao == 1) {
    			if(numero1%numero2 == 0 || numero2%numero1 == 0) {
    				System.out.print("Um dos números lidos é multiplo do outro");
    			} else {
    				System.out.print("Nenhum dos números lidos é multiplo do outro");
    			}
			} else if (vereficacao == 2) {
				if(numero1%2 == 0 && numero2%2 == 0) {
					System.out.println("Os dois números são pares");
				} else {
					System.out.println("Pelo menos um dos números não é par");
				}
			} else if (vereficacao == 3) {
				if((numero1 + numero2)/2 >= 7) {
					System.out.println("Relação media dos números >= 7 verdadeira");
				} else {
					System.out.println("Relação media dos números >= 7 falsa");
				}
			} else if (vereficacao == 4) {
				
			} else {
				System.out.println("Codigo invalido, entre com valor de 1 a 4 ou 0 para sair");
			}
		}
    	
    }
}
