package POO_DH.aula20;

public class Sede implements Estado{
    private Tamangochi t;

    public Sede(Tamangochi t) {
        this.t = t;
    }

    @Override
    public void bebe() {
        System.out.println("bebendo");
    }

    @Override
    public void comer() {
        System.out.println("Tõ com sede");
    }

    @Override
    public void carinho() {
        System.out.println("Tô com sedeee");
    }
}
