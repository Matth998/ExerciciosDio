package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

	private String nome;
	private String descricao;
	private final LocalDate dataInicio = LocalDate.now();
	private final LocalDate dataFim = dataInicio.plusDays(45);
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	private Set<Dev> devsIncritos = new HashSet<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	public Set<Dev> getDevsIncritos() {
		return devsIncritos;
	}
	public void setDevsIncritos(Set<Dev> devsIncritos) {
		this.devsIncritos = devsIncritos;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public LocalDate getDataFim() {
		return dataFim;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataFim, dataInicio, descricao, devsIncritos, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataFim, other.dataFim)
				&& Objects.equals(dataInicio, other.dataInicio) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(devsIncritos, other.devsIncritos) && Objects.equals(nome, other.nome);
	}

}
