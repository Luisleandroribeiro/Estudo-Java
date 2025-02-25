package FundamentosJava.Casting;

public class Exercicio {
    public static void main(String[] args) {
        double numeroDecimal = 10.50;
        int numeroInteiroConvertido = (int) numeroDecimal; // Casting explícito
        int numeroInteiro = 4;
        double numeroDecimalConvertido = (double) numeroInteiro; // Casting explícito
        String numeroString = "10";
        int numeroStringConvertido = Integer.parseInt(numeroString); // Conversão de String para int

        System.out.println("Número decimal original: " + numeroDecimal);
        System.out.println("Número decimal convertido para inteiro: " + numeroInteiroConvertido);
        System.out.println("Número inteiro original: " + numeroInteiro);
        System.out.println("Número inteiro convertido para decimal: " + numeroDecimalConvertido);
        System.out.println("Número em formato String: " + numeroString);
        System.out.println("String convertida para número inteiro: " + numeroStringConvertido);
    }
}
