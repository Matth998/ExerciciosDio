package com.exercicicos.dio;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Exercicio13 {

	public static void main(String[] args) {
		
		int num, par = 0, impar = 0;
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i <10; i++) {
			
			System.out.print("Digite um número: ");
			num = input.nextInt();
			
			if(num%2 == 0) {
				
				par++;
				
			}else {
				
				impar++;
				
			}
			
		}
		
		System.out.println("Você digitou " + par + " números pares e "
				+ impar + " números impares.");
		
		input.close();
		
	}
	
}
