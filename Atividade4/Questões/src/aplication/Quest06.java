package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quest06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            int num = sc.nextInt();
            lista.add(num);
        }
        
        int soma = somaImpares(lista);
        
        System.out.println("A soma dos numeros impares eh: " + soma);

        sc.close();
    }
    public static int somaImpares(List<Integer> lista) {
        int soma = 0;
        for (int num : lista) {
            if (num % 2 != 0) {
                soma += num;
            }
        }
        return soma;
    }
}
