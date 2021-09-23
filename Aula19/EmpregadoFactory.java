package POO_DH.Aula19;

public class EmpregadoFactory {
    private static EmpregadoFactory instance;
    private EmpregadoFactory(){}
    public static EmpregadoFactory getInstance(){//precisa retornar o proprio objeto pra instanciar ele
        if(instance==null)//verifica se instancia é nula, só será criado como instance for chamado
            instance = new EmpregadoFactory(); //verifica em tempo de execucao pra consumir mesmo memoria
        return instance; //se ja foi criado ele só retorna instancia assim nao fica objetos iguais
    }
    public Empregado criarEmpregado(String tipo){
        if(tipo.equals("R"))
            return new EmpregadoRelacaoDep();
        else if(tipo.equals("C"))
            return new EmpregadoContratado();
        return null;
    }
}
