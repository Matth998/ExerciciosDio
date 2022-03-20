package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

	private String nome;
	private Set<Conteudo> conteudosIncrito = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluitos = new LinkedHashSet<>();
	
	public void inscrever(Bootcamp bootcamp) {
		
		this.conteudosIncrito.addAll(bootcamp.getConteudos());
		bootcamp.getDevsIncritos().add(this);
		
	}
	
	public void progredir() {
		
		Optional<Conteudo> conteudo =this.conteudosIncrito.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosConcluitos.add(conteudo.get());
			this.conteudosIncrito.remove(conteudo.get());
		}else {
			
			System.err.println("Você não está inscrito em nenhum conteudo.");
			
		}		
		
	}
	
	public double calcularTotalXp() {
		
		return this.conteudosConcluitos.stream()
				.mapToDouble(Conteudo::calcularXp)
				.sum();
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<Conteudo> getConteudosIncrito() {
		return conteudosIncrito;
	}
	public void setConteudosIncrito(Set<Conteudo> conteudosIncrito) {
		this.conteudosIncrito = conteudosIncrito;
	}
	public Set<Conteudo> getConteudosConcluitos() {
		return conteudosConcluitos;
	}
	public void setConteudosConcluitos(Set<Conteudo> conteudosConcluitos) {
		this.conteudosConcluitos = conteudosConcluitos;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluitos, conteudosIncrito, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluitos, other.conteudosConcluitos)
				&& Objects.equals(conteudosIncrito, other.conteudosIncrito) && Objects.equals(nome, other.nome);
	}
	
}
