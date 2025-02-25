package POO.Interface;

// Definição da interface Pagamento
interface Pagamento {
    void processarPagamento();
}

// Implementação da interface na classe CartaoCredito
class CartaoCredito implements Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento realizado com cartão de crédito");
    }
}

// Implementação da interface na classe BoletoBancario
class BoletoBancario implements Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento realizado com boleto bancário");
    }
}

