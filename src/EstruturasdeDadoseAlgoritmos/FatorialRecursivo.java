package EstruturasdeDadoseAlgoritmos;

import java.util.Scanner;

public class FatorialRecursivo {
    // Método recursivo para calcular o fatorial
    public static int fatorial(int n) {
        if (n == 1 || n == 0) { // Caso base: 1! = 1 e 0! = 1
            return 1;
        }
        return n * fatorial(n - 1); // Passo recursivo: n! = n × (n-1)!
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada do usuário
        System.out.print("Digite um número para calcular o fatorial: ");
        int num = sc.nextInt();

        // Verifica se o número é negativo
        if (num < 0) {
            System.out.println("Fatorial não definido para números negativos!");
        } else {
            int resultado = fatorial(num);
            System.out.println(num + "! = " + resultado);
        }

        sc.close();
    }
}
