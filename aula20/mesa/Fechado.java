package POO_DH.aula20.mesa;

public class Fechado implements EstadosCarrinho{
    Carrinho carrinho;

    public Fechado(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    @Override
    public void vazio() {
        carrinho.setEstadosCarrinho(new Vazio(carrinho));
        System.out.println("Carrinho vazio");
    }

    @Override
    public void carregando(Produto nomeProduto) {
        System.out.println("Carrinho não pode aceitar mais produtos, para continuar a sua compra inicie um novo carrinho");
    }

    @Override
    public void pagando() {
        carrinho.setEstadosCarrinho(new Pagando(carrinho));
    }

    @Override
    public void fechado() {
        carrinho.setEstadosCarrinho(new Fechado(carrinho));
        System.out.println("Carrinho fechado");
    }
}
