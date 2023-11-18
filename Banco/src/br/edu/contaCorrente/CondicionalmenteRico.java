package br.edu.contaCorrente;

import java.util.Scanner;

public class CondicionalmenteRico {
  public static void main(String[] args) {

    // Entrada de dados
    Scanner scanner = new Scanner(System.in);
    
    System.out.println(" digite o Saldo total:");
    int saldoTotal = scanner.nextInt();
    System.out.println(" digite o Valor do Saque");
    int valorSaque = scanner.nextInt();
   
    if(saldoTotal >= valorSaque){
        saldoTotal -= valorSaque;
       
        System.out.println("Saque realizado com sucesso. Novo saldo:" + saldoTotal );
    } else {
        System.out.println("Saldo insuficiente. Saque nao realizado!");
    }
    scanner.close();
}
}
