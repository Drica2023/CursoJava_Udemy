package edu.desafio.iphone;

public class UsuarioIphone {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		iphone.Ligar();
		
		Iphone nav = new Iphone();
		nav.exibirPagina();
		
		Iphone falando = new Iphone();
		falando.atenderLigacao();
		
		Iphone escuta = new Iphone();
		escuta.tocarMusica();
		
		Iphone pausa = new Iphone();
		pausa.pausarmusica();
		
				
	}

}