package POO_DH.aula10;

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
}
