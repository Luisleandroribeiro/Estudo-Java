package POO.Interface;

// Classe Main para testar
public class Main {
    public static void main(String[] args) {
        Pagamento pagamento1 = new CartaoCredito();
        Pagamento pagamento2 = new BoletoBancario();

        pagamento1.processarPagamento();
        pagamento2.processarPagamento();
    }
}
