package com.exercicicos.dio;

import java.io.IOException;
import java.util.Scanner;

/*Domingo é dia de feira. Logo de manhã muitas pessoas se deslocam 
 * para o polo de lazer da Parangaba, onde acontece uma 
 * feira, conhecida por ser a maior da cidade. Na feira da 
 * Parangaba você pode encontrar de tudo.Todos os domingos, 
 * Bino faz compras na feira. Ele sempre marca com seu amigo 
 * Cino de se encontrarem no terminal de ônibus da Parangaba às 8h, 
 * para irem juntos comprar na feira. Porém, muitas vezes Bino acorda 
 * muito tarde e se atrasa para o encontro com seu amigo.Sabendo que Bino 
 * leva de 30 a 60 minutos para chegar ao terminal. Diga o atraso máximo de Bino.
 */

public class Exercicio21 {

	public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	
    	while (leitor.hasNext()) {
    		String[] relogio = leitor.nextLine().split(":");    		
    		int hora = Integer.parseInt(relogio[0]);
    		int min = Integer.parseInt(relogio[1]);
    		switch (hora) {
    			case(7): System.out.println("Atraso maximo: " + min); break;
    			case(8): System.out.println("Atraso maximo: " + (60+min)); break;
    			case(9): System.out.println("Atraso maximo: " + (120+min)); break;
    			default: System.out.println("Atraso maximo: 0");
    		}
    	}
    	leitor.close();
    }
	
}
