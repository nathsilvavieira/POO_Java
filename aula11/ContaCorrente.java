package POO_DH.aula11;

public class ContaCorrente extends Conta{
    private double chequeEspecial;

    public ContaCorrente(double saldo, double chequeEspecial) {
        super(saldo);
        this.chequeEspecial=chequeEspecial;
    }


    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }




    @Override
    public double saque(double valor) {
       if(valor>=saldo){
           saldo-= valor;
       }
        return saldo;
    }

    @Override
    public double extrato() {
        return getSaldo();
    }
}
