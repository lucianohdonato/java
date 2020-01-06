package com.aulaJava.exercicio1;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int idade, idadeMae, diferencaIdade;
        
        System.out.println( "Digite a sua idade:" );
        Scanner sn = new Scanner(System.in);  
    	idade = sn.nextInt();
    	
    	System.out.println( "Digite a idade da sua mãe:" );
    	idadeMae = sn.nextInt();
    	
    	diferencaIdade = idadeMae - idade;

    	System.out.println( "Sua mãe é " + diferencaIdade + " anos mais velha que você!" );
    }
}
