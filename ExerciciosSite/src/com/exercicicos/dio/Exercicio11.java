package com.exercicicos.dio;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class Exercicio11 {

	public static void main(String[] args) {
		
		double nota;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma nota de 0 a 10: ");
		nota = input.nextDouble();
		
		while(nota < 0 || nota > 10) {
			
			System.out.println("Nota inválida, digite novamente.");
			nota = input.nextDouble();
			
		}
		
		System.out.println("Obrigado.");
		input.close();
	}
	
}
