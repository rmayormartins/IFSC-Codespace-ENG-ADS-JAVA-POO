// Classe Motor
public class Motor {
    int potencia; // Potência do motor
}

// Classe Carro
public class Carro {
    String marca; // Marca do carro
    Motor motor;  // O carro tem um motor

    // Método para mostrar os detalhes do carro
    void mostrarDetalhes() {
        System.out.println("Marca do carro: " + marca);
        System.out.println("Potência do motor: " + motor.potencia + " cavalos");
    }
}

// Método principal (main)
public class Main {
    public static void main(String[] args) {
        // Criando o motor e definindo a potência
        Motor motorDoCarro = new Motor();
        motorDoCarro.potencia = 100;

        // Criando o carro, definindo a marca e associando o motor
        Carro meuCarro = new Carro();
        meuCarro.marca = "Fiat";
        meuCarro.motor = motorDoCarro;

        // Mostrando os detalhes do carro
        meuCarro.mostrarDetalhes();
    }
}