package POO_DH.aula13;

public class Principal {
    public static void main(String[] args) {
        Capitao marcos = new Capitao("Marcos", "marquinhos", "ABC20");
        Embarcacao pardrao = new Veleiros(marcos, 500, 150, 2020, 3, 2);
        Embarcacao luxo = new Veleiros(marcos, 500, 150, 2020, 3, 4);
        ((Veleiros) pardrao).navegar();
        System.out.println(((Veleiros) luxo).comparar(luxo));


    }
}