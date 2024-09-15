package entities;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    public List<Produto> produtos;

    public Loja() {
        this.produtos = new ArrayList<>();
    }

    public void registrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void exibirProdutos() {
        System.out.println("====== PRODUTOS EM ESTOQUE ======");
        for (Produto produto : produtos) {
            produto.exibirInfo();
        }
    }

    public double calcularEstoque() {
        double soma = 0;
        for (Produto produto : produtos) {
            soma += produto.getPreco();
        }
        return soma;
    }

}
