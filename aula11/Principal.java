package POO_DH.aula11;

public class Principal {
    public static void main(String[] args) {
      Cliente cliente = new Cliente("Vieira", 1, "405.405.006-56");
      Conta itau = new ContaCorrente(500,100);
      Conta itauPoup = new ContaPoupanca(120,1.0);
        System.out.println(itau.saldo);
        System.out.println(itau.deposito(100));
        System.out.println(itau.getSaldo());
        System.out.println(itau.saque(50));
        System.out.println(itau.extrato());

        System.out.println(itauPoup.getSaldo());
        System.out.println(itauPoup.deposito(50));
        System.out.println(itauPoup.extrato());
        System.out.println(itauPoup.saque(5));



    }
}
