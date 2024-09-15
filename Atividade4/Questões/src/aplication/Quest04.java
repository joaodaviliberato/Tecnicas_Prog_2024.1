package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quest04 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<String> lista = new ArrayList<>();
        
        for(int i = 0; i < 5; i++) {
            System.out.print("Digite um nome: ");
            String nome = sc.nextLine();
            lista.add(nome);
        }
        
        lista.sort(null);
        
        System.out.println(lista);

        sc.close();
    }
}
