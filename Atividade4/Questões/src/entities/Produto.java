package entities;

public class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + "\nPreco: " + preco + "\n");
    }
}
