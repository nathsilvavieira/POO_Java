package POO_DH.aula20;

public class Fome implements Estado{
    private Tamangochi t;

    public Fome(Tamangochi t) {
        this.t = t;
    }
    @Override
    public void bebe() {
        t.setEstado(new Feliz(t));
    }

    @Override
    public void comer() {
        t.setEstado(new Feliz(t));
    }

    @Override
    public void carinho() {
        System.out.println("To com fome");
    }
}
