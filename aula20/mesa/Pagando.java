package POO_DH.aula20.mesa;

public class Pagando implements EstadosCarrinho{
        Carrinho carrinho;

    public Pagando(Carrinho carrinho) {
            this.carrinho = carrinho;
        }

        @Override
        public void vazio() {
            carrinho.setEstadosCarrinho(new Vazio(carrinho));
            System.out.println("Carrinho vazio");
        }

        @Override
        public void carregando(Produto nomeProduto) {
            System.out.println("Carrinho fechado " + nomeProduto+" nao pode ser adicionado");
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
