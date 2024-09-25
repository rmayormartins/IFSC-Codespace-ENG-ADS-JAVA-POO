package Aulas;
public class A1ExemploTiposPrimitivosEString {
    public static void main(String[] args) {
        // Tipos primitivos
        int numeroInteiro = 1000;
        short numeroShort = 32000;
        byte numeroByte = 127;
        
        // String (não é um tipo primitivo)
        String texto = "Exemplo de texto";

        // Exibindo os valores
        System.out.println("Número inteiro (int): " + numeroInteiro);
        System.out.println("Número short: " + numeroShort);
        System.out.println("Número byte: " + numeroByte);
        System.out.println("Texto (String): " + texto);

        // Demonstrando limites
        System.out.println("\nLimites dos tipos:");
        System.out.println("Maior valor para int: " + Integer.MAX_VALUE);
        System.out.println("Menor valor para int: " + Integer.MIN_VALUE);
        System.out.println("Maior valor para short: " + Short.MAX_VALUE);
        System.out.println("Menor valor para short: " + Short.MIN_VALUE);
        System.out.println("Maior valor para byte: " + Byte.MAX_VALUE);
        System.out.println("Menor valor para byte: " + Byte.MIN_VALUE);

        // Operações simples
        int soma = numeroInteiro + numeroShort;
        System.out.println("\nSoma de int e short: " + soma);

        // Conversão de tipos (casting)
        byte byteConvertido = (byte)numeroInteiro;
        System.out.println("Int convertido para byte: " + byteConvertido);
    }
}