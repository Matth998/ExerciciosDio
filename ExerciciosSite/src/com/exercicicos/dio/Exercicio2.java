package com.exercicicos.dio;

public class Exercicio2 {

	public static void main(String [] args) {
		
		System.out.println(calculaArea(5));
		System.out.println(calculaArea(5,4));
		System.out.println(calculaArea(24,9,15));
		calculaArea();
		
	}
	
	public static double calculaArea(double ladoQuadrado) {
		
		double areaQuadrado = Math.pow(ladoQuadrado, 2);
		
		
		return areaQuadrado;
		
	}
	
	public static double calculaArea(double baseTriangulo, double alturaTriangulo) {
		
		double areaTriangulo = (baseTriangulo*alturaTriangulo)/2;
		
		return areaTriangulo;
		
		
	}
	
	public static double calculaArea(double baseMaior, double baseMenor, double alturaTrapezio) {
		
		double areaTrapezio = (baseMaior + baseMenor) * alturaTrapezio/2;
		
		return areaTrapezio;
		
	}
	
	public static void calculaArea() {
		
		System.out.println("Por favor, informe algum valor, para que o calculo possa ser feito!");
		
	}
	
}
