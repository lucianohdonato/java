package com.aula2Java.exercicio4;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sn = new Scanner(System.in);
    	
    	int numero1, numero2, operacao = -1;
    	double resultado = 0;
    	while (operacao != 0) {
    		numero2 = 0;
			System.out.println("\nEntre com o tipo de operação (Digite 0 para sair da calculadora):\n1 – Adição\r\n" + 
					"2 – Subtração\r\n" + 
					"3 – Multiplicação\r\n" + 
					"4 – Divisão");
			operacao = sn.nextInt();
			if (operacao == 0) {
				break;
			}
			if (operacao == 1) {
				System.out.print("Entre com o valor do primeiro número: ");
				numero1 = sn.nextInt();
				System.out.print("Entre com o valor do segundo número: ");
				numero2 = sn.nextInt();
				
				resultado = numero1 + numero2;
				System.out.print("O resultado da soma é: " + resultado + "\n");
			} else if (operacao == 2) {
				System.out.print("Entre com o valor do primeiro número: ");
				numero1 = sn.nextInt();
				System.out.print("Entre com o valor do segundo número: ");
				numero2 = sn.nextInt();
				
				resultado = numero1 - numero2;
				System.out.println("O resultado da subtração é: " + resultado + "\n");
			} else if (operacao == 3) {
				System.out.print("Entre com o valor do primeiro número: ");
				numero1 = sn.nextInt();
				System.out.print("Entre com o valor do segundo número: ");
				numero2 = sn.nextInt();
				
				resultado = numero1 * numero2;
				System.out.println("O resultado da multiplicação é: " + resultado + "\n");
			} else if (operacao == 4) {
				System.out.print("Entre com o valor do primeiro número: ");
				numero1 = sn.nextInt();
				while(numero2 == 0) {
					System.out.print("Entre com o valor do segundo número (considerando diferente de 0): ");
					numero2 = sn.nextInt();
				}
				
			
				resultado = ((double)numero1 / numero2);
				System.out.println("O resultado da divisão é: " + resultado + "\n");
			} else {
				System.out.println("Codigo invalido, entre com valor de 1 a 4 ou 0 para sair");
			}
		}
    }
}
