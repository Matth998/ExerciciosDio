package com.exercicicos.dio.desafio;

public abstract class Conta implements IConta{

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	protected int agencia;
	protected int numero;
	protected int saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		
	}
	
	@Override
	public void sacar(double valor) {
		
		this.saldo-=valor;
		
	}

	@Override
	public void depositar(double valor) {
		
		this.saldo+=valor;
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public int getSaldo() {
		return saldo;
	}
	
	protected void imprimirInfosComuns() {
		
		System.out.println("Nome: " + this.cliente.getNome());
		System.out.println(String.format("Ag�ncia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println(String.format("Saldo: %d", this.saldo));
		
	}
	
}
