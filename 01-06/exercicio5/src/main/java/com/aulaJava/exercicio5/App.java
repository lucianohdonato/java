package com.aulaJava.exercicio5;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int idVendedor, idPeca, qtdPeca;
    	double precoPeca, valorComissao;
    	
    	Scanner sn = new Scanner(System.in);
        
        System.out.print( "Digite a identificação do vendedor: " );  
        idVendedor = sn.nextInt();
     	
     	System.out.print( "Digite o Id da peça: " );
     	idPeca = sn.nextInt();
     	
     	System.out.print( "Digite o preço unitário da peça: " );
     	precoPeca = sn.nextDouble();
     	
     	System.out.print( "Digite a quantidade de peças vendidas: " );
     	qtdPeca = sn.nextInt();
     	
     	valorComissao = (qtdPeca * precoPeca)*0.05;

     	System.out.print( "O valor da comissão é de " + valorComissao + " reais");
    }
}
