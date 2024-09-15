package entities;

public class Veiculo {
    public String placa;
    public String modelo;
    public String status;

    public Veiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
        this.status = "disponivel";
    }

    public void alugar() {
        if (status.equals("disponivel")) {
            status = "alugado";
        } else {
            System.out.println("Veiculo indisponivel para aluguel");
        }
    }

    public void devolver() {
        if (status.equals("alugado")) {
            status = "disponivel";
        } else {
            System.out.println("Veiculo ja esta disponivel");
        }
    }

    public void exibirDetalhes() {
        System.out.println("===== INFORMACOES DO VEICULO =====");
        System.out.println("Placa: " + placa + "\nModelo: " + modelo + "\nStatus: " + status + "\n");
    }


}
