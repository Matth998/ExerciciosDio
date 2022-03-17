package com.exercicicos.dio;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Exercicio12 {

	public static void main(String[] args) {

		double num, media = 0, soma = 0, maior = 0;
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.print("Digite um número: ");
			num = input.nextDouble();

			if (num > maior) {

				maior = num;

			}

			soma += num;
			media++;

		}

		System.out.println("Maior número digitado: " + maior);
		System.out.println("Média dos números digitado: " + soma / media);

		input.close();

	}

}
