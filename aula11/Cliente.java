package POO_DH.aula11;

public class Cliente {
    private String sobrenome;
    private int numCliente;
    private String cpf;

    public Cliente(String sobrenome, int numCliente, String cpf) {
        this.sobrenome = sobrenome;
        this.numCliente = numCliente;
        this.cpf = cpf;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
