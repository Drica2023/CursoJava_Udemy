import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidacaoSenha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Digite a senha para verificar a força:");
        String senha = scanner.nextLine();
        //scanner.close();

        String resultado = verificarForcaSenha(senha);
        System.out.println(resultado);
    }

    public static String verificarForcaSenha(String senha) {
        int comprimentoMinimo = 8;

        // Critérios de validação usando expressões regulares
        boolean temLetraMaiuscula = Pattern.compile("[A-Z]").matcher(senha).find();
        boolean temLetraMinuscula = Pattern.compile("[a-z]").matcher(senha).find();
        boolean temNumero = Pattern.compile("\\d").matcher(senha).find();
        boolean temCaractereEspecial = Pattern.compile("\\W").matcher(senha).find();
        boolean temSequenciaComum = senha.matches(".*(?i)123456.*|.*(?i)abcdef.*");
        boolean temPalavraComum = senha.equalsIgnoreCase("password") || senha.equalsIgnoreCase("123456") || senha.equalsIgnoreCase("qwerty");


            int qtdcarater = senha.length();
                System.out.println(qtdcarater);

                if(qtdcarater >= comprimentoMinimo){

                            if(temLetraMaiuscula != true){
                                System.out.println("Senha fraca: entre com pelo menos um letra maiuscula");
                                                        }else if (temLetraMinuscula != true){
                                System.out.println("Senha fraca: entre com pelo menos um letra minuscula");
                                                        }else if(temNumero != true){
                                System.out.println("Senha fraca: entre com pelo menos um numero");
                                                        }else if(temCaractereEspecial != true){
                                System.out.println("Senha fraca:  entre com pelo menos um carecter especial");
                                                        }else if(temSequenciaComum){
                                System.out.println("Senha fraca: Senha tem que ser diferente de 123456... ou abcdef... ");
                                                        }else if (temPalavraComum){
                                System.out.println("Senha fraca:  Senha nao pode ter palavras comuns ");
                                                        }else{
                                System.out.println("Senha Forte");

                            }


                }else{
                    System.out.println("insira minimo de 8 carater");
                    }




        return senha;

    }

        }


