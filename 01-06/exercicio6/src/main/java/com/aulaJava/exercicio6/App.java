package com.aulaJava.exercicio6;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int anos, meses, dias, idadeTotal;
    	
    	Scanner sn = new Scanner(System.in);
        
        System.out.print( "Digite os anos: " );  
        anos = sn.nextInt();
     	
     	System.out.print( "Digite os meses: " );
     	meses = sn.nextInt();
     	
     	System.out.print( "Digite os dias: " );
     	dias = sn.nextInt();
     	
     	idadeTotal = (anos * 365) + (meses * 30) + dias;

     	System.out.print( "Idade total em dias = " + idadeTotal);
    }
}
