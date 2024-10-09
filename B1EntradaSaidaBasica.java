import java.util.Scanner;

public class B1_4Teste {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
     
       System.out.print("Digite um número inteiro: ");
       int numero = scanner.nextInt();
     
       // Exibindo os valores em diferentes bases
       System.out.println("Valor em decimal: " + numero);
       System.out.println("Valor em octal: " + Integer.toOctalString(numero));  // Converte para octal
       System.out.println("Valor em hexadecimal: " + Integer.toHexString(numero));  // Converte para hexadecimal
       System.out.println("Valor em binário: " + Integer.toBinaryString(numero));  // Converte para binário
     
       scanner.close();
   }
}
