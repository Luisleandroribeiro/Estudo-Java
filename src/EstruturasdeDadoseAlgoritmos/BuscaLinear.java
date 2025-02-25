package EstruturasdeDadoseAlgoritmos;

import java.util.Scanner;

public class BuscaLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        // Recebendo 10 números do usuário
        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Recebendo o número-alvo
        System.out.print("\nDigite o número que deseja buscar: ");
        int alvo = sc.nextInt();
        boolean encontrado = false;
        int posicao = -1;

        // Algoritmo de busca linear
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == alvo) {
                encontrado = true;
                posicao = i;
                break; // Interrompe a busca ao encontrar o número
            }
        }

        // Exibir resultado da busca
        if (encontrado) {
            System.out.println("Número encontrado na posição: " + posicao);
        } else {
            System.out.println("Número não encontrado.");
        }

        sc.close();
    }
}
