package FundamentosJava.EstruturasdeRepetição;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual tabuada até 10 você gostaria? ");
        int tabuada = sc.nextInt();

        for (int contador = 0; contador <= 10; contador++) {
            System.out.println(tabuada + " x " + contador + " = " + (tabuada * contador));
        }

        sc.close(); // Boa prática fechar o Scanner
    }
}
