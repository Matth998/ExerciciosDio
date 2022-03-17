package com.exercicicos.dio;

import java.util.Scanner;

/*No tabuleiro de xadrez, a casa na linha 1, coluna 1 
 * (canto superior esquerdo) � sempre branca e as cores 
 * das casas se alternam entre branca e preta, formando o 
 * formato t�o conhecido como xadrez. Dessa forma, como o 
 * tabuleiro tradicional tem oito linhas e oito colunas, a 
 * casa na linha 8, coluna 8 (canto inferior direito) ser� 
 * tamb�m branca. Por�m, neste problema, queremos ser capazes de 
 * predizer a cor independente do n�mero de linhas e colunas, sendo: 
 * L linhas e C colunas. No exemplo da figura, para L = 6 e C = 9, a 
 * casa no canto inferior direito ser� preta, uma simples previs�o matem�tica, n�o?
 */

public class Exercicio25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int C = sc.nextInt();
		if (L%2==C%2)
			System.out.println(1);
		else                            
			System.out.println(0);
		
		sc.close();
		
	}

}
