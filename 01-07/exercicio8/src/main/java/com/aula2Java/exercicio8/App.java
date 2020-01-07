package com.aula2Java.exercicio8;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sn = new Scanner(System.in);
    	 
        int n = 10;
        int v[] = new int[n];
        int i;

        for (i = 0; i < n; i++) {
          System.out.print("Informe " + (i+1) +  "º valor de " + n + ": ");
          v[i] = sn.nextInt();
        }

        int media = 0;
        int menor = v[0];
        int maior = v[0];
        for (i = 0; i < n; i++) {
     
          if (v[i] < menor)
             menor = v[i];
     
          if (v[i] > maior)
             maior = v[i];
        }

        System.out.printf("\n");
        for (i = 0; i < n; i++) {
          if (v[i] == menor) {
            System.out.print("v[" + i + "] = " + v[i] + " <--- menor valor\n");
	      } else if (v[i] == maior) {
	        	System.out.print("v[" + i + "] = " + v[i] + " <--- maior valor\n");
	      } else {
	        	System.out.print("v[" + i + "] = " + v[i] + "\n");
	      }
        }
        
        for (int item : v) {
			media += item;
		}
        media = media/10;
        System.out.print("\nMedia = " + media);
    }
}
