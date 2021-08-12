package POO_DH.aula2;

public class Variaveis {
    //Defina dois números inteiros. Atribua um valor a cada um.
    // Verifique se um número é divisível pelo segundo e indique o resultado obtido por meio de uma mensagem.
    //
    //NOTA: O fato de ser divisível significa que ao dividir precisa dar um valor exato, ou seja, sem decimais.
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        if(a%b==0){
            System.out.println("Numero"+a +" é divisivel por "+b);
        }else if(b%a==0){
            System.out.println("numero" +b +"é divisivel por "+a);
        }else{
            System.out.println("Numeros não são divisiveis");
        }
    }
}
