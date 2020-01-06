package com.aulaJava.exercicio4;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	double cotacao, valorDolar, valorReal;
    	
    	Scanner sn = new Scanner(System.in);
        
        System.out.print( "Digite a cotação do dolar: " );  
        cotacao = sn.nextDouble();
     	
     	System.out.print( "Digite o valor em dolar: " );
     	valorDolar = sn.nextDouble();
     
     	valorReal = (cotacao * valorDolar);

     	System.out.print( "O valor em reais é " + valorReal);
    }
}
