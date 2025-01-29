package com.teste.TesteTarget;

public class PrimeiroTeste {
	public static void main(String[] args) {

		int INDICE = 13, SOMA = 0, K = 0;
		int RESULTADO = valorSoma(INDICE, SOMA, K);
		System.out.println(RESULTADO);
	}

	public static int valorSoma(int INDICE, int SOMA, int K) {

		while (K < INDICE) {
			K = K + 1;
			SOMA = SOMA + K;
		}
		return SOMA;
	}
}