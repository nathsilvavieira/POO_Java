package POO_DH.aula3;

import java.util.Scanner;

public class Spock {
    /*Modifique a função que você escreveu no Desafio 2 do "Pedra-Papel-Tesoura" para jogar a variável Spock: Há mais
    uma possibilidade, o Sr. Spock - formado pela mão Vulcan de Jornada nas Estrelas - tem outros poderes de acordo com:
    Papel desaprova Spock
    Spock quebra uma tesoura
    Spock vaporiza pedra */

public static String whichWin(String nome1, String nome2, String mao1, String mao2, Scanner entrada){
    int jogador1=0;
    int jogador2=0;
    int empate = 0;
    int i = 0;
    while(i <= 0){
        if (mao1.equals("*") || mao2.equals("* ")){
            i++;
        }
        if(mao1.equals(mao2)){
            empate++;
            System.out.println(empate);
        }if (mao1 == "pedra"){
            if (mao2 == "tesoura") {
                jogador1++;
                System.out.println(nome1+" pontuou " + jogador1);

            } else {
                jogador2++;
                System.out.println(nome2 +" pontuou " + jogador2);
            }
        }if (mao1 == "papel"){
            if (mao2 == "pedra") {
                jogador1++;
                System.out.println(nome1+" pontuou " + jogador1);

            } else {
                jogador2++;
                System.out.println(nome2 +" pontuou " + jogador2);
            }
        }if (mao1 == "tesoura"){
            if (mao2 == "papel") {
                jogador1++;
                System.out.println(nome1+" pontuou " + jogador1);
            } else {
                jogador2++;
                System.out.println(nome2 +" pontuou " + jogador2);
            }
        }
        System.out.println("Escolha uma jogada entre Pedra, Papel, Tesoura ou Spock:");
        mao1 = entrada.next();
        System.out.println("Escolha uma jogada entre Pedra, Papel, Tesoura ou Spock:");
        mao2 = entrada.next();
    }
     return "jogo encerrado";

}

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem vindo ao Jokempo! \n");
        System.out.println("Digite seu nome: ");
        String nome1 = entrada.next();
        System.out.println("Escolha uma jogada entre Pedra, Papel, Tesoura e Spock: ");
        String mao1 = entrada.next();

        System.out.println("Digite seu nome: ");
        String nome2 = entrada.next();
        System.out.println("Escolha uma jogada entre Pedra, Papel, Tesoura e Spock: ");
        String mao2 = entrada.next();

        whichWin(nome1,nome2,mao1,mao2,entrada);


    }

}
