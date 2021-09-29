package POO_DH.aula22;

public class Curso implements Oferta {
    private String nome;
    private int cargaHoraria;
    private int meses;
    private double valorHora;

    public Curso(String nome, int cargaHoraria, int meses, double valorHora) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.meses = meses;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPreco() {
        double preco =(cargaHoraria*meses)*valorHora;
        return preco;
    }
}
