package aplication;

import java.util.Scanner;

public class Quest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int num = sc.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
        
        if (num > 10 && num < 20) {
            System.out.println("NUMERO ENTRE 10 E 20");
        } else {
            System.out.println("NUMERO NAO ESTA ENTRE 10 E 20");
        }
        sc.close();
    }
}
