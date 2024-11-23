// Superclasse
class Veiculo {
    String marca;

    Veiculo(String marca) {
        this.marca = marca;
    }

    void mover() {
        System.out.println(marca + " está em movimento."); // Ação genérica
    }
}

// Subclasse
class Carro extends Veiculo {
    int portas;

    Carro(String marca, int portas) {
        super(marca); // Chama o construtor da superclasse
        this.portas = portas;
    }

    void buzinar() {
        System.out.println(marca + " está buzinando!"); // Ação exclusiva da subclasse
    }

    @Override
    void mover() {
        System.out.println(marca + " está dirigindo na estrada com " + portas + " portas."); // Ação especializada
    }
}

// Programa principal
public class HerancaVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Veículo Genérico");
        veiculo.mover(); // Ação genérica

        Carro carro = new Carro("Toyota", 4);
        carro.mover(); // Ação especializada
        carro.buzinar(); // Ação exclusiva da subclasse
    }
}
