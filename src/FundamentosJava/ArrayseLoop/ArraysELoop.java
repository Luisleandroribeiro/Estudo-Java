package FundamentosJava.ArrayseLoop;

import java.util.ArrayList;

public class ArraysELoop {
    public static void main(String[] args) {
        // Criar um ArrayList com 10 números inteiros
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numeros.add(i); // Adiciona todos os números de 1 a 10
        }

        System.out.print("Números pares: ");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
