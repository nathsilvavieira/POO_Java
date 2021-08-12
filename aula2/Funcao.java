package POO_DH.aula2;

public class Funcao {
    //Faça uma função que receba dois valores como parâmetro e que no retorno sejam do tipo booleano. A função deve verificar se o primeiro número é divisível pelo segundo.
    //boolean eDivisivel(int num, int divisor)
    //
    //NOTA: O fato de ser divisível pelo outro significa que ao dividir precisa dar um resultado exato, ou seja, sem decimais.
    public static void main(String[] args) {
    EDivisivel divisao = new EDivisivel();
    divisao.num=2;
    divisao.divisor=2;
    System.out.println(divisao.eDivisivel(divisao.num, divisao.divisor));


    }
}
