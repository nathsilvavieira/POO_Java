package POO_DH.aula2;

import java.util.List;

public class RefatoradoMaximo {
    public Integer maximoValor(List<Integer> lista) {
        Integer maximo = 0;
        for (Integer i = 1; i < lista.size(); i++) {
            if (lista.get(i) > maximo){
                maximo = lista.get(i);
            }
        }
        return maximo;
    }
}
