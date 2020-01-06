package com.aulaJava.exercicio8;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sn = new Scanner(System.in);
        
        int idade;
        System.out.print("Digite a idade do nadador: ");
        idade = sn.nextInt();
        if (idade < 5) {
        	System.out.print("Nenhuma categoria válida para crianças abaixo de 5 anos");
        } else if (idade <= 7){
        	System.out.print("Categoria: Infantil A");
        } else if (idade <= 11){
        	System.out.print("Categoria: Infantil B");
        } else if (idade <= 13){
        	System.out.print("Categoria: Juvenil A");
        } else if (idade <= 17){
        	System.out.print("Categoria: Juvenil B");
        } else {
        	System.out.print("Categoria: Adultos");
        }
    }
}
