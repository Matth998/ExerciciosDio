package com.exercicicos.dio;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println(
				"Escolha a operação que deseja fazer! |1- Soma| 2 - Subtração " + "| 3 - Multiplicação | 4 - Divisão");
		int escolha = entrada.nextInt();
		System.out.print("Digite o primeiro número: ");
		double n1 = entrada.nextDouble();
		System.out.print("Digite o segundo número: ");
		double n2 = entrada.nextDouble();

		calculo(escolha, n1, n2);

		System.out.print("Digite o horario atual:");
		int horario = entrada.nextInt();
		horarioDia(horario);
		
		entrada.close();
	}

	public static void calculo(int escolha, double n1, double n2) {

		if (escolha == 1) {

			System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));

		}
		if (escolha == 2) {

			System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));

		}
		if (escolha == 3) {

			System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));

		}
		if (escolha == 4) {

			System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));

		}

	}

	public static void horarioDia(int horario) {
		
		switch (horario) {
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.println("Bom dia");
			break;
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
			System.out.println("Boa tarde!");
			break;
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Boa noite");
			break;
		}
		
	}
	
	

}
