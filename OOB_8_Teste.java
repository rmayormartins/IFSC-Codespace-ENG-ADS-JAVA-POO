public class OOB_8_Teste {

    // Função FUNC1 com uma variável B local
    public static void FUNC1() {
        int B = -100;  // B local para FUNC1, isolado das outras variáveis B
        System.out.println("Valor de B dentro da função FUNC1: " + B);
    }

    // Função FUNC2 com outra variável B local
    public static void FUNC2() {
        int B = -200;  // B local para FUNC2, isolado das outras variáveis B
        System.out.println("Valor de B dentro da função FUNC2: " + B);
    }

    // Função principal (main)
    public static void main(String[] args) {
        int B = 10;  // B local para main
        System.out.println("Valor inicial de B no main: " + B);

        // Modifica o valor de B no main
        B = 20;
        FUNC1();  // Chama FUNC1 (o B em FUNC1 é independente)
        System.out.println("Valor de B no main após FUNC1: " + B);

        // Modifica o valor de B no main novamente
        B = 30;
        FUNC2();  // Chama FUNC2 (o B em FUNC2 é independente)
        System.out.println("Valor de B no main após FUNC2: " + B);
    }
}

