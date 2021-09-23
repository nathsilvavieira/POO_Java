package POO_DH.aula20.mesa;

public class Carregando implements EstadosCarrinho{
    Carrinho carrinho;

    public Carregando(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    @Override
    public void vazio() {
        carrinho.setEstadosCarrinho(new Vazio(carrinho));
        System.out.println("Carrinho vazio");
    }

    @Override
    public void carregando(Produto nomeProduto) {
        carrinho.addProduto(nomeProduto);
    }

    @Override
    public void pagando() {
    carrinho.setEstadosCarrinho(new Pagando(carrinho));
    }

    @Override
    public void fechado() {
        carrinho.setEstadosCarrinho(new Fechado(carrinho));
    }
}
