package POO_DH.aula1;

import POO_DH.aula1.Animal;

public class main {
    public static void main(String[] args) {

        Animal cao = new Animal("Shesheu",2, 1.5,"Au au");
        Animal peixe = new Animal("Nemo",1, 0.140,"glub");
        Animal gato = new Animal("Snow",3, 0.5,"miau");

        System.out.println(cao.getName());
        System.out.println(cao.getDescricao());

        System.out.println(peixe.getName());
        System.out.println(peixe.getDescricao());

        System.out.println(gato.getName());
        System.out.println(gato.getDescricao());

    }
}
