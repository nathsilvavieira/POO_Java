package POO_DH.aula2;

public class RefatoradoMaximo {
    public int maximoValor() {
        int maximo = 0;
        for (int i = 0; i < valor.length; i++) {
            if (valor[i] > maximo) {
                maximo = valor[i];
            }
        }
        return maximo;
    }
}
