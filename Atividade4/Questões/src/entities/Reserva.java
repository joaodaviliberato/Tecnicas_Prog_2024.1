package entities;

public class Reserva {
    public String nome;
    public String destino;
    public int numeroReserva;

    public Reserva(String nome, String destino, int numeroReserva) {
        this.nome = nome;
        this.destino = destino;
        this.numeroReserva = numeroReserva;
    }

    public void exibirReserva() {
        System.out.println("Nome: " + nome + "\nDestino: " + destino + "\nNumero da reserva: " + numeroReserva + "\n");
    }
}
