package POO_DH.aula5;

public class Clientes {
    private int numCliente;
    private String nomeCliente;
    private double divida;

    public Clientes(int numCliente, String nomeCliente) {
        this.numCliente = numCliente;
        this.nomeCliente = nomeCliente;
        this.divida = 0;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    public String aumentarDivida(double valor){
        this.divida = divida + valor;
        return "Valor da sua divida aumentou para "+ this.divida;
    }
    public String pagarDivida(){
        this.divida = 0;
        return "Sua divida esta quitada";
    }
}
