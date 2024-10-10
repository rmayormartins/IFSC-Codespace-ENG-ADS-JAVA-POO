public class B1_6Teste {
    public static void main(String[] args) {
        // Trabalhando com Character
        char letra1 = 'b';
        System.out.println("Maiúsculo: " + Character.toUpperCase(letra1));
        System.out.println("É digito? " + Character.isDigit(letra1));
        System.out.println("É letra? " + Character.isLetter(letra1));

        char letra2 = 'B';
        System.out.println("Maiúsculo: " + Character.toLowerCase(letra2));

    }

}
