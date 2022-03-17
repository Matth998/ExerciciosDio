package com.exercicicos.dio;

import java.util.Scanner;

/*
Fa�a um programa que pe�a uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inv�lido
e continue pedindo
at� que o usu�rio informe um valor v�lido.
*/

public class Exercicio11 {

	public static void main(String[] args) {
		
		double nota;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma nota de 0 a 10: ");
		nota = input.nextDouble();
		
		while(nota < 0 || nota > 10) {
			
			System.out.println("Nota inv�lida, digite novamente.");
			nota = input.nextDouble();
			
		}
		
		System.out.println("Obrigado.");
		input.close();
	}
	
}
