package com.aulaJava.exercicio3;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sn = new Scanner(System.in);
    	//double qtdMin, qtdMax, estoqueMedio;
    	
    	float estoque = 0, estoqueMedio = 0;
    	int i = 1;
        
        /*System.out.print( "Digite a quantidade minima: " );
        qtdMin = sn.nextDouble();
     	
     	System.out.print( "Digite a quantidade máxima: " );
     	qtdMax = sn.nextDouble();
     	
     	estoqueMedio = (qtdMin + qtdMax)/2;

     	System.out.print( "Estoque médio = " + estoqueMedio);*/
    	
    	while (estoque != 999) {
    		System.out.print("Entre com o estoque do lote " + i + ". (Digite 999 para sair): ");
    		estoque = sn.nextFloat();
    		if (estoque == 999) {
    			break;
    		}
    		estoqueMedio += estoque;
    		i++;
    	}
    	estoqueMedio = estoqueMedio/--i;
    	System.out.println("Estoque médio = " + estoqueMedio);
    }
}
