package com.exercicicos.dio;

import java.util.Scanner;

/*
Fa�a um programa que leia 5 n�meros
e informe o maior n�mero
e a m�dia desses n�meros.
*/

public class Exercicio12 {

	public static void main(String[] args) {

		double num, media = 0, soma = 0, maior = 0;
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.print("Digite um n�mero: ");
			num = input.nextDouble();

			if (num > maior) {

				maior = num;

			}

			soma += num;
			media++;

		}

		System.out.println("Maior n�mero digitado: " + maior);
		System.out.println("M�dia dos n�meros digitado: " + soma / media);

		input.close();

	}

}
