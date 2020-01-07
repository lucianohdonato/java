package com.aula2Java.exercicio1;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sn = new Scanner(System.in);
        int[] numero = {-273510, -273510, -273510, -273510, -273510, -273510, -273510, -273510, -273510, -273510};
        int auxiliar, verifica;
        for (int i = 0; i < numero.length - 1; i++) {
        	System.out.print("Insira números na lista, digite 999 para parar: ");
        	verifica = sn.nextInt();
        	if (verifica == 999) {
        		break;
        	}
			numero[i] = verifica;
		}
        for (int i = 0; i < (numero.length - 1); i++) {
        	if(numero[i] == -273510) {
    			break;
    		}
        	for (int j = (i + 1); j < numero.length; j++) {
        		if(numero[j] == -273510) {
        			break;
        		}
        		if( numero[i] < numero[j] ) {
    				auxiliar = numero[i];
    				numero[i] = numero[j];
    				numero[j] = auxiliar;
    			}
        	}
			
		}
        for (int item : numero) {
        	if(item == -273510) {
    			break;
    		}
			System.out.print(item + ", ");
		}
    }
}
