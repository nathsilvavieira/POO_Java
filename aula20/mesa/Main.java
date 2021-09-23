package POO_DH.aula20.mesa;

public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        Produto pao = new Produto("Pao Frances");
        carrinho.addProduto(pao);
        System.out.println(carrinho.getEstadosCarrinho().getClass());
        System.out.println(carrinho);
        carrinho.carregando(pao);
        carrinho.addProduto(pao);
        carrinho.pagando();
        System.out.println(carrinho.getEstadosCarrinho().getClass());

    }
}
