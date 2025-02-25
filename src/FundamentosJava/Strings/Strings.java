package FundamentosJava.Strings;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome completo: ");
        String nome = sc.nextLine();  // Agora lê o nome inteiro

        String maiusculo = nome.toUpperCase();
        String minusculo = nome.toLowerCase();

        // Remove espaços e conta os caracteres sem espaços
        int quantidade = nome.replace(" ", "").length();

        // Pega o primeiro nome
        String primeiroNome = nome.split(" ")[0];

        System.out.println("Nome em Maiúsculas: " + maiusculo);
        System.out.println("Nome em Minúsculas: " + minusculo);
        System.out.println("Quantidade de caracteres (sem espaços): " + quantidade);
        System.out.println("Primeiro nome: " + primeiroNome);

        sc.close(); // Boa prática fechar o Scanner
    }
}
