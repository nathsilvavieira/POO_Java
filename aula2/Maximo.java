package POO_DH.aula2;

import java.lang.reflect.Parameter;

public class Maximo {
      public int maximoEntreTresNumeros(int numeroA, int numeroB, int numeroC){
        int valorMaximo = 0;
        if(numeroA>valorMaximo) {
            valorMaximo = numeroA;
        }
        if(numeroB>valorMaximo){
            valorMaximo=numeroB;
        }
        if(numeroC>valorMaximo){
            valorMaximo=numeroC;
        }
        return valorMaximo;
      }



}
