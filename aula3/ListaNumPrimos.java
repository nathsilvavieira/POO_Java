package POO_DH.aula3;

import java.util.Scanner;

public class ListaNumPrimos {
    /*Implemente um programa que nos permita exibir os primeiros "n" números primos pelo
    console, onde "n" é um valor numérico inserido pelo console. Por exemplo: Com n = 7, o
    que o programa deve retornar é "Os primeiros 7 números primos são: 2, 3, 5, 7, 11, 13, 17";.*/

    public static void prime(int num){
        int contador = 0;
        for (int i = num; i >= 1 ; i--) {
            if (num%i==0){
                contador++;

            }
        }
        if(contador<=2){ // divide - duas vezes
            System.out.println(num);
        }

    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um intervalo para para calcular os numero primos: ");
        int num = entrada.nextInt();

        for (int i = 2; i < num; i++) {
            prime(i);
        }


    }


}