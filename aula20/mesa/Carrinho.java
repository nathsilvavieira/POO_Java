package POO_DH.aula20.mesa;

import java.util.ArrayList;
import java.util.List;

public class Carrinho implements EstadosCarrinho {
    private EstadosCarrinho estadosCarrinho;
    private List<Produto> produtos = new ArrayList<>();

    public Carrinho() {
        this.estadosCarrinho = new Vazio(this); //lembrar de colocar this
    }

    public void addProduto(Produto nomeProduto){
        produtos.add(nomeProduto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public void vazio() {
    this.estadosCarrinho.vazio();
    }

    @Override
    public void carregando(Produto nomeProduto) {
    this.estadosCarrinho.carregando(nomeProduto);
    }

    @Override
    public void pagando() {
    this.estadosCarrinho.pagando();
    }

    public EstadosCarrinho getEstadosCarrinho() {
        return estadosCarrinho;
    }

    public void setEstadosCarrinho(EstadosCarrinho estadosCarrinho) {
        this.estadosCarrinho = estadosCarrinho;
    }

    @Override
    public void fechado() {
    this.estadosCarrinho.fechado();


    }
}
