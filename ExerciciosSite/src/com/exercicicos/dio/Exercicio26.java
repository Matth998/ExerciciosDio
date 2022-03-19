package com.exercicicos.dio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Exercicio26 {

	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        int linhas = Integer.parseInt(st.nextToken());
	        
	        List<Integer> listaNumeros = new ArrayList<>();
	        
	        for (int i = 0; i < linhas; i++) {
	            st = new StringTokenizer(br.readLine());
	            listaNumeros.add(Integer.parseInt(st.nextToken()));
	        }
	        var pares = listaNumeros.stream().filter(l -> l % 2 == 0).sorted().collect(Collectors.toList());
	        var impares = listaNumeros.stream().filter(l -> l % 2 != 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	        
	        List<Integer> total = new ArrayList<>();
	        total.addAll(pares);
	        total.addAll(impares);
	        total.forEach(System.out::println);
	    }

}
