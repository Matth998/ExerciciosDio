package com.exercicicos.dio;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

import java.util.Scanner;

public class Exercicio10{

    public static void main(String[] args) {

        String name;
        int idade;
        int valida;
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("Deseja inserir um aluno? | 1 - Sim | 0 - Não | ");
        valida = input2.nextInt();
        
        while(valida != 0) {
        	
        	System.out.print("Digite o nome do aluno: ");
        	name = input.nextLine();
        	
        	System.out.print("Digite a idade do aluno: ");
        	idade = input2.nextInt();
        	
        	System.out.println("Nome do aluno adicionado: " + name);
        	System.out.println("Idade do aluno adicionado: " + idade);
        	
        	System.out.println("Deseja inserir mais um aluno? | 1 - Sim | 0 - Não | ");
        	valida = input2.nextInt();
        	
        }

        System.out.println("Obrigado por usar nosso programa.");
        input.close();
        input2.close();

    }

}