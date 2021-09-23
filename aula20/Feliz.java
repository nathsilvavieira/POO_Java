package POO_DH.aula20;

public class Feliz implements Estado{
    private Tamangochi t;

    public Feliz (Tamangochi t){
        this.t = t;
    }

    @Override
    public void bebe() {
        System.out.println(" beep beep beep beep beep");
        t.setEstado(new Sede(t));
    }

    @Override
    public void comer() {
        System.out.println("feliz");
        t.setEstado(new Fome(t));
    }

    @Override
    public void carinho() {
        System.out.println("carinho");
        t.setEstado(new Triste(t));
    }
}
