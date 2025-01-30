package com.teste.TesteTarget;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class QuartoTeste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Double> valores = new HashMap<>();

		valores.put("SP", 67838.43);
		valores.put("RJ", 36678.66);
		valores.put("MG", 29299.88);
		valores.put("ES", 27165.48);
		valores.put("outros", 19849.53);

		System.out.print("Insira o estado:");
		String estado = sc.nextLine();

		Double soma = soma(valores);
		Double percentual = percentual(estado, valores, soma);
		
		System.out.printf("%.2f%%\n", percentual);
		sc.close();
	}

	public static Double soma(Map<String, Double> valores) {

		Double soma = 0.0;
		for (Entry<String, Double> entry : valores.entrySet()) {
			soma = entry.getValue() + soma;
		}
		return soma;
	}

	public static Double percentual(String estado, Map<String, Double> valores, Double soma) {

		Double percentual = 0.0;
		for (Entry<String, Double> entry : valores.entrySet()) {
			if (entry.getKey().contentEquals(estado.toUpperCase())
					|| entry.getKey().contentEquals(estado.toLowerCase())) {
				percentual = (entry.getValue() / soma) * 100;
			}
		}
		return percentual;
	}
}
