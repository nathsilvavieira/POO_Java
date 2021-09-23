package POO_DH.aula20.mesa;

import java.util.ArrayList;
import java.util.List;

public class Vazio implements EstadosCarrinho{
    Carrinho carrinho;

    public Vazio(Carrinho carrinho) {
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
        carrinho.setEstadosCarrinho(new Carregando(carrinho));
    }

    @Override
    public void pagando() {
        System.out.println("Carrinho vazio, adicione produtos para pagar.");
    }

    @Override
    public void fechado() {
        System.out.println("Carrinho esta vazio, inicie uma compra para fechar.");
    }
}
