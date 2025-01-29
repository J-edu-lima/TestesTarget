package com.teste.TesteTarget;

import java.util.Scanner;

public class SegundoTeste {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o número:");

		int entradaUsuario = sc.nextInt();
		System.out.println((verificadorDeFibonacci(entradaUsuario)));

		sc.close();
	}

	public static boolean verificadorDeFibonacci(int entrada) {

		int primeiro = 0;
		int segundo = 1;
		int fibonacci = segundo;

		while (fibonacci < entrada) {
			fibonacci = primeiro + segundo;
			primeiro = segundo;
			segundo = fibonacci;
		}
		if (fibonacci == entrada) {
			return true;
		}
		return false;
	}
}
