public class OOB_4_1_Teste {
    // Variável de classe (global) com acesso público
    public static int variavel = 50;

    public static int exemploLocal() {
        // Variável local com valor 10
        int variavel = 10;
        System.out.println("Variável local dentro do método: " + variavel);
        System.out.println("Variável global dentro do método: " + OOB_4_1_Teste.variavel);
        return variavel;  // Retorna a variável local
    }

    public static void main(String[] args) {
        // Chama o método exemploLocal
        exemploLocal();
        
        // Exibe a variável global no método main
        System.out.println("Variável global no main: " + variavel);
        
        // Chama o método exemploLocal novamente e imprime o valor retornado
        System.out.println("Variável local retornada pelo método: " + exemploLocal());
    }
}



