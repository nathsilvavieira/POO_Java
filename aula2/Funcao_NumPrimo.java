package POO_DH.aula2;

public class Funcao_NumPrimo {

    public boolean eNumPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}


