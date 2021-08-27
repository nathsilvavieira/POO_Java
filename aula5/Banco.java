package POO_DH.aula5;

public class Banco {
    public static void main(String[] args) {
        Clientes c1 = new Clientes( 2, "Nathalia");
        System.out.println(c1.getNomeCliente());
        System.out.println(c1.getDivida());
        c1.setDivida(200);
        System.out.println(c1.getDivida());
        c1.setNomeCliente("Bruno");
        System.out.println(c1.getNomeCliente());
        System.out.println(c1.aumentarDivida(100));
    }



}
