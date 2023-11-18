package br.desafio.bancario;

import java.util.Scanner;

public class CofresSeguros {
	public static void main(String[] args) {
		// Lê o tipo de cofre (primeira linha da entrada)
		Scanner scanner = new Scanner(System.in);
		String tipoCofre = scanner.nextLine();

		// TODO: Implement a condição necessário para a verificação dos cofres seguros:
		if (tipoCofre.equalsIgnoreCase("digital")) {
			int senha = scanner.nextInt();
			int confirmacaoSenha = scanner.nextInt();

			if (senha == confirmacaoSenha) {

				CofreDigital cofreDigital = new CofreDigital(0);
				cofreDigital.imprimirInformacoes();

				System.out.println("Cofre Aberto!");

			} else {
				CofreDigital cofreDigital = new CofreDigital(0);
				cofreDigital.imprimirInformacoes();

				System.out.println("Senha incorreta!");

			}
		}

		if (tipoCofre.equalsIgnoreCase("fisico")) {
			CofreFisico cofrefisico = new CofreFisico();
			cofrefisico.imprimirInformacoes();

		}
		scanner.close();
	}
}

abstract class Cofre {
	protected String tipo;
	protected String metodoAbertura;

	public Cofre(String tipo, String metodoAbertura) {
		this.tipo = tipo;
		this.metodoAbertura = metodoAbertura;
	}

	public void imprimirInformacoes() {
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Metodo de abertura: " + this.metodoAbertura);
	}
}

class CofreDigital extends Cofre {

	private int senha;

	public CofreDigital(int senha) {
		super("Cofre Digital", "Senha");
		this.senha = senha;
	}

	public boolean validarSenha(int confirmacaoSenha) {
		return confirmacaoSenha == this.senha;
	}
}

class CofreFisico extends Cofre {

	public CofreFisico() {
		super("Cofre Fisico", "Chave");
	}

}
