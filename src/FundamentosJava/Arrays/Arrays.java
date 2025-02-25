package FundamentosJava.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> notas = new ArrayList<>(); // Correção da declaração da lista

        System.out.println("Digite as 5 notas: ");
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            int nota = sc.nextInt();
            notas.add(nota); // Adiciona a nota à lista
            soma += nota; // Soma as notas
        }

        double media = (double) soma / notas.size(); // Calcula a média
        System.out.println("Notas: " + notas);
        System.out.println("Média: " + media);

        sc.close(); // Boa prática fechar o Scanner
    }
}
