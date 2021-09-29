package POO_DH.aula22;

import java.util.ArrayList;
import java.util.List;

public class Programa implements Oferta{
    ArrayList<Curso> listaCursos;

    public Programa() {
        this.listaCursos = new ArrayList<>();
    }

    public void addListaCurso(Curso curso){
        listaCursos.add(curso);
    }

    @Override
    public double calcularPreco() {
        double preco =0;
        for (Curso curso:listaCursos) {
            preco += curso.calcularPreco();

        }
        return preco-(preco*0.20);

    }
}
