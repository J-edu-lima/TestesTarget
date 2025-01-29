package com.teste.TesteTarget;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TerceiroTeste {
	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper();

		try {
			Faturamento[] faturamentos = objectMapper.readValue(new File("C:\\Users\\elisa\\Downloads\\dados.json"),
					Faturamento[].class);
			Map<Integer, Double> vendasPorDia = new HashMap<>();

			for (Faturamento venda : faturamentos) {
				if (venda.getValor() != 0.0) {
					vendasPorDia.put(venda.getDia(), venda.getValor());
				}
			}
			System.out.println(diaMaiorFaturamento(vendasPorDia));
			System.out.println(diaMenorFaturamento(vendasPorDia));
			System.out.println(diasAcimaDaMedia(vendasPorDia));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Double diaMaiorFaturamento(Map<Integer, Double> vendasPorDia) {

		double maiorFaturamento = 0.0;
		for (Entry<Integer, Double> entry : vendasPorDia.entrySet()) {
			if (entry.getValue() > maiorFaturamento) {
				maiorFaturamento = entry.getValue();

			}
		}
		return maiorFaturamento;
	}

	public static Double diaMenorFaturamento(Map<Integer, Double> vendasPorDia) {

		double menorFaturamento = Double.MAX_VALUE;
		for (Entry<Integer, Double> entry : vendasPorDia.entrySet()) {
			if (entry.getValue() < menorFaturamento) {
				menorFaturamento = entry.getValue();

			}
		}
		return menorFaturamento;
	}

	public static Integer diasAcimaDaMedia(Map<Integer, Double> vendasPorDia) {

		double faturamentoTotal = 0.0;
		int dias = 0;
		for (Entry<Integer, Double> entry : vendasPorDia.entrySet()) {
			faturamentoTotal += entry.getValue();
			dias++;
		}

		double mediaMensal = faturamentoTotal / dias;
		int diasAcimaDaMedia = 0;
		for (Entry<Integer, Double> entry : vendasPorDia.entrySet()) {
			if (entry.getValue() > mediaMensal) {
				diasAcimaDaMedia++;
			}
		}
		return diasAcimaDaMedia;
	}
}
