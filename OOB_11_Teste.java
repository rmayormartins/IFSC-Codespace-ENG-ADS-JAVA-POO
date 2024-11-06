public class OOB_11_Teste {
        public static void imprimirNumeros(int... numeros) {
            for (int numero : numeros) {
                System.out.println("Número: " + numero);
            }
        }
    
        public static void main(String[] args) {
            imprimirNumeros(1, 2, 3, 4, 5); // Imprime todos os números
        }
    }
    
