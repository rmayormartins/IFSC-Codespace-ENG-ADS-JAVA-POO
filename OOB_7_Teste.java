public class OOB_7_Teste {
    public static void contagemRegressiva(int n) {
        if (n <= 0) {  // Condição de parada
            System.out.println("Fim!");
            return;
        }
        System.out.println("Contagem: " + n);
        contagemRegressiva(n - 1); // Chamada recursiva
    }
    public static void main(String[] args) {
        contagemRegressiva(5); // Inicia a contagem a partir de 5
    }
}
