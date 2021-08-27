package POO_DH.aula3;

import java.util.Scanner;

public class SalarioJulieta {

    /*Por motivos trabalhistas, você pode trabalhar até 40 horas semanais, se trabalhar mais horas são consideradas horas
    extras cujo valor é 50% a mais que a jornada normal de trabalho. Crie um programa que possa relatar o salário semanal
     da programadora*/

    public static double calculadoraSalario(double horas, double salario){

        double valorHoraExtra = (salario/8)*0.5;
        double qtdHoraExtra = horas - 40;
        double salarioSemanal = salario +(qtdHoraExtra * valorHoraExtra);
        return salarioSemanal;

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira quantidade de horas trabalhadas:");
        double horas = entrada.nextDouble();
        System.out.println("Insira o salario da funcionaria: ");
        double salario = entrada.nextDouble();

        if(horas>40){
            System.out.println("Valor a ser pago ao funcionario é de R$ "+ calculadoraSalario(horas,salario));
        }else{
            System.out.println("Valor a ser pago ao funcionario é de R$ "+ salario);
        }


        entrada.close();
    }

}
