package entities;

public class SessaoCinema {
    public String filme;
    public String horario;
    public int ingressosDisponiveis;

    public SessaoCinema(String filme, String horario, int ingressosDisponiveis) {
        this.filme = filme;
        this.horario = horario;
        this.ingressosDisponiveis = ingressosDisponiveis;
    }

    public void venderIngresso(int quantidade) {
        if(ingressosDisponiveis > 0 && ingressosDisponiveis >= quantidade) {
            ingressosDisponiveis -= quantidade;
            System.out.println("Ingresso(s) vendido com sucesso!");
        } else {
            System.out.println("Nao ha ingressos suficientes disponiveis!");
        }
    }

    public void exibirDetalhes() {
        System.out.println("===== INFORMACOES DA SESSAO =====");
        System.out.println("Filme: " + filme + "\nHorario: " + horario + "\nIngressos disponiveis: " + ingressosDisponiveis + "\n");
    }
}
