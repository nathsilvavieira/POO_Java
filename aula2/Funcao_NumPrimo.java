package POO_DH.aula2;

public class Funcao_NumPrimo {
    int num;
    int contador;


    public boolean eNumPrimo(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador++;
            }
        }
        if (contador == 2)
            return true;
        return false;

    }
}


