package com.exercicicos.dio;

import java.util.Scanner;

/*
Fa�a um programa que pe�a N n�meros inteiros,
calcule e mostre a quantidade de n�meros pares
e a quantidade de n�meros impares.
*/

public class Exercicio13 {

	public static void main(String[] args) {
		
		int num, par = 0, impar = 0;
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i <10; i++) {
			
			System.out.print("Digite um n�mero: ");
			num = input.nextInt();
			
			if(num%2 == 0) {
				
				par++;
				
			}else {
				
				impar++;
				
			}
			
		}
		
		System.out.println("Voc� digitou " + par + " n�meros pares e "
				+ impar + " n�meros impares.");
		
		input.close();
		
	}
	
}
