package br.edu.contaCorrente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrganizandoAtivos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("quantidadeAtivos");

		ArrayList<String> ativos = new ArrayList<>();

		// Entrada dos tipos de ativos

		int quantidadeAtivos = scanner.nextInt();

		System.out.println("Digite os ativos");

		// Entrada dos códigos dos ativos
		for (int i = 0; i < quantidadeAtivos; i++) {
			String codigoAtivo = scanner.next();
			ativos.add(codigoAtivo);

		}

		Collections.sort(ativos);

		System.out.println(ativos);
		scanner.close();
	}
}
