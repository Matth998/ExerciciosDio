package com.exercicicos.dio.desafio;

public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente matheus = new Cliente("Matheus");
		
		Conta cc = new ContaCorrente(matheus);
		Conta cp = new ContaPoupanca(matheus);
		
		cc.depositar(300);
		cc.transferir(150, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
	}
	
}
