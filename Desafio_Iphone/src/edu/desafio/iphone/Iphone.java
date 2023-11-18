package edu.desafio.iphone;

public class Iphone implements Telefone, Internet, Ipod {
	int numero;
	String contatoNome;
	String musica;
	String tipoMusica;

	public void Ligar() {

		System.out.println("Digitar o numero de telefone ou nome do contato para Ligar");
	}

	public void atenderLigacao() {

		System.out.println("Falando no telfone!");
	}

	public void iniciarCorreioVoz() {

		System.out.println("Enviando mensagem de voz");
	}

	public void tocarMusica() {
		System.out.println("Escutando Musica");
	}

	public void pausarmusica() {
		System.out.println("Pausando musica escutada");
	}

	public void selecionarMusica() {

		System.out.println("Procurando uma musica para escutar");
	}

	public void exibirPagina() {
		System.out.println("Navegando na pagina de Internet");

	}

	public void adicionarNovaAba() {
		System.out.println("Abrindo nova pagina do navegador");

	}

	public void AtualizarPagina() {
		System.out.println("Atualizando pagina da internet aberta");

	}
}
