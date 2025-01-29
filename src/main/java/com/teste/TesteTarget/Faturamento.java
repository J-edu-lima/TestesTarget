package com.teste.TesteTarget;

public class Faturamento {

	int dia;
	Double valor;

	public Faturamento() {
	}

	public Faturamento(int dia, Double valor) {
		this.dia = dia;
		this.valor = valor;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
