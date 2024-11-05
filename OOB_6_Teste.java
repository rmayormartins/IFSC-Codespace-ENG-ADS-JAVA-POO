public class OOB_6_Teste {
    // Variável estática, compartilhada entre todas as instâncias
    public static int contador = 0;

    // Método estático que soma dois inteiros
    public static int somar(int a, int b) {
        contador++;  // Incrementa o contador toda vez que o método é chamado
        return a + b;
    }

    public static void main(String[] args) {
        // Chamadas ao método somar
        System.out.println("Soma: " + somar(2, 3)); // Retorna 5
        System.out.println("Contador: " + contador); // Retorna 1

        System.out.println("Soma: " + somar(10, 5)); // Retorna 15
        System.out.println("Contador: " + contador); // Retorna 2

        System.out.println("Soma: " + somar(7, 3)); // Retorna 10
        System.out.println("Contador: " + contador); // Retorna 3
    }
}

