package EstruturasdeDadoseAlgoritmos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Adicionar pessoa à fila");
            System.out.println("2 - Atender (remover) a primeira pessoa da fila");
            System.out.println("3 - Mostrar quem está na frente da fila");
            System.out.println("4 - Exibir a fila completa");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da pessoa: ");
                    String nome = sc.nextLine();
                    fila.add(nome);
                    System.out.println(nome + " foi adicionado à fila.");
                    break;
                case 2:
                    if (!fila.isEmpty()) {
                        System.out.println("Atendendo: " + fila.poll());
                    } else {
                        System.out.println("A fila está vazia!");
                    }
                    break;
                case 3:
                    if (!fila.isEmpty()) {
                        System.out.println("Quem está na frente: " + fila.peek());
                    } else {
                        System.out.println("A fila está vazia!");
                    }
                    break;
                case 4:
                    System.out.println("Fila atual: " + fila);
                    break;
                case 0:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
