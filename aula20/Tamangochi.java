package POO_DH.aula20;

public class Tamangochi implements Estado{
    private Estado estado;

    public Tamangochi(){
        this.estado = new Feliz(this); //recebe o proprio objeto como parametro
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public void bebe() {
    this.estado.bebe();
    }

    @Override
    public void comer() {
    this.estado.comer();
    }

    @Override
    public void carinho() {
    this.estado.carinho();
    }
}
