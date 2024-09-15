package aplication;

import java.util.Scanner;

public class Quest10 {
    public static Scanner sc;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero:");
        int num2 = sc.nextInt();
        System.out.println("Digite o terceiro numero:");
        int num3 = sc.nextInt();
        
        int maior = maiorNumero(num1, num2, num3);
        
        System.out.println("O maior numero eh: " + maior);
        
        sc.close();
    }
    public static int maiorNumero(int x, int y, int z) {
        sc = new Scanner(System.in);
        if (x == y || x == z || y == z) {
            while(x == y || x == z || y == z) {
                System.out.println("Ha numeros iguais. Digite novamente.");
                System.out.print("Digite o primeiro numero: ");
                x = sc.nextInt();
                System.out.print("Digite o segundo numero: ");
                y = sc.nextInt();
                System.out.print("Digite o terceiro numero: ");
                z = sc.nextInt();
            }
        }
        if (x > y && x > z) {
            return x;
        } else if (y > x && y > z) {
            return y;
        } else {
            return z;
        }
    }
}
