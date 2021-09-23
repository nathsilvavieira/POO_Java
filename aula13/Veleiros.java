package POO_DH.aula13;

public class Veleiros extends Embarcacao implements Navegar{
    private int mastro;

    public Veleiros(Capitao capitao, double precoBase, double valorAdicional, int anoFabricacao, double comprimento, int mastro) {
        super(capitao, precoBase, valorAdicional, anoFabricacao, comprimento);
        this.mastro = mastro;
    }

    @Override
    public void navegar() {
        Navegar.super.navegar();
    }

    @Override
    public boolean comparar(Embarcacao veleiro) {

       if(this.mastro > 2 ){
            return true;
       }
        return false;
    }

    public int getMastro() {
        return mastro;
    }

    public void setMastro(int mastro) {
        this.mastro = mastro;
    }
}
