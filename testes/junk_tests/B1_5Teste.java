public class B1_5Teste {
    public static void main(String[] args) {
        // Trabalhando com Integer
        int numero = 10;
        System.out.println("Binário: " + Integer.toBinaryString(numero));  // Binário
        System.out.println("Hexadecimal: " + Integer.toHexString(numero)); // Hexadecimal

        // Trabalhando com Float
        float numeroFloat = 3.14f;
        System.out.println("Hexadecimal de float: " + Float.toHexString(numeroFloat));

        // Trabalhando com Character
        char letra = 'b';
        System.out.println("Maiúsculo: " + Character.toUpperCase(letra));

    }
}