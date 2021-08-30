package POO_DH.aula10;

import java.util.Objects;

public class Asteroide extends Objeto{
    private int danos;

    public Asteroide(int posx, int posy, char direcao, int danos) {
        super(posx, posy, direcao);
        this.danos = danos;
    }

    @Override
    public void irA(int x, int y, char direcao) {
        super.irA(x, y, direcao);
    }

    public int getDanos() {
        return danos;
    }

    public void setDanos(int danos) {
        this.danos = danos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asteroide asteroide = (Asteroide) o;
        return danos == asteroide.danos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(danos);
    }

    @Override
    public String toString() {
        return "Asteroide{" +
                "danos=" + danos +
                '}';
    }
}
