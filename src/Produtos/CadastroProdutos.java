package Produtos;

import java.util.Set;
import java.util.TreeSet;
import java.util.Collection;
import java.util.HashSet;

public class CadastroProdutos {

    Set<Produtos> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, Double preco, int quantidade) {
        produtosSet.add(new Produtos(nome, cod, preco, quantidade));
    }

    public Set<Produtos> exibirProdutosPorNome() {
        Set<Produtos> produtosPorNome = new TreeSet<>(produtosSet);
        return produtosPorNome;
    }

    public Set<Produtos> exibirPorPreco() {
        Set<Produtos> produtosPorPreco = new TreeSet<>(new comparatorPorPreco());
        produtosSet.addAll(produtosSet);
        return produtosPorPreco;
    }

}
