package entities;

public class ContaBancaria {
    public int numero;
    public String titular;
    public double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if(valor < saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!\n");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo + "\n");
    }

}
