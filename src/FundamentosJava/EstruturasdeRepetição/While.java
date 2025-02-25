package FundamentosJava.EstruturasdeRepetição;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0; // Variável para armazenar a soma dos números

        System.out.println("Digite números para somar. Para parar, digite 0:");

        while (true) { // Loop infinito, interrompido com break
            int numero = sc.nextInt();
            if (numero == 0) {
                break; // Sai do loop quando o usuário digita 0
            }
            soma += numero; // Acumula a soma dos números
        }

        System.out.println("Soma total: " + soma);

        sc.close(); // Boa prática fechar o Scanner
    }
}
