package POO_DH.aula2;

public class LinguagemJava {
    //Defina duas sequências de texto. Verifique se são iguais ou diferentes e
    // indique por meio de mensagem.
    public static void main(String[] args) {
        String texto1 = "Oi, tudo bem?";
        String texto2 = "Olá, tudo bem?";
        String  comparar;
        if(texto1.equals(texto2)){
            System.out.println("São Iguais!");
        } else if(texto1==texto2){
            System.out.println("tipo são iguais");
        }else{
            System.out.println("Não sao iguais");
        }

        System.out.println("\n------------------------------------------");
        //Defina duas variáveis Integer e determine pelo valor delas qual é maior, qual é menor ou se são iguais.

        Integer num1 = 12;
        Integer num2 = 12;
        String  compararador;
        if(num1==num2){
            System.out.println("São Iguais!");
        } else if(num1.equals(num2)){
            System.out.println("tipo são iguais");
        }else{
                System.out.println("Não sao iguais");
        }




    }

}
