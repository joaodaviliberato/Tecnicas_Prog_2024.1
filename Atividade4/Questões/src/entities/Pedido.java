package entities;

public class Pedido {
    public String nome;
    public String item;
    public int quantidade;

    public Pedido(String nome, String item, int quantidade) {
        this.nome = nome;
        this.item = item;
        this.quantidade = quantidade;
    }

    public void exibirPedido() {
        System.out.println("===== INFORMACOES DO PEDIDO =====");
        System.out.println("Nome: " + nome + "\nItem: " + item + "\nQuantidade: " + quantidade + "\n");
    }
}
