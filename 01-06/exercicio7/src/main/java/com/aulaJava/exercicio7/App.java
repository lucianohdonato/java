package com.aulaJava.exercicio7;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sn = new Scanner(System.in);
        
        int numero1, numero2;
        System.out.print("Digite o primeiro número: ");
        numero1 = sn.nextInt();
        System.out.print( "Digite osegundo número: " );
     	numero2 = sn.nextInt();
     	
     	System.out.print( "Igual = " + (numero1 == numero2) + "\n");
     	System.out.print( "Não igual = " + (numero1 != numero2) + "\n" );
     	System.out.print( "Maior = " + (numero1 > numero2) + "\n");
     	System.out.print( "Menor = " + (numero1 < numero2) + "\n");
     	System.out.print( "Maior ou igual = " + (numero1 >= numero2) + "\n");
     	System.out.print( "Menor ou igual = " + (numero1 <= numero2) + "\n");
     	
    }
}
