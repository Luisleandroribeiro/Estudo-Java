package POO.Encapsulamento;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        Pessoa pessoa1 = new Pessoa("Carlos", 25);

        // Exibindo as informações iniciais
        pessoa1.exibirInformacoes();

        // Modificando os valores usando setters
        pessoa1.setNome("Ana");
        pessoa1.setIdade(30);

        // Exibindo as informações atualizadas
        System.out.println("\nInformações atualizadas:");
        pessoa1.exibirInformacoes();
    }
}
