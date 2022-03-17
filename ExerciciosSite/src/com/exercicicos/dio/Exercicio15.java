package com.exercicicos.dio;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o número que deseja ver a fatoral: ");
		int num = input.nextInt();
		int fatoral = 1, contador = num;
		
		for(int i = 0; i < num; i++) {
			
			fatoral *= contador;
			contador--;
			
		}
		
		System.out.println("A faltoral de " + num +" é " + fatoral);
		input.close();
	}
	
}
