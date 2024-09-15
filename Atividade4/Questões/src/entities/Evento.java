package entities;

public class Evento {
    public String nome;
    public String local;
    public String data;

    public Evento(String nome, String local, String data) {
        this.nome = nome;
        this.local = local;
        this.data = data;
    }

    public void alterarLocal(String novoLocal) {
        this.local = novoLocal;
    }

    public void exibirDetalhes() {
        System.out.println("==== DETALHES DO EVENTO ====");
        System.out.println("Nome: " + nome + "\nLocal: " + local + "\nData: " + data + "\n");
    }
}
