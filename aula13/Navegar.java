package POO_DH.aula13;

import java.util.Comparator;

public interface Navegar  {

    public default void navegar() {
        System.out.println("Navegando");
    }
    public boolean comparar(Embarcacao embarcacao);

}
