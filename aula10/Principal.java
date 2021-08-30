package POO_DH.aula10;

public class Principal {
    public static void main(String[] args) {
        Nave nave = new Nave(40,40 ,'N',10);
        Asteroide asteroide = new Asteroide(50,35,'N',0);

        System.out.println(nave.setVida(5));
        System.out.println(nave.girar('O'));
        System.out.println(nave);
        System.out.println(asteroide);
        // Felipe Araujo, Pedro Marchi, Rafael Caires
    }



}
