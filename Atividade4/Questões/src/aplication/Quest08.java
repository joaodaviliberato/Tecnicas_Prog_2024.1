package aplication;

import java.util.Scanner;

public class Quest08 {
    public static Scanner sc;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Digite um numero inteiro nao negativo para calcular seu fatorial: ");
        
        int num = sc.nextInt();
        
        int fatorial = calcularFatorial(num);
        
        System.out.println(fatorial);

        sc.close();
    }
    public static int calcularFatorial(int num) {
        int fatorial = 1;
        sc = new Scanner(System.in);
        if (num == 0) {
            return 1;
        } else if (num < 0) {
            while (num < 0) {
                System.out.println("Nao existe fatorial de numero negativo. Tente novamente.");
                System.out.print("Digite um numero positivo: ");
                num = sc.nextInt();
            }
        }
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
