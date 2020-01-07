package com.aula2Java.exercicio3;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sn = new Scanner(System.in);
    	
    	int numero = 1, A = 0, B = 0;
    	while (numero != 0) {
			System.out.print("Entre com um número (Digite 0 para sair): ");
			numero = sn.nextInt();
			if (numero == 0) {
				break;
			}
			if (numero < 0) {
				B += numero;
				System.out.print("Números negativo\n");
			} else {
				A += numero;
				System.out.print("Números positivo\n");
			}
		}
    	System.out.println("Soma dos números positivos: " + A);
    	System.out.println("Soma dos números negativos : " + B);
    }
}
