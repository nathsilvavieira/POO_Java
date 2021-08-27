package POO_DH.aula3;

import java.util.Scanner;

public class Cachorrinhos {

    public static int qtdPacotes(float racao, Scanner entrada){
        float kilos=0.0f;
        int intermediario=0;
        while(kilos<racao){
            System.out.println("Insira peso de cada porção  de ração consumida: ");
            String qtdracaoaux = entrada.next();
            float qtdracao = Float.parseFloat(qtdracaoaux);
            kilos+=qtdracao;
            intermediario++;
        }
        return intermediario;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira nome do seu pet");
        String nome = entrada.nextLine();
        System.out.println("Insira quantidade de ração diaria consumida: ");
        String racaoaux = entrada.nextLine();
        float racao = Float.parseFloat(racaoaux);


        System.out.println("O pet "+ nome+ " consome "+qtdPacotes(racao,entrada)+" pacotes de racao");

    }
}
