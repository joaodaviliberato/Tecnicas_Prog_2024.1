package aplication;

import java.util.Scanner;

public class Quest11 {
    public static Scanner sc;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("====CADASTRO DE FUNCIONARIO====\n");
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite seu salario bruto: ");
        double salario = sc.nextDouble();
        System.out.println("\n====DADOS DO FUNCIONARIO====");
        System.out.println("Nome: " + nome);
        System.out.println("Salario bruto: " + salario + "\n");
        System.out.print("Quanto voce deseja aumentar o seu salario? (em porcentagem) ");
        double aumento = sc.nextDouble();
        salario *= (1 + aumento / 100);
        System.out.println("\n====DADOS ATUALIZADOS DO FUNCIONARIO====");
        System.out.println("Nome: " + nome);
        System.out.println("Salario bruto: " + salario);
    
        sc.close();
    }
}
