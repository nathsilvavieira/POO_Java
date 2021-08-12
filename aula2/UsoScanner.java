package POO_DH.aula2;

import java.util.Scanner;

public class UsoScanner {
    //Digite seu nome e sobrenome separadamente, a partir dessas variáveis,
    // você deve obter uma terceira com as suas iniciais
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.next();
        char inicial = nome.charAt(0);
        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = entrada.next();
        char incSobrenome = sobrenome.charAt(0);



        System.out.println(inicial);
        System.out.println(incSobrenome);

        entrada.close();
    }

}
