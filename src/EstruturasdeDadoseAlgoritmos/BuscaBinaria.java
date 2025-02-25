package EstruturasdeDadoseAlgoritmos;

import java.util.Scanner;

public class BuscaBinaria {
    // Método de busca binária iterativa
    public static int buscaBinaria(int[] array, int alvo) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (array[meio] == alvo) {
                return meio; // Retorna a posição do elemento encontrado
            } else if (array[meio] < alvo) {
                inicio = meio + 1; // Ajusta a busca para a metade direita
            } else {
                fim = meio - 1; // Ajusta a busca para a metade esquerda
            }
        }

        return -1; // Retorna -1 se o número não for encontrado
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array ordenado
        int[] numeros = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72};

        // Exibir os números disponíveis
        System.out.println("Array ordenado: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        // Solicita o número a ser buscado
        System.out.print("\nDigite o número que deseja buscar: ");
        int alvo = sc.nextInt();

        // Chama o método de busca binária
        int resultado = buscaBinaria(numeros, alvo);

        // Exibe o resultado
        if (resultado != -1) {
            System.out.println("Número encontrado na posição: " + resultado);
        } else {
            System.out.println("Número não encontrado.");
        }

        sc.close();
    }
}
