package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso = new Curso();
		Mentoria mentoria = new Mentoria();
		curso.setNome("Java");
		curso.setDescricao("Curso de Java");
		curso.setCargaHoraria(8);
		
		mentoria.setNome("Java");
		mentoria.setDescricao("Mentoria de Java");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("Java");
		bootcamp.setDescricao("Java Developer");
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devMatheus = new Dev();
		
		devMatheus.setNome("Matheus");
		devMatheus.inscrever(bootcamp);
		
		Dev devLeticia = new Dev();
		
		devLeticia.setNome("Leticia");
		devLeticia.inscrever(bootcamp);
		
		System.out.println("Conteudos inscrito do dev " + devMatheus.getNome() + " são os: " + devMatheus.getConteudosIncrito());
		System.out.println("Conteudos inscrito do dev " + devLeticia.getNome() + " são os: " + devLeticia.getConteudosIncrito());
		
		devLeticia.progredir();
		devLeticia.progredir();
		
		
		System.out.println("Conteudos concluidos do dev " + devMatheus.getNome() + " são os: " + devMatheus.getConteudosConcluitos());
		System.out.println("Conteudos concluidos do dev " + devLeticia.getNome() + " são os: " + devLeticia.getConteudosConcluitos());
		System.out.println("Conteudos inscrito do dev " + devLeticia.getNome() + " são os: " + devLeticia.getConteudosIncrito());
		System.out.println("O XP do dev " + devLeticia.getNome() + " é " + devLeticia.calcularTotalXp());
	}

}
