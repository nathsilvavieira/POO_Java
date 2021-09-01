package POO_DH.aula11;

public class ContaPoupanca extends Conta{
    private double taxaJuros;

    public ContaPoupanca(double saldo, double taxaJuros) {
        super(saldo);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    public void cobrarJuros(double taxaJuros){
        saldo*=taxaJuros;
    }

    @Override
    public double saque(double valor) {
        if(valor>=getSaldo()){
            return saldo-= valor;
        }
        return getSaldo();
    }

    @Override
    public double extrato() {

        return getSaldo();
    }
}
