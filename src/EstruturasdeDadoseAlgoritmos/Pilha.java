package EstruturasdeDadoseAlgoritmos;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> pilha = new Stack<>();
        int menu;

        do {
            System.out.println("Seja bem-vindo ao menu ");
            System.out.println("Opções: ");
            System.out.println("1- Adicionar livro");
            System.out.println("2- Remover o último livro adicionado");
            System.out.println("3- Exibir o livro no topo");
            System.out.println("4- Mostrar todos os livros");
            System.out.println("0- Sair");
            System.out.print("Escolha uma opção: ");
            menu = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha

            switch (menu) {
                case 1:
                    System.out.print("Digite o nome do livro que você gostaria de adicionar: ");
                    String livro = sc.nextLine();
                    pilha.push(livro);
                    break;
                case 2:
                    if (!pilha.isEmpty()) {
                        System.out.println("Removendo o último livro adicionado: " + pilha.pop());
                    } else {
                        System.out.println("A pilha está vazia!");
                    }
                    break;
                case 3:
                    if (!pilha.isEmpty()) {
                        System.out.println("O livro que está no topo é: " + pilha.peek());
                    } else {
                        System.out.println("A pilha está vazia!");
                    }
                    break;
                case 4:
                    System.out.println("Todos os livros: " + pilha);
                    break;
                case 0:
                    System.out.println("Programa Finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (menu != 0);

        sc.close();
    }
}
