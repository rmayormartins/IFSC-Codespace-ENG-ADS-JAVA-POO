public class A2EntradaSaida {
    public static void main(String[] args) {
        int x = 10;
        double y = 3.14159;
 
 
        // Exemplo: System.out.println()
        System.out.println("Exemplo: usando println()");
        System.out.println("O valor é " + x);
        System.out.println(); // Linha em branco para separação
 
 
        // Exemplo: System.out.printf() com inteiro
        System.out.println("Exemplo: usando printf() com inteiro");
        System.out.printf("O valor é %d\n", x);
        System.out.println(); // Linha em branco para separação
 
 
        // Exemplo: System.out.printf() com double formatado
        System.out.println("Exemplo: usando printf() com double formatado");
        System.out.printf("Pi com duas casas decimais: %.2f\n", y);
        System.out.println(); // Linha em branco para separação
 
 
        // Exemplo adicional: comparação direta
        System.out.println("Comparação direta:");
        System.out.println("println(): O valor é " + x + " e Pi é " + y);
        System.out.printf("printf(): O valor é %d e Pi é %.3f\n", x, y);
    }
 }
 