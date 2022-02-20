import java.util.Scanner;

/**
 * Classe que roda todos os desafios via terminal
 */
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        escolherOpcao();

    }

    public static Integer validaInteiro() {
        boolean valido = false;
        int valor = 0;
        while (!valido) {
            try {
                valor = sc.nextInt();
                valido = true;
            } catch (Exception ex) {
                System.out.println("Digite um numero valido EX: 4" + ex);
            }
        }
        return valor;


    }


    public static void escolherOpcao() {
        boolean on = true;
        int opcao;

        try {

            do {
                System.out.print("Para escolher rodar a primeira questão (Escada *)  Digite 1 e pressione enter. \n");
                System.out.print("Para escolher rodar a segunda questão (Senha Forte)  Digite 2 e pressione enter. \n");
                System.out.print("Para escolher rodar a terceira questão (Anagrama) Digite 3 e pressione enter. \n");
                System.out.println("Para sair da aplicação digite qualquer número ou caractere diferente das opções acima.");
                System.out.print("Digite um numero:");

                opcao = validaInteiro();


                switch (opcao) {
                    case 1 -> {
                        int linhas;
                        System.out.println("Digite a quantidade de linhas que você quer em sua escada de asteriscos EX: 3)");
                        linhas = validaInteiro();
                        /*Desafio 1 contruir escada de 6 linhas*/
                        Questao01 questao01 = new Questao01();
                        System.out.println(questao01.contruirEscada(linhas));
                    }
                    case 2 -> {

                        System.out.println("Digite a senha que quer testar EX: mECon7r@ta");
                        /*Desafio 2 retornar quantos caracters faltam para ter uma senha segura */
                        Questao02 questao02 = new Questao02();
                        System.out.println("Resultado: " + questao02.validarSenha(sc.next()));
                    }
                    case 3 -> {

                        System.out.println("Digite a palavra que você quer verificar se tem anagrama");
                        /*Desafio 3 conferir quantos anagramas de substring a palavra tem*/
                        Questao03 questao03 = new Questao03();
                        System.out.println("Resultado: " + questao03.temAnagrama(sc.next()));
                    }
                    default -> on = false;
                }


            } while (on);
            System.out.println("Obrigado por conferir meu trabalho, espero ser um dev fora da curva pra voc\u00EAs");
            System.exit(0);


        } catch (Exception ex) {
            System.out.println("Você tem que digitar um numero de 1 a 3 para executar os desafios, para sair digite qualquer numero diferente");
        }
    }
}
