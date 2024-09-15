package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quest07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        List<Integer> lista = new ArrayList<>();
        int positivos = 0;
        int negativos = 0;
        int zeros = 0;
        boolean temPrimo = false;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            int num = sc.nextInt();
            lista.add(num);
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                zeros++;
            }
            if (numeroPrimo(num)) {
                temPrimo = true;
            }
        }
        System.out.println("Quantidade de positivos: " + positivos);
        System.out.println("Quantidade de negativos: " + negativos);
        System.out.println("Quantidade de zeros: " + zeros);
        if (temPrimo) {
            System.out.println("Tem numero primo na lista");
        } else {
            System.out.println("Nao tem numero primo na lista");
        }

        sc.close();
    }
    public static boolean numeroPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
