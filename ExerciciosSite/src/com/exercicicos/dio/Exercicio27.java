package com.exercicicos.dio;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int N = leitor.nextInt();
			System.out.println(log2(N));
		}

		sc.close();
		leitor.close();
	}

	private static int log2(int N) {
		return (int) (Math.log(N) / Math.log(2));
	}

}
