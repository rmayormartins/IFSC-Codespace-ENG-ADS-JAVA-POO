public class OOB_12_Teste {
    public static void dividir(int a, int b) {
        try {
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero não é permitida.");
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        dividir(10, 2); // Sem erro
        dividir(10, 0); // Gera uma exceção
    }
}

