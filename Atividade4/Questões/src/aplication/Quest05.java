package aplication;

import java.util.Scanner;

public class Quest05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Digite o primeiro numero: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Digite o segundo numero: ");
        double num2 = sc.nextDouble();
        
        double media = calcularMedia(num1, num2);
        
        System.out.println(media);

        sc.close();
    }

    public static double calcularMedia(double x, double y) {
        return (x + y) / 2;
    }
}
