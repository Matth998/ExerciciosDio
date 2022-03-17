package com.exercicicos.dio;

import java.util.Scanner;

/*Ler um número inteiro N e calcular todos os seus divisores.*/

public class Exercicio23 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        
		input.close();
	}
	
}
