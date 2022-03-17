package com.exercicicos.dio;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer n�mero inteiro entre 1 a 10.
O usu�rio deve informar de qual numero ele deseja ver a tabuada.
A sa�da deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("Digite o n�mero que voc� deseja ver a tabuada: ");
		num = input.nextInt();

		for (int i = 1; i <= 10; i++) {

			System.out.println(num + " x " + i + " = " + num * i);

		}

		input.close();
		
	}

}
