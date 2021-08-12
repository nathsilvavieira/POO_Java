package POO_DH.aula2;

public class Ex01 {
    //Exercício 1
    //Faça uma função que, dado um número, indique se é um número primo ou não.
    // Um número primo é aquele que só pode ser dividido por 1 e ele mesmo. Por exemplo: 25 não é primo, pois 25 é divisível por 1, 5 e 25.
    // 17 é primo porque só pode ser dividido por 1 e por 17.
    //Para usar esta função que iremos criar  em um programa, podemos  permitir a entrada de apenas um número
    // para verificar se o número é primo ou não.
    // Para resolvê-lo, use a função obtida no exercício desenvolvido na aula assíncrona, Boolean e Divisível (int n, int divisor).

    public static void main(String[] args) {
    Funcao_NumPrimo funcao = new Funcao_NumPrimo();

    System.out.println(funcao.eNumPrimo(13));
    System.out.println(funcao.eNumPrimo(15));

    }
}
