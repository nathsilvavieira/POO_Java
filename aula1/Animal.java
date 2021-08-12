package POO_DH.aula1;

public class Animal {
    String nome;
    int idade;
    double qtCome;
    String comoComunica;
    Animal( String nome, int idade, double qtCome, String comoComunica){
        this.nome = nome;
        this.idade = idade;
        this.qtCome = qtCome;
        this.comoComunica = comoComunica;
    }
    public String getName(){
        return nome +" "+ idade +" anos";
    }

    public String getDescricao(){
        return nome + " come " +qtCome+" e faz " + comoComunica;
    }
}
