package POO_DH.aula5;

public class Jogo{
    public static void main(String[] args) {
        UsuarioJogo usuario = new UsuarioJogo("Nathalia", "nath");
        System.out.println(usuario.getNome());
        System.out.println(usuario.getNickname());
        System.out.println(usuario.aumentarPontuacao());
        System.out.println(usuario.bonus(500));
        System.out.println(usuario.getPontuacao());
        System.out.println(usuario.bonus(600));
        System.out.println(usuario.getPontuacao());
        System.out.println(usuario.subirNivel());
        System.out.println(usuario.bonus(900));
        System.out.println(usuario.getPontuacao());
        System.out.println(usuario.subirNivel());
    }




}
