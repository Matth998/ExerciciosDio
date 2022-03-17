package com.exercicicos.dio;

import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

public class Exercicio19 {

	public static void main(String[] args) {

		int num[][] = new int[4][4];
		Random gerador = new Random();

		for (int l = 0; l < num.length; l++) {

			for (int c = 0; c < num[l].length; c++) {

				num[l][c] = gerador.nextInt(9);

			}

		}

		for (int l = 0; l < num.length; l++) {

			for (int c = 0; c < num[l].length; c++) {

				System.out.print("[" + num[l][c] + "]");
			
			}
			System.out.println();
		}

	}

}
