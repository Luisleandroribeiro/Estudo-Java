package FundamentosJava.EstruturasCondicionais;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        if (idade < 18) {
            System.out.println("Você é menor de idade");
        } else if (idade >= 18 && idade <= 65) { // Correção aqui!
            System.out.println("Você é adulto");
        } else {
            System.out.println("Você é idoso");
        }

        sc.close(); // Boa prática fechar o Scanner
    }
}
