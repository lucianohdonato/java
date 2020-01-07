package com.aula2Java.exercicio2;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sn = new Scanner(System.in);
    	
    	int numero = 1;
    	while (numero != 0) {
			System.out.print("Entre com um número (Digite 0 para sair): ");
			numero = sn.nextInt();
			if (numero == 0) {
				break;
			}
			if (numero < 0) {
				System.out.println("Número negativo");
			} else {
				System.out.println("Número positivo");
			}
		}
    }
}

