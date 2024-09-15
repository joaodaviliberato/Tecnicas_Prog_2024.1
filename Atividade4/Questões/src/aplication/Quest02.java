package aplication;

import java.util.Scanner;

public class Quest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;

        do {
            System.out.print("Digite um numero: ");
            int num = sc.nextInt();
            soma += num;
            System.out.println("Soma atual: " + soma);
        } while (soma < 100);

        System.out.println("FIM!");

        sc.close();
    }
}
