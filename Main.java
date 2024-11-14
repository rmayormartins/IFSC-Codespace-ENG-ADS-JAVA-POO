// Classe Motor
class Motor {
    int potencia; // Potência do motor
    String tipoCombustivel; // Tipo de combustível

    void mostrarDetalhesMotor() {
        System.out.println("Potência do motor: " + potencia + " cavalos");
        System.out.println("Tipo de combustível: " + tipoCombustivel);
    }
}

// Classe Carro
class Carro {
    String marca; // Marca do carro
    Motor motor;  // O carro tem um motor
    void mostrarDetalhes() {
        System.out.println("Marca do carro: " + marca);
        motor.mostrarDetalhesMotor();
    }
}

// Método principal (main)
public class Main {
    public static void main(String[] args) {
        Motor motorDoCarro = new Motor();
        motorDoCarro.potencia = 100;
        motorDoCarro.tipoCombustivel = "Gasolina";

        Carro meuCarro = new Carro();
        meuCarro.marca = "Fiat";
        meuCarro.motor = motorDoCarro;

        meuCarro.mostrarDetalhes();
    }
}
