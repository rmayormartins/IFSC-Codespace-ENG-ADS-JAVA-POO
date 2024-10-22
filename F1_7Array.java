import java.util.Arrays;

public class F1_7Array {
    public static void main(String[] args) {
        // Criando arrays para demonstração
        int[] numeros = {5, 2, 8, 1, 9, 3, 7, 4, 6};
        int[] numeros2 = {1, 3, 2, 4, 6, 5, 7, 8, 9};
        String[] frutas = {"maçã", "banana", "laranja", "uva", "pera"};
        int[] numerosCopiados = new int[5];


        //Ordenação
        System.out.println("Ordenação:");
        Arrays.sort(numeros);
        Arrays.sort(numeros2);
        System.out.println("Array ordenado: " + Arrays.toString(numeros));


        // Comparação de arrays
        System.out.println("\nComparação de arrays:");
        System.out.println("Arrays iguais? " + Arrays.equals(numeros, numeros2));


        // Ordenação string
        System.out.println("\nOrdenação string:");
        Arrays.sort(frutas, 0, 3);
        System.out.println("Frutas parcialmente ordenadas: " + Arrays.toString(frutas));


        // Preenchimento de parte do array
        System.out.println("\nPreenchimento de parte do array:");
        Arrays.fill(numeros, 1, 4, 0);
        System.out.println("Array com parte preenchida: " + Arrays.toString(numeros));
       
        // Obtendo hash code do array
        //hashCode(): Gera um código hash para o array, útil em coleções baseadas em hash.
        System.out.println("\nHash code do array:");
        int hashCode = Arrays.hashCode(numeros);
        System.out.println("Hash code do array numeros: " + hashCode);

        //Criando stream a partir do array
        //stream(): Cria um stream a partir do array, permitindo operações funcionais como sum().
        System.out.println("\nUsando stream para processar o array:");
        int soma = Arrays.stream(numeros).sum();
        System.out.println("Soma dos elementos: " + soma);

        //Verificando se todos os elementos atendem a uma condição
        //allMatch(): Verifica se todos os elementos do array atendem a uma condição específica.
        System.out.println("\nVerificando condição em todos os elementos:");
        boolean todosMaioresQueZero = Arrays.stream(numeros).allMatch(n -> n > 0);
        System.out.println("Todos os números são maiores que zero? " + todosMaioresQueZero);

        //Exibição de array multidimensional
        System.out.println("\nExibição de array multidimensional:");
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Matriz: " + Arrays.deepToString(matriz));

    }
}
