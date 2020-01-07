package com.aula2Java.exercicio7;

public class App 
{
    public static void main( String[] args )
    {
    	for (int i = 1; i <= 100; i++) {
    		System.out.print(i);
			if(i%10 == 0) {
				System.out.print(" =======> é multiplo de 10");
			}
			System.out.print("\n");
		}
    }
}
