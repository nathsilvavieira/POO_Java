package POO_DH.aula22;

public class Main {
    public static void main(String[] args) {
        Curso backEnd = new Curso("back end", 20, 2,900);
        Curso frontEnd = new Curso("front end",16,2,1000);
        Programa fullStack = new Programa();
        fullStack.addListaCurso(backEnd);
        fullStack.addListaCurso(frontEnd);
        System.out.println(backEnd.calcularPreco());
        System.out.println(frontEnd.calcularPreco());
        System.out.println(fullStack.calcularPreco());
    }
}
