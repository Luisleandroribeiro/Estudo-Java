package POO.Herança;

// Classe Main para testar
public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 3);
        Gato gato = new Gato("Mingau", 2);

        System.out.println(cachorro.nome + " diz: ");
        cachorro.emitirSom();

        System.out.println(gato.nome + " diz: ");
        gato.emitirSom();
    }
}
