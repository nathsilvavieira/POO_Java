package POO_DH.aula11;

public abstract class Conta {
    protected double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double setSaldo(double saldo) {
        this.saldo = saldo;
        return saldo;
    }

    public double deposito(double valor){
        if (valor >= 0){
            saldo+=valor;
        }
        return saldo;
    }

    public abstract double saque(double valor);

    public abstract  double extrato();





}
