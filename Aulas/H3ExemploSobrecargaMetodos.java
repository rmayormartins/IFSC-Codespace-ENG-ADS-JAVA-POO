package Aulas;
public class H3ExemploSobrecargaMetodos {
    public static int somar(int a, int b) {
        return a + b;
    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Soma de inteiros: " + somar(5, 3));
        System.out.println("Soma de doubles: " + somar(5.5, 3.3));
    }
}
