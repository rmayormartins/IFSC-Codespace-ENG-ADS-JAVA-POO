import java.util.Arrays;

public class F1_7_BTeste {
    public static void main(String[] args) {
        // Criando arrays para demonstração
        int[] numeros = {5, 2, 8, 1, 9, 3, 7, 4, 6};
        String[] frutas = {"maçã", "banana", "laranja", "uva", "pera"};

        // 6. Criação de array com streams
        System.out.println("6. Criação de array com streams:");
        int[] quadrados = Arrays.stream(numeros).map(n -> n * n).toArray();
        System.out.println("Quadrados dos números: " + Arrays.toString(quadrados));

        // 7. Ordenação parcial
        System.out.println("\n7. Ordenação parcial:");
        Arrays.sort(frutas, 0, 3);
        System.out.println("Frutas parcialmente ordenadas: " + Arrays.toString(frutas));

        // 8. Preenchimento de parte do array
        System.out.println("\n8. Preenchimento de parte do array:");
        Arrays.;
        System.out.println("Array com parte preenchida: " + Arrays.toString(numeros));

        // 9. Exibição de array multidimensional
        System.out.println("\n9. Exibição de array multidimensional:");
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Matriz: " + Arrays.deepToString(matriz));

        // 10. Verificação de igualdade profunda
        System.out.println("\n10. Verificação de igualdade profunda:");
        int[][] matriz2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Matrizes iguais? " + Arrays.deepEquals(matriz, matriz2));
    }
}