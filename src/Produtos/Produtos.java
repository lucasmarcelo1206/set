package Produtos;

import java.util.Comparator;

import java.util.Objects;

public class Produtos implements Comparable<Produtos> {

    private String nome;
    private long codigo;
    private Double preco;
    private int quantidade;

    public Produtos(String nome, long codigo, Double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public Double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produtos [nome=" + nome + ", codigo=" + codigo + ", preco=" + preco + ", quantidade=" + quantidade
                + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (codigo ^ (codigo >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produtos other = (Produtos) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }

    @Override
    public int compareTo(Produtos p) {
        // TODO Auto-generated method stub
        return nome.compareToIgnoreCase(p.getNome());
    }

}

class comparatorPorPreco implements Comparator<Produtos> {

    @Override
    public int compare(Produtos p1, Produtos p2) {

        return Double.compare(p1.getPreco(), p2.getPreco());
    }

}
