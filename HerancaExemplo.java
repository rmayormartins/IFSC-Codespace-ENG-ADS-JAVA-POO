// Superclasse
class Animal {
    String nome;

    Animal(String nome) { // Construtor da superclasse
        this.nome = nome;
    }

    void fazerSom() {
        System.out.println(nome + " está fazendo um som.");
    }
}

// Subclasse
class Cachorro extends Animal {

    Cachorro(String nome) { // Construtor da subclasse
        super(nome); // Chama o construtor da superclasse
    }

    void abanarRabo() {
        System.out.println(nome + " está abanando o rabo!");
    }

    @Override // Sobrescreve o método da superclasse
    void fazerSom() {
        System.out.println(nome + " está latindo!");
    }
}

// Programa principal
public class HerancaExemplo {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal Genérico");
        animal.fazerSom(); // Usa o método genérico da superclasse

        Cachorro cachorro = new Cachorro("Rex");
        cachorro.fazerSom(); // Usa o método sobrescrito na subclasse
        cachorro.abanarRabo(); // Usa o método exclusivo da subclasse
    }
}