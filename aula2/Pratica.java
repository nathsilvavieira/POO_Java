package POO_DH.aula2;

import java.util.Scanner;

public class Pratica {
    //Digite seu nome e sobrenome separadamente, a partir dessas variáveis obtenha em uma terceira, suas iniciais e sua data de nascimento, para a data digite 3 valores que representam dia, mês e ano.
    //Em seguida, exiba uma mensagem, como se fosse um token, com seu nomes, as iniciais do seu nome e sobrenome e sua data de nascimento no formato "dd / mm / aaaa"
    //Nota: Use alguma função para resolver, por exemplo, dados os 3 valores, retorne a data como uma string.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira nome: ");
        String nome = entrada.next();
        System.out.println("Insira sobrenome: ");
        String sobrenome =entrada.next();
        System.out.println("Insira data nascimento formato dd/mm/aa: ");
        String dataNascimento = entrada.next();

        System.out.println(nome.charAt(0)+ "."+ sobrenome.charAt(0)+ "\n "+dataNascimento);

        entrada.close();
    }

}
