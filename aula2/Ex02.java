package POO_DH.aula2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02 {
    //Exercício 2
    //Escreva uma função que receba três números e retorne o máximo dos três números.
    //int maximoEntreTresNumeros(int umNumeroA, int umNumeroB, int umNumeroC)
    //Em seguida, faça um programa que permita a entrada de 3 valores, use a função e exiba o resultado.
    public static void main(String[] args) {
        Maximo maximo = new Maximo();
        System.out.println(maximo.maximoEntreTresNumeros(3,4,6));
        RefatoradoMaximo maximoValor = new RefatoradoMaximo();

        List<Integer> lista = Arrays.asList(1,20,3,4,50,6,7,8,9);
        System.out.println(maximoValor.maximoValor(lista));


    }


}
