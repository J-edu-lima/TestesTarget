package com.teste.TesteTarget;

public class QuintoTeste {
	public static void main(String[] args) {

		String palavra = "reverse";
		String invertida = inverterString(palavra);

		System.out.print(invertida);
	}

	public static String inverterString(String palavra) {
		
		char[] array = palavra.toCharArray();
		char[] arrayInvertido = array.clone();
		int tamanho = array.length;

		for (int i = 0; i <= array.length - 1; i++) {
			tamanho = tamanho - 1;
			arrayInvertido[i] = array[tamanho];
		}

		String invertido = new String(arrayInvertido);
		return invertido;
	}
}