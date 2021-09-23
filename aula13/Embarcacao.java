package POO_DH.aula13;

public abstract class Embarcacao {
    private Capitao capitao;
    private double precoBase;
    private double valorAdicional;
    private int anoFabricacao;
    private double comprimento;

    public Embarcacao(Capitao capitao, double precoBase, double valorAdicional, int anoFabricacao, double comprimento) {
        this.capitao = capitao;
        this.precoBase = precoBase;
        this.valorAdicional = valorAdicional;
        this.anoFabricacao = anoFabricacao;
        this.comprimento = comprimento;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double calcularValorAluguel(){
        double valor;
        if(anoFabricacao>2020){
            valor = this.precoBase + this.valorAdicional;
        }else {
            valor = this.precoBase;
        }
        return valor;
    }

}

