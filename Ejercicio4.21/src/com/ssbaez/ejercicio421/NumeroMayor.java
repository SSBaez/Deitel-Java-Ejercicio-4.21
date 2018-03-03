package com.ssbaez.ejercicio421;

import java.util.Scanner;

public class NumeroMayor {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int contador = 0;
		int numero = 0;
		int mayor = 0;
		int i = 1;
		
		System.out.println("Programa que lee 10 numeros y determina cual es el mayor\n");
		
		while(contador < 10){
			
			System.out.printf("%d.-Ingrese el numero:", i++);
			numero = input.nextInt();
			
			if(numero > mayor){
				
				mayor = numero;
				
			}
			
			contador++;
		}
		
		System.out.printf("El numero mayor es: %d", mayor);
		
	}

}
