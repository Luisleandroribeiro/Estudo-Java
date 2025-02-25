package FundamentosJava.OperadoresMatemáticos;

import java.util.Scanner;

public class Exercício {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora");

        System.out.print("Digite um número: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int numero2 = sc.nextInt();
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = (double) numero1 / numero2;
        int resto = numero1 % numero2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.printf("Divisão: %.2f%n", divisao); // Exibe apenas 2 casas decimais
        System.out.println("Resto: " + resto);

        sc.close();
    }
}


