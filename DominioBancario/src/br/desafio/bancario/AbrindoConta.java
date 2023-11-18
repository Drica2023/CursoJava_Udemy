package br.desafio.bancario;

import java.util.Scanner;
import java.text.DecimalFormat;

public class AbrindoConta {

	public static void main(String[] args) {
		// Lendo os dados de Entrada:
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
		String nomeTitular = scanner.nextLine();
		double saldo = scanner.nextDouble();

		ContaBancaria1 bancaria = new ContaBancaria1(numero, nomeTitular, saldo);
		System.out.println("Informacoes:");

		DecimalFormat decimalFormat = new DecimalFormat("#.0");
		System.out.println("Conta: " + bancaria.numero);

		System.out.println("Titular: " + bancaria.nomeTitular);

		System.out.println("Saldo: R$ " + decimalFormat.format(bancaria.saldo));
		scanner.close();
	}

}

public class ContaBancaria1 {
	int numero;
	String nomeTitular;
	double saldo;

	public ContaBancaria1(int numero, String nomeTitular, double saldo) {

		this.numero = numero;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}
}