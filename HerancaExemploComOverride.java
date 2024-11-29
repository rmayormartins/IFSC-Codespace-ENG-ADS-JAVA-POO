// Superclasse
class Animal {
    String nome;

    // Construtor da superclasse
    Animal(String nome) {
        this.nome = nome;
    }

    // Método genérico para todos os animais
    void fazerSom() {
        System.out.println(nome + " está fazendo um som.");
    }
}

// Subclasse
class Cachorro extends Animal {

    // Construtor da subclasse
    Cachorro(String nome) {
        super(nome); // Chama o construtor da superclasse
    }

    // Método exclusivo da subclasse
    void abanarRabo() {
        System.out.println(nome + " está abanando o rabo!");
    }

    @Override // Sobrescrevendo o método da superclasse
    void fazerSom() {
        System.out.println(nome + " está latindo!");
    }
}

// Programa principal
public class HerancaExemploComOverride {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal Genérico");
        animal.fazerSom(); // Usa o método genérico da superclasse

        Cachorro cachorro = new Cachorro("Rex");
        cachorro.fazerSom(); // Usa o método sobrescrito na subclasse
        cachorro.abanarRabo(); // Usa o método exclusivo da subclasse
    }
}

