package POO_DH.Aula19;

public class Main {
    public static void main(String[] args) {
        Empresa dh = new Empresa("55555");
        EmpregadoFactory factory =  EmpregadoFactory.getInstance();
        dh.addEmpregado(factory.criarEmpregado("R"));
        dh.addEmpregado(factory.criarEmpregado("C"));

    }
}
