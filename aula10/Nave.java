package POO_DH.aula10;

import java.util.Objects;

public class Nave extends Objeto{
    private double velocidade;
    private int vida;


    public Nave(int posx, int posy, char direcao, double velocidade) {
        super(posx, posy, direcao);
        this.velocidade = velocidade;
    }

    @Override
    public void irA(int x, int y, char direcao) {
        super.irA(x, y, direcao);
    }

    public String girar(char direcao) {
        //‘N’, 'S', 'E', 'O', (sul, norte, leste ou oeste)
        switch (direcao) {
            case 'N':
                return "Norte";
            case 'S':
                return "Sul";
            case 'E':
                return "Leste";
            case 'O':
                return "Oeste";
            default:
                return "insira uma direcao valida";

        }

    }


    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getVida() {
        return vida;
    }

    public int setVida(int vida){
        return this.vida = vida;
    }

    public String restaVida(int valor){
        return "Resta " + (this.vida = valor-1) + "vidas";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nave nave = (Nave) o;
        return Double.compare(nave.velocidade, velocidade) == 0 && vida == nave.vida;
    }

    @Override
    public int hashCode() {
        return Objects.hash(velocidade, vida);
    }

    @Override
    public String toString() {
        return "Nave{" +
                "velocidade=" + velocidade +
                ", vida=" + vida +
                '}';
    }
}
