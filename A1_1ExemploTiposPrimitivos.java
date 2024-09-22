public class A1_1ExemploTiposPrimitivos {
    public static void main(String[] args) {
        // Tipos inteiros
        byte numeroByte = 120;          // Tipo byte
        short numeroShort = 30000;      // Tipo short
        int numeroInt = 100000;         // Tipo int
        long numeroLong = 1000000000L;  // Tipo long (necessita do sufixo 'L') 

        // Tipos reais
        float numeroFloat = 5.75f;      // Tipo float (necessita do sufixo 'f')
        double numeroDouble = 19.99;    // Tipo double

        // Exibindo os valores das variáveis inteiras
        System.out.println("Número byte: " + numeroByte);
        System.out.println("Número short: " + numeroShort);
        System.out.println("Número int: " + numeroInt);
        System.out.println("Número long: " + numeroLong);

        // Exibindo os valores das variáveis reais
        System.out.println("Número float: " + numeroFloat);
        System.out.println("Número double: " + numeroDouble);
    }
}
