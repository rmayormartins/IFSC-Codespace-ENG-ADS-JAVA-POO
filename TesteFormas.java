// Código 2.4.3 - Polimorfismo com interfaces
interface Forma {
    double calcularArea();
}

class Circulo implements Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

class Retangulo implements Forma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}

public class TesteFormas {
    public static void main(String[] args) {
        Forma forma1 = new Circulo(5);
        Forma forma2 = new Retangulo(4, 6);

        System.out.println("Área do círculo: " + forma1.calcularArea());
        System.out.println("Área do retângulo: " + forma2.calcularArea());
    }
}
