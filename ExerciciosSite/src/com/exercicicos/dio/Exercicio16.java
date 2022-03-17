package com.exercicicos.dio;

import java.util.Random;
import java.util.Scanner;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Exercicio16 {

	public static void main(String[] args) {
		
		int vetor[] = new int[6];
		Scanner input = new Scanner(System.in);
		Random gerador = new Random();
		
		for(int i = 0; i < vetor.length; i++) {
			
			vetor[i] = gerador.nextInt(100);
			System.out.println(vetor[i]);
			
		}
		
		
		System.out.println();
		
		for(int i = (vetor.length -1); i >= 0; i--) {
			
			System.out.println(vetor[i]);
			
		}
		
		input.close();
	}
	
}
