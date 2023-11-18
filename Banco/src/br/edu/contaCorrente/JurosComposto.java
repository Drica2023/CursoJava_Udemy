package br.edu.contaCorrente;

import java.util.Scanner;

public class JurosComposto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(" digite o Valor inicial:");
		double valorInicial = scanner.nextDouble();
		System.out.println(" digite o taxa de juros:");
		double taxaJuros = scanner.nextDouble();
		System.out.println(" Digite o periodo:");
		int periodo = scanner.nextInt();

		double valorFinal = valorInicial;

		valorFinal = valorInicial * Math.pow((1 + taxaJuros), periodo);

		// taxaJuros = Math.pow (taxaJuros, periodo);
		// System.out.println(taxaJuros);

		// valorFinal = valorInicial * taxaJuros;

		// valorFinal = (taxaJuros * periodo) valorInicial;

		// TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os
		// juros.

		System.out.println("Valor final do investimento: R$ %.2f" + valorFinal);

		scanner.close();
	}
}
