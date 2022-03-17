package com.exercicicos.dio;

import java.util.Scanner;

public class Exercicio3 {
 
    public static void main(String[] args) {
          int minutos;
        Scanner input = new Scanner(System.in);
        minutos = input.nextInt();
        int K = minutos*2;
        System.out.printf("%d minutos\n",K);
        
        input.close();
     }  
}
