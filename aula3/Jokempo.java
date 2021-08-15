package POO_DH.aula3;

import java.util.Scanner;

public class Jokempo {
    //Mesa7
    //Faça um programa que permita jogar o jogo "Pedra-Papel-Tesoura" .

    public static String whichWin(String nome1, Scanner entrada) {
        int jogador = 0;
        int computador = 0;
        int empate = 0;
        int i = 0;
        while ( i <= 0) { //loop infinito
            System.out.println("Escolha entre pedra, papel ou tesoura ");
            String jogadas = entrada.next();
            String jogada = jogadas.toLowerCase();
            //Criando condição para finalizar jogo
            if(jogadas.equals("*")){
                i = i +1;
            }
            //Segundo jogador computador
            double valorAleatorio = Math.random();
            String valorPC = valorAleatorio < 0.3 ? "pedra" : valorAleatorio < 0.6 ? "papel" : "tesoura";
            //Analizando as jogas e marcando pontos
            switch (jogada){
                case "pedra":
                    if (valorPC == "tesoura") {
                        jogador++;
                        System.out.println(nome1+" pontuou " + jogador);

                    } else {
                        computador++;
                        System.out.println("Computador pontuou " + computador);
                    }
                    break;
                case "papel":
                    if (valorPC == "pedra") {
                        jogador++;
                        System.out.println(nome1+" pontuou " + jogador);

                    } else {
                        computador++;
                        System.out.println("Computador pontuou " + computador);
                    }
                    break;
                case "tesoura":
                    if (valorPC == "papel") {
                        jogador++;
                        System.out.println(nome1+" pontuou " + jogador);

                    } else {
                        computador++;
                        System.out.println("Computador pontuou " + computador);
                    }
                    break;

            }

        }
        // Verificação de pontuação e vencedores
            if (jogador == computador) {
                System.out.println("Empate.");
                empate++;
            } else if (jogador >= computador) {
                System.out.println(nome1+" pontuou " + jogador);

            } else {
                System.out.println("Computador venceu.");

            }
            //mensagem no final do jogo
            return "Jogo finalizado";
    }


    public static void main(String[] args) {
    // criando mensagem no console e coletando informação
    Scanner entrada = new Scanner(System.in);
    System.out.println("Bem vindo ao Jokempo! \n");
    System.out.println("Digite seu nome: ");
    String nome1 = entrada.next();
    //chmando função
    System.out.println(whichWin(nome1,entrada));

    }
}
