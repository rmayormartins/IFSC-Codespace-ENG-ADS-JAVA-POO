public class H2ExemploMetodoComRetorno {
    public static int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int resultado = somar(5, 3);
        System.out.println("Soma: " + resultado);
    }
}
