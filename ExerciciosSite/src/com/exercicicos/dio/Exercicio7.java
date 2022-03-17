package com.exercicicos.dio;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        if (a%b == 0 || b%a == 0) {
            System.out.println("Sao Multiplos");
        } else {
        	System.out.println("Nao sao Multiplos");
        }
        
        leitor.close();
    }

}
