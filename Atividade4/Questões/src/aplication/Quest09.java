package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quest09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Integer> lista = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            int num = sc.nextInt();
            lista.add(num);
        }
        
        List<Integer> listaCubos = listaCubo(lista);
        
        System.out.println(listaCubos);
    
        sc.close();
    }
    public static List<Integer> listaCubo(List<Integer> lista) {
        List<Integer> listaNova = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            listaNova.add((int) Math.pow(lista.get(i), 3));
        }
        return listaNova;
    }
}
