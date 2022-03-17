package com.exercicicos.dio;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int mes, num;
		String dia;

		System.out.print("Digite o n�mero do m�s: ");
		mes = input.nextInt();

		verificaMes(mes);

		System.out.print("Digite o dia da semana: ");
		dia = input.next();
		verificaDia(dia);
		
		System.out.print("Digite um n�mero: ");
		num = input.nextInt();
		
		verificaNum(num);

		input.close();

	}

	public static void verificaMes(int mes) {

		if (mes == 1) {

			System.out.println("Janeiro.");
			System.out.println("F�rias");

		}
		if (mes == 2) {

			System.out.println("Fevereiro.");

		}
		if (mes == 3) {

			System.out.println("Mar�o.");

		}
		if (mes == 4) {

			System.out.println("Abril.");

		}
		if (mes == 5) {

			System.out.println("Maio.");

		}
		if (mes == 6) {

			System.out.println("Junho.");
			System.out.println("F�rias");

		}
		if (mes == 7) {

			System.out.println("Julho.");

		}
		if (mes == 8) {

			System.out.println("Agosto.");

		}
		if (mes == 9) {

			System.out.println("Setembro.");

		}
		if (mes == 10) {

			System.out.println("Outubro.");

		}
		if (mes == 11) {

			System.out.println("Novembro.");

		}
		if (mes == 12) {

			System.out.println("Dezembro.");
			System.out.println("F�rias.");

		}

	}

	public static void verificaDia(String dia) {

		switch (dia) {

		case "Domingo":
			System.out.println(1);
			break;
		case "Segunda-Feira":
			System.out.println(2);
			break;
		case "Ter�a-Feira":
			System.out.println(3);
			break;
		case "Quarta-Feira":
			System.out.println(4);
			break;
		case "Quinta-Feira":
			System.out.println(5);
			break;
		case "Sexta-Feira":
			System.out.println(6);
			break;
		case "S�bado":
			System.out.println(7);
			break;

		}

	}

	public static void verificaNum(int num) {

		switch (num) {

		case 1:
		case 2:
		case 3:
			System.out.println("Certo");
			break;
		case 4:
			System.out.println("Errado");
			break;
		case 5:
			System.out.println("Talvez");
			break;
		default:
			System.out.println("Valor indefinido.");
			break;

		}

	}

}
