package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quest03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            int num = sc.nextInt();
            lista.add(num);
        }
        
        System.out.println(lista);
        
        sc.close();
    }
}
