package EstruturasdeDadoseAlgoritmos;

import java.util.Scanner;

public class ArraysEListas {
    public static void main(String[] args) {
        //Crie um programa que recebe 10 números inteiros do usuário, armazena-os em um array, e depois:
        //✅ Exibe todos os números.
        //✅ Exibe o maior e o menor número da lista.
        //✅ Exibe a soma e a média dos números.
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0, maior, menor;

        // Recebendo os números do usuário
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        // Inicializando maior e menor com o primeiro elemento do array
        maior = menor = numeros[0];

        // Determinando o maior e o menor número
        for (int i = 1; i < 10; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Calculando a média
        double media = soma / 10.0;

        // Exibindo os resultados
        System.out.println("\nNúmeros digitados:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println("\nMaior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Soma dos números: " + soma);
        System.out.printf("Média dos números: %.2f\n", media);

        scanner.close();
    }
}
