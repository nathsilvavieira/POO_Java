package POO_DH.aula13;

public class Iate extends Embarcacao implements Navegar{
    private int cabines;

    public Iate(Capitao capitao, double precoBase, double valorAdicional, int anoFabricacao, double comprimento, int cabines) {
        super(capitao, precoBase, valorAdicional, anoFabricacao, comprimento);
        this.cabines = cabines;
    }

    @Override
    public void navegar() {
        Navegar.super.navegar();
    }

    @Override
    public boolean comparar(Embarcacao iate) {
        if(this.cabines>=2){
            return true;
        }
        return false;
    }
}
