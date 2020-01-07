package com.aula2Java.exercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sn = new Scanner(System.in);
    	int numero;
    	String validacao = "s";
    	List<Integer> lista = new ArrayList<Integer>();
    	
    	do {
    		do {
    			System.out.print("\nEntre com valores de 100 a 200?: ");
    			numero = sn.nextInt();
			} while (numero < 100 || numero > 200);
    		
    		if(numero%2 != 0) {
    			lista.add(numero);
    		}
    		
    		do {
    			System.out.print("\nDeseja entrar com outro valor?\n('s' para Sim e 'n' para Não): ");
    			validacao = sn.next();
			} while (!((validacao.equals("s")) | (validacao.equals("n"))));
    		
		} while (!(validacao.equals("n")));
    	
    	System.out.print("\nOs numeros impares inseridos foram: ");
    	for (Integer item : lista) {
    		System.out.print(item + ", ");
		}
    }
}
