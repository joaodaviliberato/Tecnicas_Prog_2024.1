package entities;

public class Quarto {
    public int numero;
    public String tipo;
    public String status;

    public Quarto(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.status = "disponivel";
    }

    public void reservar() {
        if (status.equals("disponivel")) {
            status = "reservado";
        } else {
            System.out.println("Quarto indisponivel para reserva");
        }
    }

    public void liberar() {
        if (status.equals("reservado")) {
            status = "disponivel";
        } else {
            System.out.println("Quarto ja esta disponivel");
        }
    }

    public void exibirDetalhes() {
        System.out.println("===== INFORMACOES DO QUARTO =====");
        System.out.println("Numero: " + numero + "\nTipo: " + tipo + "\nStatus: " + status + "\n");
    }
}
