package entities;

public class Livro {
    String nome;
    String autor;
    String status;

    public Livro(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
        this.status = "disponivel";
    }

    public void emprestarLivro() {
        if (status.equals("disponivel")) {
            status = "emprestado";
        } else {
            System.out.println("Livro indisponível para empréstimo");
        }
    }

    public void devolverLivro() {
        if (status.equals("emprestado")) {
            status = "disponivel";
        } else {
            System.out.println("Livro já está disponível");
        }
    }

    public void exibirLivro() {
        System.out.println("===== INFORMACOES DO LIVRO =====");
        System.out.println("Nome: " + nome + "\nAutor: " + autor + "\nStatus: " + status + "\n");
    }

}
