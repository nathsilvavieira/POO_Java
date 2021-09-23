package POO_DH.aula20;

public class Triste implements Estado{
    private Tamangochi t;

    public Triste(Tamangochi t) {
        this.t = t;
    }

    @Override
    public void bebe() {
        System.out.println("beep beep beep - pisca");

    }

    @Override
    public void comer() {
        System.out.println("beep beep - vomita");
    }

    @Override
    public void carinho() {
        t.setEstado(new Feliz(t));
    }
}
