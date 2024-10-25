import java.util.Arrays;

public class F1_7_1Teste {
    public static void main(String[] args) {
        // Criando arrays para demonstração
        int[] numeros = {5, 2, 8, 1, 9, 3, 7, 4, 6};
        int[] numerosCopiados = new int[5];

        // 1. Ordenação //chama o método para ordenar e depois usa para converter tudo em string
        System.out.println("1. Ordenação:");
        Arrays.sort(numeros);
        System.out.println("Array ordenado: " + Arrays.toString(numeros));

        // 2. Busca binária (requer array ordenado) //Aponta qual é o indice do numero 7
        System.out.println("\n2. Busca binária:");
        int indice = Arrays.binarySearch(numeros, 7);
        System.out.println("Índice do número 7: " + indice);

        // 3. Preenchimento de array //completa um array com um determinado valor
        System.out.println("\n3. Preenchimento de array:");
        Arrays.fill(numerosCopiados, 42);
        System.out.println("Array preenchido: " + Arrays.toString(numerosCopiados));

        // 4. Cópia de array //
        System.out.println("\n4. Cópia de array:");
        int[] numerosCopia = Arrays.copyOf(numeros, numeros.length);
        System.out.println("Cópia do array: " + Arrays.toString(numerosCopia));

        // 5. Comparação de arrays
        System.out.println("\n5. Comparação de arrays:");
        System.out.println("Arrays iguais? " + Arrays.equals(numeros, numerosCopia));
    }
}
