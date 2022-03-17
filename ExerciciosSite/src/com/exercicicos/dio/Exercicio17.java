package com.exercicicos.dio;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] consoante = new String[6];
		String letra;
		int contador = 0, quantidadeConsoante = 0;
		
		while(contador < consoante.length) {
			
			System.out.print("Digite uma letra: ");
			letra = input.next();
			
			if(!letra.equalsIgnoreCase("a") |
					letra.equalsIgnoreCase("e")|
					letra.equalsIgnoreCase("i")|
					letra.equalsIgnoreCase("o")|
					letra.equalsIgnoreCase("u")) {
				consoante[contador] = letra;
				quantidadeConsoante++;
			}
			contador++;
		}
		
		for(int i = 0; i < consoante.length; i++) {
			
			System.out.println(consoante[i]);
			
		}
		System.out.println("Total de consoante digitadas: " + quantidadeConsoante);
		input.close();
	}
	
}
