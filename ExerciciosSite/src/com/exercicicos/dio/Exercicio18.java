package com.exercicicos.dio;

import java.util.Random;

/*
Fa�a um Programa que leia 20 n�meros inteiros aleat�rios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os n�meros e seus sucessores.
*/

public class Exercicio18 {

	public static void main(String[] args) {
		
		int num[] = new int[20];
		Random gerador = new Random();
		
		for(int i = 0; i < num.length; i++) {
			
			num[i] = gerador.nextInt(100);
			
		}
		
		for(int i = 0; i < num.length; i++) {
			
			System.out.println(num[i]);
			System.out.println("O Sucessor desse n�mero �: " + (num[i] + 1));
		}

	}

}
